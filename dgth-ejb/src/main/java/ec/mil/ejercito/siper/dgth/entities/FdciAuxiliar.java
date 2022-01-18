package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FDCI_AUXILIAR database table.
 * 
 */
@Entity
@Table(name="FDCI_AUXILIAR")
@NamedQuery(name="FdciAuxiliar.findAll", query="SELECT f FROM FdciAuxiliar f")
public class FdciAuxiliar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String descripcion;

	//bi-directional many-to-one association to FdciDetciu
	@OneToMany(mappedBy="fdciAuxiliar")
	private List<FdciDetciu> fdciDetcius;

	public FdciAuxiliar() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<FdciDetciu> getFdciDetcius() {
		return this.fdciDetcius;
	}

	public void setFdciDetcius(List<FdciDetciu> fdciDetcius) {
		this.fdciDetcius = fdciDetcius;
	}

	public FdciDetciu addFdciDetcius(FdciDetciu fdciDetcius) {
		getFdciDetcius().add(fdciDetcius);
		fdciDetcius.setFdciAuxiliar(this);

		return fdciDetcius;
	}

	public FdciDetciu removeFdciDetcius(FdciDetciu fdciDetcius) {
		getFdciDetcius().remove(fdciDetcius);
		fdciDetcius.setFdciAuxiliar(null);

		return fdciDetcius;
	}

}