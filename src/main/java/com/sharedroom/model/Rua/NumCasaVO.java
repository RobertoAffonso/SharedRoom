/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Rua;

import com.sharedroom.model.Espaco.CidadeVO;
import com.sharedroom.model.SubespacoVO.SubespacoVO;

public class NumCasaVO {
	
	protected RuaVO rua;
	private int idt;
	private String idCasa;
	private String referencia;
	private CidadeVO cidade;
	
	public NumCasaVO(RuaVO rua, String idCasa) {
		this.rua = rua;
		this.idCasa = idCasa;
	}

	public RuaVO getRua() {
		return rua;
	}
	
	public void setRua(RuaVO rua) {
		this.rua = rua;
	}
	
	public int getIdt() {
		return idt;
	}
	
	public String getIdCasa() {
		return idCasa;
	}
	
	public void setIdCasa(String idCasa) {
		this.idCasa = idCasa;
	}
	
	public String getReferencia() {
		return referencia;
	}
	
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public CidadeVO getCidade() {
		return cidade;
	}

	public SubespacoVO getSubespaco() {
		return subespaco;
	}

	public void setSubespaco(SubespacoVO subespaco) {
		this.subespaco = subespaco;
	}
}

