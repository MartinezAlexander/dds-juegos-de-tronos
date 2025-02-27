package entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntidadPersistente {
	@Id
	@GeneratedValue
	private long id;

	public long getId(){
		return id;
	}
}	