package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Naval extends FuerzaMilitar {
	
	@Column(name="cantidad_unidades")
	private int cantidadBarcos;
	
	public Naval(){}
	
	public Naval(int cantidadBarcos){
		this.cantidadBarcos = cantidadBarcos;
	}
	
	@Override
	public void atacarA(Lugar unLugar){
		//TODO: hacer algo
	}
	
	public int getCantidadBarcos(){
		return this.cantidadBarcos;
	}
}
