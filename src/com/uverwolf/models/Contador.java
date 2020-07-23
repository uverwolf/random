package com.uverwolf.models;

public class Contador {
 private static int contador =0;

public static int getContador() {
	return contador;
}

public static void setContador(int contador) {
	Contador.contador = contador;
}
 	
 public void agregar() {
	 contador++;
 }
}
