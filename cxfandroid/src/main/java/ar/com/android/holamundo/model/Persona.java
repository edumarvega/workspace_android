package ar.com.android.holamundo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
public class Persona implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5098379701004790938L;

	private String apellido;
	private String nombres;
	
	public Persona(){
		
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	

}
