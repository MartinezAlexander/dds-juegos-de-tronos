package entidades;

public class Lugar {
	private String nombre;
	private int anioFundacion;
	private int poblacion;
	
	public Lugar(){}
	
	public Lugar(String nombre, int anioFundacion, int poblacion){
		this.nombre = nombre;
		this.anioFundacion = anioFundacion;
		this.poblacion = poblacion;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getAnioFundacion(){
		return this.anioFundacion;
	}
	
	public int getPoblacion(){
		return this.poblacion;
	}
}
