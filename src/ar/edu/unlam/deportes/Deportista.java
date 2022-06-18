package ar.edu.unlam.deportes;

import java.util.Objects;

public class Deportista {

	private Integer id;
	private String nombre;

	public Deportista(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Integer getNumeroDeSocio() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Deportista [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	

}
