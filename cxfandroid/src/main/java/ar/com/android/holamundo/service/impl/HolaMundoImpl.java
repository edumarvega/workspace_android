package ar.com.android.holamundo.service.impl;

import javax.jws.WebService;

import ar.com.android.holamundo.model.Persona;
import ar.com.android.holamundo.service.HolaMundo;

@WebService(endpointInterface = "ar.com.android.holamundo.service.HolaMundo")
public class HolaMundoImpl implements HolaMundo{

	@Override
	public String saludar(String apellido,String nombre) {
		
		return "Hola " +apellido +" " +nombre;
	}

	@Override
	public Persona saludarPersona(String apellido,String nombre) {
		Persona persona = new Persona();
        persona.setApellido(apellido);
        persona.setNombres(nombre);
        return persona;
	}	
	
}
