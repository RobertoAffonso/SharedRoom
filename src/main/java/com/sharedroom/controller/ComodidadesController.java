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

import com.sharedroom.model.Comodidades.ComodidadesVO;
import com.sharedroom.model.Comodidades.DAO.ComodidadesDAO;

@Controller
public class ComodidadesController {
	
	@Autowired
	private ComodidadesDAO comodidadesDAO;
	
	public List<ComodidadesVO> listAllTipoSubespacos(){
		List<ComodidadesVO> comodidades = new ArrayList<>();
		comodidades = comodidadesDAO.dbLoadAll();
		return comodidades;
	}
	
	public ComodidadesVO getTipoSubespaco(ComodidadesVO comodidade) {
		ComodidadesVO loadedComodidade = comodidadesDAO.dbLoad(comodidade.getIdt());
		return loadedComodidade;
	}
	
	public void insertTipoSubespaco(ComodidadesVO comodidade) throws SQLException {
		comodidadesDAO.dbInsert(comodidade);
	}
	
	public void deleteTipoSubespaco(ComodidadesVO comodidade) throws SQLException {
		comodidadesDAO.dbDelete(comodidade);
	}
	
	public void updateTipoSubespaco(ComodidadesVO comodidade) throws SQLException {
		comodidadesDAO.dbUpdate(comodidade);
	}
}

