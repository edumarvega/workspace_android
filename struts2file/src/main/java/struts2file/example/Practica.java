package struts2file.example;

import java.io.Serializable;

public class Practica implements Serializable{
	

	private static final long serialVersionUID = -7200875042469963076L;
	private Integer codigo;
	private String descripcion;
	
	public Practica(){
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
