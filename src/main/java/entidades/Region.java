package entidades;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String nombre;
	private List<Lugar> lugares;
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
		//TODO: return this.lugares.stream().map({unLugar => unLugar.poblacio()}).sum();
		return 0;
	}

	public String getNombre(){
		return nombre;
	}

	public Casa getCasaPrincipal(){
		return casaPrincipal;
	}
}
