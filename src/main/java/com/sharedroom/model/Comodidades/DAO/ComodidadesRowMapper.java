
/*
 * @Author Vitor Hugo
*/
package com.sharedroom.model.Comodidade.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sharedroom.model.Anuncio.AnuncioVO;
import com.sharedroom.model.Comodidade.ComodidadesVO;




public class ComodidadesRowMapper implements RowMapper<ComodidadesVO> {

	public TipoSubespacoVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		TipoSubespacoVO comodidade = new TipoSubespacoVO();
		comodidade.setIdt(rs.getInt("idt"));
		comodidade.setNome(rs.getString("nme_anuncio"));
		return comodidade;
	}
	
	
}
