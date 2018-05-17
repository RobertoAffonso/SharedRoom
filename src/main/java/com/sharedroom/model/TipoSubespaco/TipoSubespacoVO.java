/**
 /**
 * @author Rafael-PC
 *
 */

package com.sharedroom.model.TipoSubespaco;


import com.sharedroom.model.TipoSubespaco.*;
import java.util.Date;
import java.util.Objects;


public class TipoSubespacoVO {
	
	private int idt;
	private String nome;

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
		if(!(obj instanceof TipoSubespacoVO))
		{
			return false;
		}
		
		return Objects.equals(this.idt, ((TipoSubespacoVO) obj).getIdt());
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
		

}
