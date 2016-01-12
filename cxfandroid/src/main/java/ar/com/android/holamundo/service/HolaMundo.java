package ar.com.android.holamundo.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ar.com.android.holamundo.model.Persona;

@WebService
public interface HolaMundo {
	
	@WebResult(name="saludar")
	public String saludar(@WebParam(name="apellido") String apellido,@WebParam(name="nombre") String nombre);
	
	@WebResult(name="saludarPersona")
	public Persona saludarPersona(@WebParam(name="apellido") String apellido,@WebParam(name="nombre") String nombre);

}
