/**
 * RAFAEL-PC
 *
 */
package com.sharedroom.model.TipoSubespaco.DAO;

import com.sharedroom.model.TipoSubespaco.DAO.*;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;
import com.sharedroom.model.TipoSubespaco.TipoSubespacoVO;




public class TipoSubespacoRowMapper implements RowMapper<TipoSubespacoVO> {

	public TipoSubespacoVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		TipoSubespacoVO tipoSubespaco = new TipoSubespacoVO();
		tipoSubespaco.setIdt(rs.getInt("idt"));
		tipoSubespaco.setNome(rs.getString("nme_tipo_subespaco"));
		return tipoSubespaco;
	}
	
	
}
