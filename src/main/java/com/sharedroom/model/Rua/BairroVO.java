/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Rua;

public class BairroVO {
	private int Idt;
	private String nome;
	
	public BairroVO(String nome) {
		super();
		this.nome = nome;
	}

	public int getIdt() {
		return Idt;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}

