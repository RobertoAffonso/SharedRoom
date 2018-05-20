package com.sharedroom.model.Anuncio.DAO;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sharedroom.model.Anuncio.AnuncioVO;

@Repository
@Transactional
public class AnuncioDAO
{
	private static final String TABLE_ANUNCIO = "tb_anuncio";
	private static final String COL_IDT_ANUNCIO = "idt_anuncio";
	private static final String COL_NME_ANUNCIO = "nme_anuncio";
	private static final String COL_DTA_ANUNCIO = "dta_anuncio";
	private static final String COL_DSC_ANUNCIO = "dsc_anuncio";
	
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public void setDataSource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	private String getSelectAllSql()
	{
		StringBuilder sb = new StringBuilder("SELECT ");
		sb.append(COL_NME_ANUNCIO).append(", ")
		.append(COL_DTA_ANUNCIO).append(", ")
		.append(COL_DSC_ANUNCIO).append(" ")
		.append("FROM ").append(TABLE_ANUNCIO);
		
		return sb.toString();
	}
	
	public AnuncioVO dbLoad(Integer idt)  {
    	String sql = "SELECT * FROM " + TABLE_ANUNCIO + " WHERE " + COL_IDT_ANUNCIO + " = ?";
    	Object[] args = new Object[] {idt};
    	AnuncioVO anuncio = jdbcTemplate.queryForObject(sql, args, new AnuncioRowMapper());
    	return anuncio;
}

public List<AnuncioVO> dbLoadAll ()  {
	String sql = "SELECT * FROM " + TABLE_ANUNCIO;
	List<AnuncioVO> espList = jdbcTemplate.query(sql, new AnuncioRowMapper());
	return espList;
}
	
	private String getSelectSql(AnuncioVO anuncio)
	{
		StringBuilder sb = new StringBuilder("SELECT ");
		sb.append(COL_NME_ANUNCIO).append(", ")
		.append(COL_DTA_ANUNCIO).append(", ")
		.append(COL_DSC_ANUNCIO).append(" ")
		.append("FROM ").append(TABLE_ANUNCIO).append(" ")
		.append("WHERE ").append(COL_IDT_ANUNCIO).append(" = '")
		.append(anuncio.getIdt()).append("' " );

		return sb.toString();
	}
	
	private String getInsertSql()
	{
		StringBuilder sb = new StringBuilder("INSERT INTO ");
		sb.append(TABLE_ANUNCIO).append(" ").append("(")
		.append(COL_NME_ANUNCIO).append(", ")
		.append(COL_DTA_ANUNCIO).append(", ")
		.append(COL_DSC_ANUNCIO).append(") ")
		.append("VALUES (?, ?, ?)");
		
		return sb.toString();
	}
	
	private String getUpdateSql()
	{
		StringBuilder sb = new StringBuilder("UPDATE " + TABLE_ANUNCIO + " ");
		sb.append("(")
		.append(COL_NME_ANUNCIO).append(", ")
		.append(COL_DTA_ANUNCIO).append(", ")
		.append(COL_DSC_ANUNCIO).append(") ")
		.append(" SET ")
		.append(COL_NME_ANUNCIO).append(" = ?, ")
		.append(COL_DTA_ANUNCIO).append(" = ?, ")
		.append(COL_DSC_ANUNCIO).append(" = ? ");
		return sb.toString();
	}
	
	public void dbDelete(AnuncioVO anuncio) throws SQLException
	{
		try {
			String sql = "DELETE FROM " + TABLE_ANUNCIO + 
						" WHERE " + COL_IDT_ANUNCIO + " = ?";
			Object[] args = new Object[] {anuncio.getIdt()};
			jdbcTemplate.update(sql, args);
		}
		catch (Exception ex){
			ex.printStackTrace();
			throw ex;
		}
	}
        
        public void dbInsert(AnuncioVO anuncio) throws SQLException {
        try {
            String sql= getInsertSql(); 
            Object[] args = new Object[] {anuncio.getNome(), anuncio.getDataCriacao(), anuncio.getDescricao()};
            jdbcTemplate.update(sql, args);
        }catch (Exception ex){
            ex.printStackTrace();
            throw ex;
        }
    }    
        
        public void dbUpdate(AnuncioVO anuncio) throws SQLException {
            try{
                String sql = getUpdateSql();
                Object[] args = new Object[] {anuncio.getNome(), anuncio.getDataCriacao(), anuncio.getDescricao()};
                     jdbcTemplate.update(sql, args);
            }catch (Exception ex){
                ex.printStackTrace();
                throw ex;
            }
        }
        
}

