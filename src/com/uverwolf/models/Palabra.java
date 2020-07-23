package com.uverwolf.models;

import java.util.Date;

public class Palabra {
	private String palabra;
	private Date fecha ;

	public Date  getFecha() {
		return fecha;
	}

	public  void setFecha() {
		this.fecha = new Date();
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public void generarRandom() {
		
	    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
		StringBuilder newpass = new StringBuilder(10);
		
		for(int i =0 ; i<10;i++) {
		int posicion= (int)(caracteres.length()* Math.random()); 
		newpass.append(caracteres.charAt(posicion));
		}
		setPalabra((newpass.toString()));
		setFecha();
	}
}
