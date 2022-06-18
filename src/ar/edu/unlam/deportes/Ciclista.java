package ar.edu.unlam.deportes;

public class Ciclista extends Deportista {

	private TipoDeBicicleta tipoBicicleta;

	public Ciclista(Integer id, String nombre, TipoDeBicicleta tipo) {
		super(id,nombre);
		this.tipoBicicleta = tipo;
		// TODO Auto-generated constructor stub
	}

	

	public TipoDeBicicleta getTipoDeBicicleta() {
	
		return tipoBicicleta;
	}
	

}
