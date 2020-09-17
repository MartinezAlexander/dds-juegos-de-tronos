package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Region extends EntidadPersistente{
	
	private String nombre;
	
	@ManyToMany
	private List<Lugar> lugares;
	
	@ManyToOne
	private Casa casaPrincipal;
	
	public Region(){}
	
	public Region(String nombre,Casa casaPrincipal){
		this.nombre = nombre;
		this.casaPrincipal = casaPrincipal;
		this.lugares = new ArrayList<Lugar>();
	}
	
	public void agregarLugares(Lugar unLugar){
		lugares.add(unLugar);
	}
	
	//TODO: setters de castillos? y setters de ciudades?
	
	public List<Castillo> Castillos(){
		//TODO: con el entity manager tendria que traerme todos los castillos desde BD
		return new ArrayList<Castillo>();
	}
	
	public List<Ciudad> Ciudades(){
		//TODO: con el entity manager tendria que traerme todas las ciudades desde BD
		return new ArrayList<Ciudad>();
	}
	
	public int poblacionTotal(){
		//return this.lugares.stream().map(Lugar::getPoblacion).reduce(0,Integer::sum);
		// return this.lugares.stream().map(Lugar::getPoblacion).reduce(BigDecimal.ZERO, BigDecimal::add);
		return this.lugares.stream().mapToInt(Lugar::getPoblacion).sum();
	}

	public String getNombre(){
		return nombre;
	}

	public Casa getCasaPrincipal(){
		return casaPrincipal;
	}
}
