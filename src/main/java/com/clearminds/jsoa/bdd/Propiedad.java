package com.clearminds.jsoa.bdd;

public class Propiedad {
	private String clave;
	private String valor;
	
	public Propiedad(String clave, String valor) {
		super();
		this.clave = clave;
		this.valor = valor;
	}

	
	
	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}



	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}



	@Override
	public String toString() {
		return "Propiedad [clave=" + clave + ", valor=" + valor + "]";
	}
	
	
}
