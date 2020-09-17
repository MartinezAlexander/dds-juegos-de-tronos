package entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Castillos")
public class Castillo extends Lugar {
	private int cantidadTorres;
	private int cantidadMurallas;
	
	public Castillo(){}
	
	public Castillo(String nombre, int anioFundacion, int poblacion, int cantidadTorres, int cantidadMurallas){
		this.nombre = nombre;
		this.anioFundacion = anioFundacion;
		this.poblacion = poblacion;
		this.cantidadTorres = cantidadTorres;
		this.cantidadMurallas = cantidadMurallas;
	}

	public int getCantidadTorres(){
		return cantidadTorres;
	}

	public int getCantidadMurallas(){
		return cantidadMurallas;
	}
}