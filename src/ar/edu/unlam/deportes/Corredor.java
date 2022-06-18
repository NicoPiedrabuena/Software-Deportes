package ar.edu.unlam.deportes;

public class Corredor extends Deportista {

	private Integer distanciaPreferida;
	private Integer kilometrosEntrados;

	public Corredor(Integer id, String nombre, Integer distanciaPreferida) {
		super(id,nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.kilometrosEntrados= 0;
	}

	public Integer getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return kilometrosEntrados;
	}

	public void setCantidadDeKilometrosEntrenados(Integer kilometrosEntrados) {
		this.kilometrosEntrados = kilometrosEntrados;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}
	

}
