package com.sharedroom.model.TipoSubespacoDAO;

import com.sharedroom.model.Espaco.DAO.*;
import com.sharedroom.model.DataAccessObject.DataAccessObject;
import com.sharedroom.model.DataAccessObject.mainDAO;
import com.sharedroom.model.Espaco.EspacoVO;
import com.sharedroom.model.TipoSubespaco.TipoSubespacoVO;
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
 * @author Rafael
 **/

public class TipoSubespacoDAO extends mainDAO
 {
    public static final String TABLE_NAME = "td_tipo_subespaco";
    public static final String TD_IDT_TIPO_SUBESPACO = "idt_espaco";
    public static final String TD_NME_TIPO_SUBESPACO = "nme_tipo_subespaco";
    public static final String TABLE_TIPO_ESPACO = "td_tipo_espaco";
    public static final String TD_IDT_TIPO_ESPACO = "idt_tipo_espaco";
    public static final String TD_COD_TIPO_ESPACO = "cod_tipo_subespaco";
   // public static final String TB_COL_HOSPEDES_ESPACOS = "qtd_hospedes_espaco";
   // public static final String TB_COL_END_ESPACO = "end_espaco";
    
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
	public void setDataSource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
    
    public String generateSelectAllSql(){
        StringBuilder sb = new StringBuilder("SELECT * FROM " + TABLE_NAME);
        return sb.toString();
    }

    public List<EspacoVO> dbLoadAll() throws SQLException {
        try(Connection conn = (Connection) super.getConnection()){

        }
        catch(SQLException ex){

        }
        return null;
    }

    public EspacoVO dbLoad(Integer id)  {
        	String sql = "SELECT * " + TABLE_NAME + " WHERE " + TD_IDT_TIPO_SUBESPACO + " = ?";
        	Object[] args = new Object[] {id};
        	EspacoVO espaco = jdbcTemplate.queryForObject(sql, args, new EspacoRowMapper());
        	return espaco;
    }

    public String generateInsertSql() {
        StringBuilder sb = new StringBuilder("INSERT INTO " + TABLE_NAME );
        sb.append("(")
            .append(TD_NME_TIPO_SUBESPACO).append(", ")
            .append(TD_COD_TIPO_ESPACO).append(", ")
            .append("VALUES (?, ?)");

        return sb.toString();
    }

    public void dbInsert(TipoSubespacoVO tipoSubespaco) throws SQLException {
        try{
        	String sql = generateDeleteSql();
        	Object[] args = {tipoSubespaco.getNome(),
        			         tipoSubespaco.getCod_tipoEspaco(),
        			         tipoSubespaco.getIdt()};
        	jdbcTemplate.update(sql, args);
        }
        catch(Exception ex){
        	throw ex;
        }
    }

    public String generateUpdateSql() {
        StringBuilder sb = new StringBuilder("UPDATE " + TABLE_NAME + " ")
                .append("SET ")
                .append(TD_NME_TIPO_SUBESPACO).append("= ?, ")
                .append(TD_COD_TIPO_ESPACO).append("= ?, ")
                .append("WHERE ")
                .append(TD_IDT_TIPO_SUBESPACO).append(" = ?");
        return sb.toString();
    }

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

    public String generateDeleteSql() {
        StringBuilder sb = new StringBuilder("DELETE FROM " + TABLE_NAME + " ");
                sb.append(TD_IDT_TIPO_SUBESPACO).append(" = ?");
        return sb.toString();
    }

    public void dbDelete(EspacoVO espaco) throws SQLException {

    }


    public void Validate(Connection conn, ValueObject object) throws SQLException {

    }
    
}

	
