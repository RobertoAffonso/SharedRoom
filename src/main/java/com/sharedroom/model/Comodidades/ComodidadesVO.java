package com.sharedroom.model.Comodidades;


/*
 * @Author Vitor Hugo
*/
import java.util.Date;
import java.util.Objects;


public class ComodidadesVO {
	
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
		if(!(obj instanceof ComodidadesVO))
		{
			return false;
		}
		
		return Objects.equals(this.idt, ((ComodidadesVO) obj).getIdt());
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
