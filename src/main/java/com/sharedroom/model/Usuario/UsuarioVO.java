/**
 * @author Roberto Affonso Araújo e Hiago Teixeira
 *
 */
package com.sharedroom.model.Usuario;

import java.util.Date;
import java.util.Objects;

import com.sharedroom.model.ValueObject.PersistanceValueObject;

public class UsuarioVO implements PersistanceValueObject
{
	private int idt;
	private String nome;
	private String usr;
	private String email;
	private String senha;
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
	
	public String getUsr()
	{
		return usr;
	}
	
	public void setUsr(String usr)
	{
		this.usr = usr;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setData(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getSenha()
	{
		return senha;
	}
	
	public void setSenha(String senha)
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

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}
}

