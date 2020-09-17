package Runner;
/*
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;*/

public class Runner {
	public static void main(String[] args){
		// Usar entity manager aca para persistir
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
