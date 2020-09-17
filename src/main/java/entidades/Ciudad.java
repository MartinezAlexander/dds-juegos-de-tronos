package entidades;

public class Ciudad extends Lugar {
	private int cantidadDeComercios;
	private int cantidadDeSantuarios;
	private double tasaDeMortalidad;
	
	public Ciudad(){}
	
	public Ciudad(int cantidadDeComercios, int cantidadDeSantuarios, double tasaDeMortalidad){
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