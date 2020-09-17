package entidades;

public class Terrestre implements FuerzaMilitar{
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
