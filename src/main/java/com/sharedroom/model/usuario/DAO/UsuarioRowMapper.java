/**
 * @autor Hiago Teixeira
 */
package com.sharedroom.model.usuario.DAO;

import com.sharedroom.model.Usuario.UsuarioVO;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UsuarioRowMapper implements RowMapper<UsuarioVO>{

	@Override
	public UsuarioVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsuarioVO usuario = new UsuarioVO();
		usuario.setLogin(rs.getString("usr_usuario"));
		usuario.setEmail(rs.getString("eml_usuario"));
		usuario.setSenha(rs.getString("pwd_usuario"));
		usuario.setNome(rs.getString("nme_usuario"));
		usuario.setData(rs.getDate("dta_usuario"));
		usuario.setNumCelular(rs.getString("cel_usuario"));
		usuario.setCpf(rs.getString("cpf_usuario"));
		usuario.setRg(rs.getString("rg_usuario"));
		
		return usuario;
	}

}
