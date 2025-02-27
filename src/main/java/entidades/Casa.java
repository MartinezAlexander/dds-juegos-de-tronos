package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Casa extends EntidadPersistente{
	private String nombre;
	private int patrimonio;
	private int anioFundacion;
	private String nombreLugarOrigen;
	
	@ManyToOne
	private Casa vasallaDe;
	
	@ManyToOne
	private Lugar origen;
	
	@OneToMany
	@JoinColumn(name="casa_id")
	private List<FuerzaMilitar> fuerzasMilitares;
	
	public Casa(){}
	
	public Casa(String nombre, int patrimonio, int anioFundacion, Lugar origen){
		this.nombre = nombre;
		this.patrimonio = patrimonio;
		this.anioFundacion = anioFundacion;
		this.vasallaDe = null;
		this.origen = origen;
		this.nombreLugarOrigen = origen.getNombre();
		this.fuerzasMilitares = new ArrayList<FuerzaMilitar>();
	}
	
	public void agregarFuerzaMilitar(FuerzaMilitar unaFuerza){
		this.fuerzasMilitares.add(unaFuerza);
	}
	
	public String nombreLugarOrigen(){
		// return origen.getNombre(); // Normalizado
		return this.nombreLugarOrigen; // Desnormalizacion
	}

	public String getNombre(){
		return nombre;
	}

	public int getPatrimonio()
	{
		return patrimonio;
	}

	public int getAnioFundacion(){
		return anioFundacion;
	}

	public Casa getVasallaDe(){
		return vasallaDe;
	}

	public void setVasallaDe(Casa vasallaDe){
		this.vasallaDe = vasallaDe;
	}
	
	public Lugar getOrigen(){
		return this.origen;
	}
}