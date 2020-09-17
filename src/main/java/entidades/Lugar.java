package entidades;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Lugares")
@Inheritance(strategy=InheritanceType.JOINED)
public class Lugar extends EntidadPersistente{
	protected String nombre;
	protected int anioFundacion;
	protected int poblacion;
	
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
