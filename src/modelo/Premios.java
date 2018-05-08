package modelo;

public class Premios {

	private int idPremios;
	private String Nombre;
	private String Descripcion;
	private int PremioMetalico;

	public int getIdPremios() {
		return idPremios;
	}

	public void setIdPremios(int idPremios) {
		this.idPremios = idPremios;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getPremioMetalico() {
		return PremioMetalico;
	}

	public void setPremioMetalico(int premioMetalico) {
		PremioMetalico = premioMetalico;
	}

}
