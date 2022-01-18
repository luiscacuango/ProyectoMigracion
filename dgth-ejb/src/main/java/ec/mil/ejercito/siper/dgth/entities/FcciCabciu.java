package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FCCI_CABCIU database table.
 * 
 */
@Entity
@Table(name="FCCI_CABCIU")
@NamedQuery(name="FcciCabciu.findAll", query="SELECT f FROM FcciCabciu f")
public class FcciCabciu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CCI_ID")
	private long cciId;

	@Column(name="CCI_NOMBRE")
	private String cciNombre;

	//bi-directional many-to-one association to FdciDetciu
	@OneToMany(mappedBy="fcciCabciu")
	private List<FdciDetciu> fdciDetcius;

	public FcciCabciu() {
	}

	public long getCciId() {
		return this.cciId;
	}

	public void setCciId(long cciId) {
		this.cciId = cciId;
	}

	public String getCciNombre() {
		return this.cciNombre;
	}

	public void setCciNombre(String cciNombre) {
		this.cciNombre = cciNombre;
	}

	public List<FdciDetciu> getFdciDetcius() {
		return this.fdciDetcius;
	}

	public void setFdciDetcius(List<FdciDetciu> fdciDetcius) {
		this.fdciDetcius = fdciDetcius;
	}

	public FdciDetciu addFdciDetcius(FdciDetciu fdciDetcius) {
		getFdciDetcius().add(fdciDetcius);
		fdciDetcius.setFcciCabciu(this);

		return fdciDetcius;
	}

	public FdciDetciu removeFdciDetcius(FdciDetciu fdciDetcius) {
		getFdciDetcius().remove(fdciDetcius);
		fdciDetcius.setFcciCabciu(null);

		return fdciDetcius;
	}

}