package com.sharedroom.model.espaco.DAO;

import com.sharedroom.model.DataAccessObject.DataAccessObject;
import com.sharedroom.model.DataAccessObject.mainDAO;
import com.sharedroom.model.Espaco.EspacoVO;
import com.sun.beans.decoder.ValueObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Roberto Affonso, created on 5/11/18
 **/

public class EspacoDAO extends mainDAO
implements DataAccessObject {
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
    
    @Override
    public String generateSelectAllSql(){
        StringBuilder sb = new StringBuilder("SELECT * FROM " + TABLE_NAME);
        return sb.toString();
    }

    @Override
    public List<EspacoVO> dbLoadAll() throws SQLException {
        try(Connection conn = (Connection) super.getConnection()){

        }
        catch(SQLException ex){

        }
        return null;
    }

    public EspacoVO dbLoad(Integer id)  {
        	String sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + TB_IDT_ESPACO + " = ?";
        	Object[] args = new Object[] {id};
        	EspacoVO espaco = jdbcTemplate.queryForObject(sql, args, new EspacoRowMapper());
        	return espaco;
    }

    @Override
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
    public void dbInsert(EspacoVO espaco) throws SQLException {
        try{
        	String sql = generateDeleteSql();
        	Object[] args = {espaco.getAreaEspaco(),
        			         espaco.getCep(),
        			         espaco.getQtdHospedes(),
        			         espaco.getEnderecoEsp(),
        			         espaco.getIdt()};
        	jdbcTemplate.update(sql, args);
        }
        catch(Exception ex){
        	throw ex;
        }
    }

    @Override
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
    public void dbUpdate(EspacoVO espaco) throws SQLException {
        try(PreparedStatement ps = null){
            String sql = generateUpdateSql();
            Object[] args = new Object[] {espaco.getAreaEspaco(),
            							  espaco.getCep(),
            							  espaco.getQtdHospedes(),
            							  espaco.getEnderecoEsp(),
            							  espaco.getIdt()};
            jdbcTemplate.update(sql, args);
        }
        catch(SQLException ex){
            ex.printStackTrace();
            throw ex;
        }

    }

    @Override
    public String generateDeleteSql() {
        StringBuilder sb = new StringBuilder("DELETE FROM " + TABLE_NAME + " ");
                sb.append(TB_IDT_ESPACO).append(" = ?");
        return sb.toString();
    }

    @Override
    public void dbDelete(EspacoVO espaco) throws SQLException {

    }

    @Override
    public EspacoVO rsToObject(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    public void Validate(Connection conn, ValueObject object) throws SQLException {

    }

	@Override
	public EspacoVO dbLoad() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
