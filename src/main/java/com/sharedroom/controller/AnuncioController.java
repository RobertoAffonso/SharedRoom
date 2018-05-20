/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sharedroom.model.Anuncio.AnuncioVO;
import com.sharedroom.model.Anuncio.DAO.AnuncioDAO;

@Controller
public class AnuncioController {
	
	@Autowired
	private AnuncioDAO anuncioDAO;
	
	@RequestMapping("/cadastrarAnuncio")
	public String cadastrarAnuncio() {
		return "cadastraranuncio";
	}
	
	@RequestMapping("/iniciandoCadastro")
	public String realizarCadastro(AnuncioVO anuncio) throws SQLException {
		anuncioDAO.dbInsert(anuncio);
		return "lol";
	}
	
	@RequestMapping("anuncio")
	public void atualizarAnuncio(AnuncioVO anuncio) throws SQLException {
		anuncioDAO.dbUpdate(anuncio);
	}
	
	@RequestMapping("anuncio")
	public void deletarAnuncio(AnuncioVO anuncio) throws SQLException {
		anuncioDAO.dbDelete(anuncio);
	}
	
	@RequestMapping("/index")
	public List<AnuncioVO> getAllAnuncios() {
		List<AnuncioVO> anuncios = new ArrayList<>();
		anuncioDAO.dbLoadAll();
		return anuncios;
	}
	
	@RequestMapping("/anuncio")
	public AnuncioVO getAnuncio(AnuncioVO anuncio) {
		AnuncioVO loadedAnuncio = anuncioDAO.dbLoad(anuncio.getIdt());
		return loadedAnuncio;
	}
}

