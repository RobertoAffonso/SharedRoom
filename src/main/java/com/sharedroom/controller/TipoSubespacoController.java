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

import com.sharedroom.model.TipoSubespaco.TipoSubespacoVO;

import com.sharedroom.model.TipoSubespaco.DAO.TipoSubespacoDAO;

@Controller
public class TipoSubespacoController {
	
	@Autowired
	private TipoSubespacoDAO tipoSubespacoDao;
	
	public List<TipoSubespacoVO> listAllTipoSubespacos(){
		List<TipoSubespacoVO> tiposSubespacos = new ArrayList<>();
		tiposSubespacos = tipoSubespacoDao.dbLoadAll();
		return tiposSubespacos;
	}
	
	public TipoSubespacoVO getTipoSubespaco(TipoSubespacoVO tipoSubespaco) {
		TipoSubespacoVO loadedTipoSubespaco = tipoSubespacoDao.dbLoad(tipoSubespaco.getIdt());
		return loadedTipoSubespaco;
	}
	
	public void insertTipoSubespaco(TipoSubespacoVO tipoSubespaco) throws SQLException {
		tipoSubespacoDao.dbInsert(tipoSubespaco);
	}
	
	public void deleteTipoSubespaco(TipoSubespacoVO tipoSubespaco) throws SQLException {
		tipoSubespacoDao.dbDelete(tipoSubespaco);
	}
	
	public void updateTipoSubespaco(TipoSubespacoVO tipoSubespaco) throws SQLException {
		tipoSubespacoDao.dbUpdate(tipoSubespaco);
	}

}

