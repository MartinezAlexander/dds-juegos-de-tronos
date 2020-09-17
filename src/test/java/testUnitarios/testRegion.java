package testUnitarios;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import entidades.Casa;
import entidades.Castillo;
import entidades.Ciudad;
import entidades.Lugar;
import entidades.Region;

public class testRegion {

	Region region;
	Casa principal;
	Lugar lugar;
	
	@Before
	public void setUp(){
		lugar = new Ciudad("UnaCiudad",1880,5000,3,4,1.5);
		principal = new Casa("MiCasa",400,1998,lugar);
	}
	
	@Test
	public void regionCon10050dePoblacionTotal(){
		region = new Region("UnaRegion",principal);
		Lugar ciudad = new Ciudad("OtraCiudad",1700,9000,7,7,0.5);
		Lugar castillo = new Castillo("UnaCastillo",1600,1000,4,6);
		Lugar comun = new Lugar("LugarComun",1500,50);
		region.agregarLugares(ciudad);
		region.agregarLugares(castillo);
		region.agregarLugares(comun);
		assertEquals(9000+1000+50,region.poblacionTotal());
	}
	
	@Test
	public void regionSinPoblacion(){
		region = new Region("UnaRegion",principal);
		assertEquals(0,region.poblacionTotal());
	}
	
	// Este test trae una region desde la base de datos
	@Test
	public void regionDeBD(){
		EntityManager em = PerThreadEntityManagers.getEntityManager();
		long id = 1;
		region = em.find(Region.class,id);
		assertEquals(100000,region.poblacionTotal());
	}
}
