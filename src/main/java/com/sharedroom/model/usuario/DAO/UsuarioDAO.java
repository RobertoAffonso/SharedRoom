/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.usuario.DAO;

import com.sharedroom.model.Usuario.UsuarioVO;

public class UsuarioDAO
{
	private static final String TABLE_USUARIO = "tb_usuario";
	private static final String COL_IDT_USUARIO = "idt_usuario";
	private static final String COL_USR_USUARIO = "usr_usuario";
	private static final String COL_EML_USUARIO = "eml_usuario";
	private static final String COL_PWD_USUARIO = "pwd_usuario";
	private static final String COL_NME_USUARIO = "nme_usuario";
	private static final String COL_DTA_USUARIO = "dta_usuario";
	private static final String COL_CEL_USUARIO = "cel_usuario";
	private static final String COL_CPF_USUARIO = "cpf_usuario";
	private static final String COL_RG_USUARIO = "rg_usuario";
	
	private String getSelectAllSql()
	{
		StringBuilder sb = new StringBuilder("SELECT ");
		sb.append(COL_IDT_USUARIO).append(", ")
		.append(COL_USR_USUARIO).append(", ")
		.append(COL_EML_USUARIO).append(", ")
		.append(COL_PWD_USUARIO).append(", ")
		.append(COL_NME_USUARIO).append(", ")
		.append(COL_DTA_USUARIO).append(", ")
		.append(COL_CEL_USUARIO).append(", ")
		.append(COL_CPF_USUARIO).append(", ")
		.append(COL_RG_USUARIO).append(" ")
		.append("FROM ").append(TABLE_USUARIO);
		
		return sb.toString();
	}
	
	private String getSelectSql(UsuarioVO user)
	{
		StringBuilder sb = new StringBuilder("SELECT ");
		sb.append(COL_USR_USUARIO).append(", ")
		.append(COL_EML_USUARIO).append(", ")
		.append(COL_PWD_USUARIO).append(", ")
		.append(COL_NME_USUARIO).append(", ")
		.append(COL_DTA_USUARIO).append(", ")
		.append(COL_CEL_USUARIO).append(", ")
		.append(COL_CPF_USUARIO).append(", ")
		.append(COL_RG_USUARIO).append(" ")
		.append("FROM ").append(TABLE_USUARIO).append(" ")
		.append("WHERE ").append(COL_IDT_USUARIO).append(" = '")
		.append(user.getIdt()).append("' " );
				
		return sb.toString();
	}
	
	private String getInsertSql()
	{
		StringBuilder sb = new StringBuilder("INSERT INTO ");
		sb.append(TABLE_USUARIO).append(" ").append("(")
		.append(COL_USR_USUARIO).append(", ")
		.append(COL_EML_USUARIO).append(", ")
		.append(COL_PWD_USUARIO).append(", ")
		.append(COL_NME_USUARIO).append(", ")
		.append(COL_DTA_USUARIO).append(", ")
		.append(COL_CEL_USUARIO).append(", ")
		.append(COL_CPF_USUARIO).append(", ")
		.append(COL_RG_USUARIO).append(") ")
		.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		
		return sb.toString();
	}
	
	private String getUpdateSql()
	{
		StringBuilder sb = new StringBuilder("UPDATE " + TABLE_USUARIO + " ");
		sb.append("(")
		.append(COL_USR_USUARIO).append(", ")
		.append(COL_EML_USUARIO).append(", ")
		.append(COL_PWD_USUARIO).append(", ")
		.append(COL_NME_USUARIO).append(", ")
		.append(COL_DTA_USUARIO).append(", ")
		.append(COL_CEL_USUARIO).append(", ")
		.append(COL_CPF_USUARIO).append(", ")
		.append(COL_RG_USUARIO).append(") ")
		.append(" SET ")
		.append(COL_USR_USUARIO).append(" = ?, ")
		.append(COL_EML_USUARIO).append(" = ?, ")
		.append(COL_PWD_USUARIO).append(" = ?, ")
		.append(COL_NME_USUARIO).append(" = ?, ")
		.append(COL_DTA_USUARIO).append(" = ?, ")
		.append(COL_CEL_USUARIO).append(" = ?, ")
		.append(COL_CPF_USUARIO).append(" = ?, ")
		.append(COL_RG_USUARIO).append(" = ? ");
		
		return sb.toString();
	}
}

