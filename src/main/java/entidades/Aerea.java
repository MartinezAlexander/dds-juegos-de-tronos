package entidades;

public class Aerea extends FuerzaMilitar {
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
