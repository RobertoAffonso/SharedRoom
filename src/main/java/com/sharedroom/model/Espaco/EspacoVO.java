/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Espaco;

import javax.xml.bind.ValidationException;

import com.sharedroom.model.Rua.ImagemVO;
import com.sharedroom.model.Rua.SubespacoVO;
import com.sharedroom.model.ValueObject.PersistanceValueObject;

public class EspacoVO implements PersistanceValueObject{
	
	private double areaEspaco;
	private int qtdHospedes;
	private String enderecoEsp;
	private String cep;
	private SubespacoVO subespaco;
	private ImagemVO imagem;
	
	
	@Override
	public boolean validate() throws ValidationException {
		// TODO Auto-generated method stub
		return false;
	}


	public double getAreaEspaco() {
		return areaEspaco;
	}


	public void setAreaEspaco(double areaEspaco) {
		this.areaEspaco = areaEspaco;
	}


	public int getQtdHospedes() {
		return qtdHospedes;
	}


	public void setQtdHospedes(int qtdHospedes) {
		this.qtdHospedes = qtdHospedes;
	}


	public String getEnderecoEsp() {
		return enderecoEsp;
	}


	public void setEnderecoEsp(String enderecoEsp) {
		this.enderecoEsp = enderecoEsp;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}
}

