package entidades;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Fuerzas_militares")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Tipo_fuerza")
public abstract class FuerzaMilitar extends EntidadPersistente {
	public abstract void atacarA(Lugar unLugar);
}