/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Usuario;

import java.util.Date;
import java.util.Objects;

public class UsuarioVO
{
	private int idt;
	private String nome;
	private String login;
	private String email;
	private char[] senha;
	private Date dataNascimento;
	private String numCelular;
	private String cpf;
	private String rg;
	
	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(!(obj instanceof UsuarioVO))
		{
			return false;
		}
		
		return Objects.equals(this.idt, ((UsuarioVO) obj).getIdt());
	}

	public int getIdt()
	{
		return idt;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getLogin()
	{
		return login;
	}
	
	public void setLogin(String login)
	{
		this.login = login;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public char[] getSenha()
	{
		return senha;
	}
	
	public void setSenha(char[] senha)
	{
		this.senha = senha;
	}
	
	public Date getDataNascimento()
	{
		return dataNascimento;
	}
	
	public String getNumCelular()
	{
		return numCelular;
	}
	
	public void setNumCelular(String numCelular)
	{
		this.numCelular = numCelular;
	}
	
	public String getCpf()
	{
		return cpf;
	}
	
	public String getRg()
	{
		return rg;
	}
}

