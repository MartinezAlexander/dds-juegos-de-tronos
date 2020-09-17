package entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Ciudades")
public class Ciudad extends Lugar {
	private int cantidadDeComercios;
	private int cantidadDeSantuarios;
	private double tasaDeMortalidad;
	
	public Ciudad(){}
	
	public Ciudad(String nombre, int anioFundacion, int poblacion,int cantidadDeComercios, int cantidadDeSantuarios, double tasaDeMortalidad){
		this.nombre = nombre;
		this.anioFundacion = anioFundacion;
		this.poblacion = poblacion;
		this.cantidadDeComercios = cantidadDeComercios;
		this.cantidadDeSantuarios = cantidadDeSantuarios;
		this.tasaDeMortalidad = tasaDeMortalidad;
	}

	public int getCantidadDeComercios(){
		return cantidadDeComercios;
	}
	
	public int getCantidadDeSantuarios(){
		return cantidadDeSantuarios;
	}
	
	public double getTasaDeMortalidad(){
		return tasaDeMortalidad;
	}
}