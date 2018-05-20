package com.sharedroom.model.Comodidades.DAO;

/*
 * @Author Vitor Hugo
*/
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sharedroom.model.Anuncio.AnuncioVO;
import com.sharedroom.model.Comodidades.DAO.ComodidadesRowMapper;
import com.sharedroom.model.Comodidades.ComodidadesVO;
import com.sharedroom.model.Comodidades.*;


@Repository
@Transactional
public class ComodidadesDAO {

	
	private static final String TABLE_COMODIDADES = "tb_anuncio";
	private static final String COL_IDT_COMODIDADES = "idt_anuncio";
	private static final String COL_NME_COMODIDADES = "nme_anuncio";

	
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public void setDataSource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	private String getSelectAllSql()
	{
		StringBuilder sb = new StringBuilder("SELECT ");
		sb.append(COL_NME_COMODIDADES).append(" ")
		.append("FROM ").append(TABLE_COMODIDADES);	
		return sb.toString();
	}
	
	public ComodidadesVO dbLoad(Integer idt)  {
    	String sql = "SELECT * FROM  " + TABLE_COMODIDADES;
    	Object[] args = new Object[] {idt};
    	ComodidadesVO comodidade = (ComodidadesVO) jdbcTemplate.query(sql, new ComodidadesRowMapper());
    	return comodidade;
}
	
public List<ComodidadesVO> dbLoadAll ()  {
	String sql = "SELECT * FROM " + TABLE_COMODIDADES;
	List<ComodidadesVO> espList = jdbcTemplate.query(sql, new ComodidadesRowMapper());
	return espList;
}
	
	
	private String getInsertSql()
	{
		StringBuilder sb = new StringBuilder("INSERT INTO ");
		sb.append(TABLE_COMODIDADES).append(" ").append("(")
		.append(COL_NME_COMODIDADES).append(") ")
		.append("VALUES (?)");		
		return sb.toString();
	}
	
    public void dbInsert(ComodidadesVO comodidades) throws SQLException {
    try {
        String sql= getInsertSql(); 
        Object[] args = new Object[] {comodidades.getNome()};
        jdbcTemplate.update(sql, args);
    }catch (Exception ex){
        ex.printStackTrace();
        throw ex;
    }
} 
	
	private String getUpdateSql()
	{
		StringBuilder sb = new StringBuilder("UPDATE " + TABLE_COMODIDADES + " ");
		sb.append(" SET ").append(COL_NME_COMODIDADES).append(" = ?").append( "WHERE ")
		.append(COL_IDT_COMODIDADES).append(" = ?");
		return sb.toString();
	}
	
    public void dbUpdate(ComodidadesVO comodidades) throws SQLException {
        try{
            String sql = getUpdateSql();
            Object[] args = new Object[] {comodidades.getNome()};
                 jdbcTemplate.update(sql, args);
        }catch (Exception ex){
            ex.printStackTrace();
            throw ex;
        }
    }


	public void dbDelete(ComodidadesVO comodidades) throws SQLException
	{
		try {
			String sql = "DELETE FROM " + TABLE_COMODIDADES + 
						" WHERE " + COL_IDT_COMODIDADES + " = ?";
			Object[] args = new Object[] {comodidades.getIdt()};
			jdbcTemplate.update(sql, args);
		}
		catch (Exception ex){
			ex.printStackTrace();
			throw ex;
		}
	}
        
   
        

	
	
}
