package ejercicio6;

public class Cliente {

	private String nombre;

	private String apellido;

	private String direccion;

	private String ciudad;

	private String codigoPostal;

	public Cliente(String nombre, String apellido, String direccion, String ciudad, String codigoPostal) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
	}

	// Getters y setters

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setApellido(String apellido) {

		this.apellido = apellido;

	}

	public void setDireccion(String direccion) {

		this.direccion = direccion;

	}

	public void setCiudad(String ciudad) {

		this.ciudad = ciudad;

	}

	public void setCodigoPostal(String codigoPostal) {

		this.codigoPostal = codigoPostal;

	}
}
