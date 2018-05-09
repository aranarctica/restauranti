package modelo;

public class Jatetxeak {
	private int idJatetxeak;
	private String Nombre;
	private String Direccion;
	private int idCocinero;
	private String Poblacion;
	private String Pais;
	private int PremiosJ;
	private String Precio;
	private Cocinero cocinero;
	private Premios premios;

	public Cocinero getCocinero() {
		return cocinero;
	}

	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

	public Premios getPremios() {
		return premios;
	}

	public void setPremios(Premios premios) {
		this.premios = premios;
	}

	public int getIdJatetxeak() {
		return idJatetxeak;
	}

	public void setIdJatetxeak(int idJatetxeak) {
		this.idJatetxeak = idJatetxeak;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}



	

	public int getIdCocinero() {
		return idCocinero;
	}

	public void setIdCocinero(int idCocinero) {
		this.idCocinero = idCocinero;
	}

	public String getPoblacion() {
		return Poblacion;
	}

	public void setPoblacion(String poblacion) {
		Poblacion = poblacion;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public int getPremiosJ() {
		return PremiosJ;
	}

	public void setPremiosJ(int premiosJ) {
		PremiosJ = premiosJ;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}
}
