package Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import entidades.Aerea;
import entidades.Casa;
import entidades.Lugar;
import entidades.Naval;
import entidades.Terrestre;

public class Runner {
	public static void main(String[] args){
		
		Aerea a = new Aerea(5);
		Terrestre t = new Terrestre(8);
		Naval n = new Naval(2);
		
			
		EntityManager em = PerThreadEntityManagers.getEntityManager();
		
		long id = 2;
		Lugar l = em.find(Lugar.class,id);
		
		Casa c = new Casa("Lannister",45000,5,l);
		c.agregarFuerzaMilitar(a);
		c.agregarFuerzaMilitar(t);
		c.agregarFuerzaMilitar(n);
		
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		em.persist(a);
		em.persist(t);
		em.persist(n);
		em.persist(l);
		em.persist(c);
		
		trans.commit();
	}
	
	/*
	 * Persistir un lugar, un castillo y una ciudad con el entity manager
	 * Lugar lugar = new Lugar("Pentos",1,50000);
		Castillo castillo = new Castillo("Alto Jardin",2,40000,4,6);
		Ciudad ciudad = new Ciudad("Desembarco del rey",3,10000,4,5,0.8);
		
		EntityManager em = PerThreadEntityManagers.getEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		em.persist(lugar);
		em.persist(castillo);
		em.persist(ciudad);
		
		trans.commit();
	 * */
	
	/*
	 * 	EntityManager em = PerThreadEntityManagers.getEntityManager();
		
		long id = 2;
		
		Castillo castillo = em.find(Castillo.class,id);
		
		System.out.println(castillo.getPoblacion());
	 * */
}
