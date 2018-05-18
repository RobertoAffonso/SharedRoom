/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Subespaco.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sharedroom.model.SubespacoVO.SubespacoVO;

public class SubespacoRowMapper implements RowMapper<SubespacoVO> {

	@Override
	public SubespacoVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		SubespacoVO subespaco = new SubespacoVO();
		subespaco.setDescricao(rs.getString("dsc_sub_espaco"));
		subespaco.setIdt(rs.getInt("idt_sub_espaco"));
		return subespaco;
	}

}

