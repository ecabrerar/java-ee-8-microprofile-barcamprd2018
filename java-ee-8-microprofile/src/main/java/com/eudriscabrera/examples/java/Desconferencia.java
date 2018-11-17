/**
 * 
 */
package com.eudriscabrera.examples.java;

/**
 * @author ecabrerar
 * @date Nov 17, 2018
 */
public class Desconferencia {

	public Desconferencia(String hora, String charlista, String tema) {
		super();
		this.hora = hora;
		this.charlista = charlista;
		this.tema = tema;
	}

	public Desconferencia() {

	}

	private String hora;
	private String charlista;
	private String tema;

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCharlista() {
		return charlista;
	}

	public void setCharlista(String charlista) {
		this.charlista = charlista;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

}
