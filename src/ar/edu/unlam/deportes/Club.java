package ar.edu.unlam.deportes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Club {
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	
	public Club(String nombre) {
		this.nombre = nombre;
		socios = new HashSet<Deportista>();
		competencias = new HashMap<String,Evento>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public void agregarDeportista(Deportista deportista) {
		socios.add(deportista);
		
	}

	public Integer getCantidadSocios() {
		// TODO Auto-generated method stub
		return socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String string) {
		
		competencias.put(string, new Evento(tipo));
	}

	public Integer inscribirEnEvento(String string, Deportista celeste) throws NoEstaPreparado {
		competencias.get(string).inscribir(celeste);
		return competencias.get(string).getNumeroDeInscripcion();
	}
	

	
	
	
}
