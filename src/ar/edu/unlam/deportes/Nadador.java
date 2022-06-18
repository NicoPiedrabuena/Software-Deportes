package ar.edu.unlam.deportes;


public class Nadador extends Deportista implements INadador{
	private String estiloPreferido;

	public Nadador(Integer id, String nombre, String estiloPreferido) {
		super(id,nombre);
		this.estiloPreferido = estiloPreferido;
		// TODO Auto-generated constructor stub
	}

	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}
	

}
