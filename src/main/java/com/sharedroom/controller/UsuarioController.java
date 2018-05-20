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
import com.sharedroom.model.Usuario.UsuarioVO;
import com.sharedroom.model.Usuario.DAO.UsuarioDAO;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	public UsuarioVO loadUsuarioByName(String nome){
		UsuarioVO loadedUsuario = usuarioDAO.dbLoadByName(nome);
		return loadedUsuario;
	}
	
	public UsuarioVO loadUsuario(UsuarioVO usuario){
		UsuarioVO loadedUsuario = usuarioDAO.dbLoad(usuario.getIdt());
		return loadedUsuario;
	}
	
	public void insertTipoSubespaco(UsuarioVO usuario) throws SQLException {
		usuarioDAO.dbInsert(usuario);
	}
	
	public void deleteTipoSubespaco(UsuarioVO usuario) throws SQLException {
		usuarioDAO.dbDelete(usuario);
	}
	
	public void updateTipoSubespaco(UsuarioVO usuario) throws SQLException {
		usuarioDAO.dbUpdate(usuario);
	}

}

