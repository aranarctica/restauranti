package modelo;

public class Cocinero {

	private int idCocinero;
	private String Nombre;
	private String Apellido;
	private String Telefono;
	private int LugarDeTrabajo;
	private Premios premios;

	public Premios getPremios() {
		return premios;
	}

	public void setPremios(Premios premios) {
		this.premios = premios;
	}

	public int getLugarDeTrabajo() {
		return LugarDeTrabajo;
	}

	public void setLugarDeTrabajo(int lugarDeTrabajo) {
		LugarDeTrabajo = lugarDeTrabajo;
	}

	private int Experiencia;
	private int Edad;
	private int PremiosC;

	public int getIdCocinero() {
		return idCocinero;
	}

	public void setIdCocinero(int idCocinero) {
		this.idCocinero = idCocinero;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public int getExperiencia() {
		return Experiencia;
	}

	public void setExperiencia(int experiencia) {
		Experiencia = experiencia;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public int getPremiosC() {
		return PremiosC;
	}

	public void setPremiosC(int PremiosC) {
		this.PremiosC = PremiosC;
	}

}
