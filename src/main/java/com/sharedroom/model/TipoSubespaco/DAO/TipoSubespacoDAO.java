/**
 * @author Rafael-PC
 *
 */
package com.sharedroom.model.TipoSubespaco.DAO;

import com.sharedroom.model.TipoSubespaco.DAO.*;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sharedroom.model.Anuncio.AnuncioVO;
import com.sharedroom.model.TipoSubespaco.DAO.TipoSubespacoRowMapper;
import com.sharedroom.model.TipoSubespaco.TipoSubespacoVO;




@Repository
@Transactional
public class TipoSubespacoDAO {

	
	private static final String TABLE_TIPOSUBESPACO = "td_tipo_subespaco";
	private static final String COL_IDT_TIPOSUBESPACO = "idt_tiposubespaco";
	private static final String COL_NME_TIPOSUBESPACO = "nme_tiposubespaco";

	
	private JdbcTemplate jdbcTemplate;
	

	public void setDataSource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	private String getSelectAllSql()
	{
		StringBuilder sb = new StringBuilder("SELECT ");
		sb.append(COL_NME_TIPOSUBESPACO).append(" ")
		.append("FROM ").append(TABLE_TIPOSUBESPACO );	
		return sb.toString();
	}
	
	public TipoSubespacoVO dbLoad(Integer idt)  {
    	String sql = "SELECT * FROM  " + TABLE_TIPOSUBESPACO ;
    	Object[] args = new Object[] {idt};
    	TipoSubespacoVO TipoSubespaco = jdbcTemplate.queryForObject(sql, args, new TipoSubespacoRowMapper());
    	return TipoSubespaco;
}
	
public List<TipoSubespacoVO> dbLoadAll ()  {
	String sql = "SELECT * FROM " + TABLE_TIPOSUBESPACO ;
	List<TipoSubespacoVO> espList = jdbcTemplate.query(sql, new TipoSubespacoRowMapper());
	return espList;
}
	
	
	private String getInsertSql()
	{
		StringBuilder sb = new StringBuilder("INSERT INTO ");
		sb.append(TABLE_TIPOSUBESPACO).append(" ").append("(")
		.append(COL_NME_TIPOSUBESPACO).append(") ")
		.append("VALUES (?)");		
		return sb.toString();
	}
	
    public void dbInsert(TipoSubespacoVO TipoSubespacos) throws SQLException {
    try {
        String sql= getInsertSql(); 
        Object[] args = new Object[] {TipoSubespacos.getNome()};
        jdbcTemplate.update(sql, args);
    }catch (Exception ex){
        ex.printStackTrace();
        throw ex;
    }
} 
	
	private String getUpdateSql()
	{
		StringBuilder sb = new StringBuilder("UPDATE " + TABLE_TIPOSUBESPACO  + " ");
		sb.append(" SET ").append(COL_NME_TIPOSUBESPACO).append(" = ?").append( "WHERE ")
		.append(COL_IDT_TIPOSUBESPACO).append(" = ?");
		return sb.toString();
	}
	
    public void dbUpdate(TipoSubespacoVO TipoSubespacos) throws SQLException {
        try{
            String sql = getUpdateSql();
            Object[] args = new Object[] {TipoSubespacos.getNome()};
                 jdbcTemplate.update(sql, args);
        }catch (Exception ex){
            ex.printStackTrace();
            throw ex;
        }
    }


	public void dbDelete(TipoSubespacoVO TipoSubespaco) throws SQLException
	{
		try {
			String sql = "DELETE FROM " + TABLE_TIPOSUBESPACO  + 
						" WHERE " + COL_IDT_TIPOSUBESPACO + " = ?";
			Object[] args = new Object[] {TipoSubespaco.getIdt()};
			jdbcTemplate.update(sql, args);
		}
		catch (Exception ex){
			ex.printStackTrace();
			throw ex;
		}
	}
        
   
        

	
	
}
