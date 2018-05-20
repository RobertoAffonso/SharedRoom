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

import com.sharedroom.model.Subespaco.DAO.SubespacoDAO;
import com.sharedroom.model.SubespacoVO.SubespacoVO;

@Controller
public class SubespacoController {
	
	@Autowired
	private SubespacoDAO subespacoDao;
	
	@RequestMapping("anuncio")
	public List<SubespacoVO> listAllSubespacos() {
		List<SubespacoVO> subespacos = new ArrayList<>();
		subespacos = subespacoDao.getSubespacos();
		return subespacos;
	}
	
	@RequestMapping("anuncio")
	public SubespacoVO getSubespaco(SubespacoVO subespaco) {
		SubespacoVO loadedSubespaco = subespacoDao.getSubespaco(subespaco.getIdt());
		return loadedSubespaco;
	}
	
	@RequestMapping("cadastraranuncio")
	public void insertSubespaco(SubespacoVO subespaco) {
		subespacoDao.createSubespaco(subespaco);
	}
	
	@RequestMapping("cadastraranuncio")
	public void updateSubespaco(SubespacoVO subespaco){
		subespacoDao.updateSubespaco(subespaco);
	}
	
	@RequestMapping("cadastraranuncio")
	public void deleteSubespaco(SubespacoVO subespaco) {
		subespacoDao.deleteSubespaco(subespaco);
	}
}

