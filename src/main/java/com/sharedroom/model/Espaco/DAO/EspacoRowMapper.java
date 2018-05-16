/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Espaco.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sharedroom.model.Espaco.EspacoVO;

public class EspacoRowMapper implements RowMapper<EspacoVO> {

    
	public EspacoVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EspacoVO espaco = new EspacoVO();
		espaco.setAreaEspaco(rs.getDouble("area_espaco"));
		espaco.setCep(rs.getString("cep_espaco"));
		espaco.setEnderecoEsp(rs.getString("end_espaco"));
		espaco.setIdt(rs.getInt("idt_espaco"));
		espaco.setQtdHospedes(rs.getInt("qtd_hospedes_espaco"));
		
		return espaco;
	}

}

