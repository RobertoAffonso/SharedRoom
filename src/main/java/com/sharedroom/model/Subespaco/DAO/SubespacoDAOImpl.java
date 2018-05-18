/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Subespaco.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sharedroom.model.SubespacoVO.SubespacoVO;

@Repository("subespacoDAO")
public class SubespacoDAOImpl implements SubespacoDAO{
	
	// CRIAR OBJETO PARA TIPO DE ESPAÇO.
	
	private static final String TABLE_NAME = "tb_sub_espaco";
	private static final String COL_IDT_SUBESPACO = "idt_sub_espaco";
	private static final String COL_DSC_SUBESPACO = "dsc_sub_espaco";
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Override
	public void setDatasource(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}
	
	private String getSelectAllSubespaco() {
		StringBuilder sb = new StringBuilder("SELECT * FROM " + TABLE_NAME);
		return sb.toString();
	}
	
	@Override
	public List<SubespacoVO> getSubespacos() {
		String sql = getSelectAllSubespaco();
		List<SubespacoVO> subespacos = jdbcTemplate.query(sql, new SubespacoRowMapper());
		return subespacos;
	}

	@Override
	public SubespacoVO getSubespaco(Integer id) {
		String sql = getSelectAllSubespaco();
		sql += " WHERE " + COL_IDT_SUBESPACO + " = ?";
		Object[] args = {id};
		SubespacoVO subespaco = jdbcTemplate.queryForObject(sql, new SubespacoRowMapper());
		return subespaco;
	}
	
	private String getInsertSql() {
		StringBuilder sql = new StringBuilder("INSERT INTO " + TABLE_NAME + " ");
		sql.append("( ").append(COL_DSC_SUBESPACO).append(" ) ");
		sql.append("VALUES (?)");
		return sql.toString();
	}

	@Override
	public boolean createSubespaco(SubespacoVO subespaco) {
		String sql = getInsertSql();
		Object[] args = new Object[] {subespaco.getDescricao()};
		return jdbcTemplate.update(sql, args) == 1;
	}
	
	private String getDeleteSql() {
		StringBuilder sb = new StringBuilder("DELETE FROM " + TABLE_NAME + " ");
        sb.append(COL_IDT_SUBESPACO).append(" = ?");
        return sb.toString();
	}

	@Override
	public boolean deleteSubespaco(SubespacoVO subespaco) {
		String sql = getDeleteSql();
		Object[] args = new Object[]{subespaco.getIdt()};
		return jdbcTemplate.update(sql, args) == 1;
	}
	
	private String getUpdateSql() {
		 StringBuilder sb = new StringBuilder("UPDATE " + TABLE_NAME + " ")
	                .append("SET ")
	                .append(COL_DSC_SUBESPACO).append("= ? ")
	                .append("WHERE ")
	                .append(COL_IDT_SUBESPACO).append(" = ?");
	        return sb.toString();
	}

	@Override
	public boolean updateSubespaco(SubespacoVO subespaco) {
		String sql = getUpdateSql();
		Object[] args = new Object[] {subespaco.getDescricao(), subespaco.getIdt()};
		return jdbcTemplate.update(sql, args) == 1;
	}
}

