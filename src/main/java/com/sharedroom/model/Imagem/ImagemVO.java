/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Imagem;

import java.util.Objects;

public class ImagemVO
{
	private int idt;
	private byte[] imagem;
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(!(obj instanceof ImagemVO))
		{
			return false;
		}		
		return Objects.equals(this.getIdt(), ((ImagemVO) obj).getIdt());
	}

	public int getIdt()
	{
		return idt;
	}
	
	public void setIdt(int idt)
	{
		this.idt = idt;
	}
	
	public byte[] imagem()
	{
		return imagem;
	}
	
	public void setImagem(byte[] imagem)
	{
		this.imagem = imagem;
	}
}

