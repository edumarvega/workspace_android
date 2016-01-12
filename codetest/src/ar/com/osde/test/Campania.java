package ar.com.osde.test;

public class Campania {
	
	private String nombreCampania;
	private String usuarioCreador;
	
	public Campania(){
		
	}
	
	public Campania(String nombreCampania,String usuarioCreador){
		this.nombreCampania = nombreCampania;
		this.usuarioCreador = usuarioCreador;
		
	}

	public String getNombreCampania() {
		return nombreCampania;
	}

	public void setNombreCampania(String nombreCampania) {
		this.nombreCampania = nombreCampania;
	}

	public String getUsuarioCreador() {
		return usuarioCreador;
	}

	public void setUsuarioCreador(String usuarioCreador) {
		this.usuarioCreador = usuarioCreador;
	}
	
	
	
	
}
