package com.sharedroom.model.Anuncio.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sharedroom.model.Anuncio.AnuncioVO;

public class AnuncioRowMapper implements RowMapper<AnuncioVO> {

	public AnuncioVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		AnuncioVO anuncio = new AnuncioVO();
		anuncio.setIdt(rs.getInt("idt"));
		anuncio.setNome(rs.getString("nme_anuncio"));
		anuncio.setDataCriacao(rs.getDate("dta_criacao_anuncio"));
		anuncio.setDescricao(rs.getString("dsc_anuncio"));
		return anuncio;
	}
}
