/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.reserva;

import java.util.Date;

import javax.xml.bind.ValidationException;

import com.sharedroom.model.ValueObject.PersistanceValueObject;

public class ReservaVO implements PersistanceValueObject {

	private Date inicioReserva;
	private Date fimReserva;
	private Double valor;
	private Integer qtdPessoas;

	@Override
	public boolean validate() throws ValidationException {
		// TODO Auto-generated method stub
		try {
			if (getInicioReserva() == null) {

			} 
			else if (getFimReserva() == null) {

			} 
			else if (getValor() == null || getValor() < 0) {

			} 
			else if (getQtdPessoas() == null || getQtdPessoas() <= 0) {

			}
		} 
		catch (Throwable ex) {
			throw ex.printStackTrace();
			return false;
		}
		return true;
	}

	public Date getInicioReserva() {
		return inicioReserva;
	}

	public void setInicioReserva(Date inicioReserva) {
		this.inicioReserva = inicioReserva;
	}

	public Date getFimReserva() {
		return fimReserva;
	}

	public void setFimReserva(Date fimReserva) {
		this.fimReserva = fimReserva;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(Integer qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
}
