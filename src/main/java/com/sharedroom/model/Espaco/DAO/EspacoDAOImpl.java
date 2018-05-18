package com.sharedroom.model.Espaco.DAO;

import com.sharedroom.model.Espaco.EspacoVO;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Roberto Affonso, created on 5/11/18
 **/
@Repository("espacoDao")
public class EspacoDAOImpl 
implements EspacoDAO  {
    public static final String TABLE_NAME = "tb_espaco";
    public static final String TB_IDT_ESPACO = "idt_espaco";
    public static final String TB_COL_AREA_ESPACO = "area_espaco";
    public static final String TB_COL_CEP_ESPACO = "cep_espaco";
    public static final String TB_COL_HOSPEDES_ESPACOS = "qtd_hospedes_espaco";
    public static final String TB_COL_END_ESPACO = "end_espaco";
    
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
	public void setDataSource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
    
    public String generateSelectAllSql(){
        StringBuilder sb = new StringBuilder("SELECT * FROM " + TABLE_NAME);
        return sb.toString();
    }
    
	@Override
	public List<EspacoVO> getEspacos() {
		String sql = generateSelectAllSql();
		List<EspacoVO> espacos = jdbcTemplate.query(sql, new EspacoRowMapper());
		return espacos;
	}

	@Override
	public EspacoVO getEspaco(Integer id) {
		String sql = generateSelectAllSql();
		sql += TABLE_NAME + " WHERE " + TB_IDT_ESPACO + " = ?";
    	Object[] args = new Object[] {id};
    	EspacoVO espaco = jdbcTemplate.queryForObject(sql, args, new EspacoRowMapper());
    	return espaco;
	}

	public String generateInsertSql() {
		StringBuilder sb = new StringBuilder("INSERT INTO " + TABLE_NAME );
		sb.append("(")
		.append(TB_COL_AREA_ESPACO).append(", ")
		.append(TB_COL_CEP_ESPACO).append(", ")
		.append(TB_COL_HOSPEDES_ESPACOS).append(", ")
		.append(TB_COL_END_ESPACO).append(", ")
		.append(TB_IDT_ESPACO).append(") ")
		.append("VALUES (?, ?, ?, ?, ?)");
		
		return sb.toString();
	}
	
	@Override
	public boolean createEspaco(EspacoVO espaco) {
		String sql = generateInsertSql();
    	Object[] args = {espaco.getAreaEspaco(),
    			         espaco.getCep(),
    			         espaco.getQtdHospedes(),
    			         espaco.getEnderecoEsp(),
    			         espaco.getIdt()};
    	return jdbcTemplate.update(sql, args) == 1;
	}
	
	public String generateUpdateSql() {
        StringBuilder sb = new StringBuilder("UPDATE " + TABLE_NAME + " ")
                .append("SET ")
                .append(TB_COL_AREA_ESPACO).append("= ?, ")
                .append(TB_COL_CEP_ESPACO).append("= ?, ")
                .append(TB_COL_HOSPEDES_ESPACOS).append("= ?, ")
                .append(TB_COL_END_ESPACO).append("= ? ")
                .append("WHERE ")
                .append(TB_IDT_ESPACO).append(" = ?");
        return sb.toString();
    }
	
	@Override
	public boolean updateEspaco(EspacoVO espaco) {
		String sql = generateUpdateSql();
        Object[] args = new Object[] {espaco.getAreaEspaco(),
        							  espaco.getCep(),
        							  espaco.getQtdHospedes(),
        							  espaco.getEnderecoEsp(),
        							  espaco.getIdt()};
        return jdbcTemplate.update(sql, args) == 1;
	}
	
	public String generateDeleteSql() {
        StringBuilder sb = new StringBuilder("DELETE FROM " + TABLE_NAME + " ");
        sb.append(TB_IDT_ESPACO).append(" = ?");
        return sb.toString();
    }

	@Override
	public boolean deleteEspaco(EspacoVO espaco) {
		String sql = generateDeleteSql();
		Object[] args = new Object[] {espaco.getIdt()};
		return jdbcTemplate.update(sql, args) == 1;
	}

}
