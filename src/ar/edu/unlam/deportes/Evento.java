package ar.edu.unlam.deportes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;



public class Evento {

	private TipoDeEvento tipo;
	private static Integer numeroDeInscripcion =0;
	private Map<Integer, Deportista> participantes;
	
	
	public Evento (TipoDeEvento tipo) {
		this.tipo = tipo;
		participantes = new HashMap<Integer,Deportista>();
	
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}
	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}
	public Deportista consultarDeportitas(Integer id) {
		return participantes.get(id);
	}
	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}
	public Integer inscribir(Deportista deportista) throws NoEstaPreparado {
		
		switch (getTipo()) {
		case CARRERA_NATACION_EN_PICINA,CARRERA_NATACION_EN_AGUAS_ABIERTAS: {
			if(deportista instanceof INadador) {
				participantes.put(numeroDeInscripcion,deportista);
				return numeroDeInscripcion++;
			}else {
				throw new NoEstaPreparado("no estas listo");
			}
		}
			case TRIATLON_SHORT,TRIATLON_OLIMPICO,TRIATLON_MEDIO,TRIATLON_IRONMAN:{
				if(deportista instanceof INadador && deportista instanceof ICiclista) {
					participantes.put(numeroDeInscripcion,deportista);
					return numeroDeInscripcion++;
				}else {
					throw new NoEstaPreparado("no estas listo");
				}
			
		}
			case CARRERA_5K,CARRERA_10K,CARRERA_21K,CARRERA_42K:
			participantes.put(numeroDeInscripcion, deportista);
			return numeroDeInscripcion++;
		default:
			break;
		}
		return numeroDeInscripcion;	
	}
}