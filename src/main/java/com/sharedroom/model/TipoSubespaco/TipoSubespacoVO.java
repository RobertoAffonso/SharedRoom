/**
 * @author Rafael-PC
 *
 */
package com.sharedroom.model.TipoSubespaco;
import com.sharedroom.model.Imagem.ImagemVO;
import com.sharedroom.model.SubespacoVO.SubespacoVO;
import com.sharedroom.model.ValueObject.PersistanceValueObject;

import com.sharedroom.model.SubespacoVO.*;
//import com.sharedroom.model.TipoEspaco.TipoEspacoVO.*; aguardar criação de tipo de espaco;

public class TipoSubespacoVO
{
	private int idt;
	private String nome_tipoSubespaco;
        private int cod_tipoEspaco;
        //private Tipo_espacoVO espaco;
        
	
	public String getNome()
	{
		return nome_tipoSubespaco;
	}
	
	public void setNome(String nme_tipoSubespaco)
	{
		this.nome_tipoSubespaco = nme_tipoSubespaco;
	}
	
	public int getIdt()
	{
		return idt;
	}
	
	public void setIdt(int idt)
	{
		this.idt = idt;
	}
	
	public int getCod_tipoEspaco()
	{
		return cod_tipoEspaco;
	}
	
	public void setCod_tipoEspaco(int idt)
	{
		this.idt = cod_tipoEspaco;
	}
	
	
	
}

