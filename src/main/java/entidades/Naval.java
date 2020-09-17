package entidades;

public class Naval implements FuerzaMilitar {
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
