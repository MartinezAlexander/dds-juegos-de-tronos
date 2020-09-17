package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Aerea extends FuerzaMilitar {
	
	@Column(name="cantidad_unidades")
	private int cantidadDragones;
	
	public Aerea(){}
	
	public Aerea(int cantidadDragones){
		this.cantidadDragones = cantidadDragones;
	}
	
	@Override
	public void atacarA(Lugar unLugar){
		//TODO: hacer algo
	}
	
	public int getCantidadDragones(){
		return this.cantidadDragones;
	}
}
