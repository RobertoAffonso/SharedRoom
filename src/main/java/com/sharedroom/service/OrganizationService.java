/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharedroom.model.Espaco.EspacoVO;
import com.sharedroom.model.Espaco.DAO.EspacoDAO;
import com.sharedroom.model.Subespaco.DAO.SubespacoDAO;
import com.sharedroom.model.TipoSubespaco.DAO.TipoSubespacoDAO;
import com.sharedroom.model.usuario.DAO.UsuarioDAO;

import exemplo.dao.OrganizationDAO;
import exemplo.domain.Organization;

@Service
public class OrganizationService {
	
	@Autowired
	private OrganizationDAO organizationDAO;
	
	@Autowired
	private EspacoDAO espacoDAO;
	
	@Autowired
	private SubespacoDAO subespacoDAO;
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private TipoSubespacoDAO tipoSubespacoDAO;
	
	@Autowired
	private ImagemDAO imagemDAO;
	
	public List<Organization> getOrganization(){
		List<Organization> orgs = organizationDAO.getAllOrganizations();
		return orgs;
	}
	
	/////////////////////////////////////////////////////////////////////
	//// ESPAÇO                                                     ////
	///////////////////////////////////////////////////////////////////
	
	public List<EspacoVO> getEspacos(){
		List<EspacoVO> espacos = espacoDAO.getEspacos();
		return espacos;
	}
	
	

}

