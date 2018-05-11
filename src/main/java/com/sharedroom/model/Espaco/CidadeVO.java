/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Espaco;

public class CidadeVO {
	
	private String nomeCidade;
	private char statusUnidadeFederativa;
	protected UnidadeFederativaVO unidadeFederativa;
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	public char getStatusUnidadeFederativa() {
		return statusUnidadeFederativa;
	}
	
	public void setStatusUnidadeFederativa(char statusUnidadeFederativa) {
		this.statusUnidadeFederativa = statusUnidadeFederativa;
	}
	
	public UnidadeFederativaVO getUnidadeFederativa() {
		return unidadeFederativa;
	}
	
	public void setUnidadeFederativa(UnidadeFederativaVO unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}
}

