package entidades;

public class Empleado extends Cliente {
	private Integer edad;
	private String direccion;
	public Empleado() {
		super();
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
}
