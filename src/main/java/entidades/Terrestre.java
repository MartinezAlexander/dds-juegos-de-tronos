package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Terrestre extends FuerzaMilitar{
	
	@Column(name="cantidad_unidades")
	private int cantidadSoldados;
	
	public Terrestre(){}
	
	public Terrestre(int cantidadSoldados){
		this.cantidadSoldados = cantidadSoldados;
	}
	
	@Override
	public void atacarA(Lugar unLugar){
		//TODO: hacer algo
	}
	
	public int getCantidadSoldados(){
		return this.cantidadSoldados;
	}
}
