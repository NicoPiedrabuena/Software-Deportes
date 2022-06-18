package ar.edu.unlam.deportes;

public class Triatleta extends Deportista implements ICorredor ,ICiclista,INadador {

	private String tipoAtleta;
	private Integer cantidadDeKilometrosEntrenados;
	private Integer distanciaPreferida;
	private TipoDeBicicleta tipoDeBicicleta;
	private String estiloPreferidoNado;
	

	public Triatleta(Integer id, String nombre, String estiloPreferidoNado, TipoDeBicicleta tria) {
		super(id,nombre);
		this.estiloPreferidoNado = estiloPreferidoNado;
		this.cantidadDeKilometrosEntrenados =0;
		this.distanciaPreferida = 0;
		this.tipoDeBicicleta = tria;
		
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		cantidadDeKilometrosEntrenados = km;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return cantidadDeKilometrosEntrenados;
	}

	public String getTipoAtleta() {
		return tipoAtleta;
	}

	public void setTipoAtleta(String tipoAtleta) {
		this.tipoAtleta = tipoAtleta;
	}

	public Integer getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return distanciaPreferida;
	}
	public void setDistanciaPreferida(Integer distancia) {
		distanciaPreferida = distancia;
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return tipoDeBicicleta;
	}

	@Override
	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return estiloPreferidoNado;
	}

	
	
	

}
