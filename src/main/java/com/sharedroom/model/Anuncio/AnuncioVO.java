/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Anuncio;

import java.util.Date;
import java.util.Objects;

public class AnuncioVO
{
	private int idt;
	private String nome;
	private Date dataCriacao;
	private String descricao;
	
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
		if(!(obj instanceof AnuncioVO))
		{
			return false;
		}
		
		return Objects.equals(this.idt, ((AnuncioVO) obj).getIdt());
	}

	public int getIdt()
	{
		return idt;
	}
	
	public void setIdt(int idt)
	{
		this.idt = idt;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public Date getDataCriacao()
	{
		return dataCriacao;
	}
	
	public void setDataCriacao(Date dataCriacao)
	{
		this.dataCriacao = dataCriacao;
	}
	
	public String getDescricao()
	{
		return descricao;
	}
	
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
}

