package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FMON_MONEDA database table.
 * 
 */
@Entity
@Table(name="FMON_MONEDA")
@NamedQuery(name="FmonMoneda.findAll", query="SELECT f FROM FmonMoneda f")
public class FmonMoneda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MON_SECUEN")
	private long monSecuen;

	@Column(name="MON_COTIZACION")
	private BigDecimal monCotizacion;

	@Column(name="MON_MONEDA")
	private String monMoneda;

	//bi-directional many-to-one association to FdciDetciu
	@OneToMany(mappedBy="fmonMoneda")
	private List<FdciDetciu> fdciDetcius;

	public FmonMoneda() {
	}

	public long getMonSecuen() {
		return this.monSecuen;
	}

	public void setMonSecuen(long monSecuen) {
		this.monSecuen = monSecuen;
	}

	public BigDecimal getMonCotizacion() {
		return this.monCotizacion;
	}

	public void setMonCotizacion(BigDecimal monCotizacion) {
		this.monCotizacion = monCotizacion;
	}

	public String getMonMoneda() {
		return this.monMoneda;
	}

	public void setMonMoneda(String monMoneda) {
		this.monMoneda = monMoneda;
	}

	public List<FdciDetciu> getFdciDetcius() {
		return this.fdciDetcius;
	}

	public void setFdciDetcius(List<FdciDetciu> fdciDetcius) {
		this.fdciDetcius = fdciDetcius;
	}

	public FdciDetciu addFdciDetcius(FdciDetciu fdciDetcius) {
		getFdciDetcius().add(fdciDetcius);
		fdciDetcius.setFmonMoneda(this);

		return fdciDetcius;
	}

	public FdciDetciu removeFdciDetcius(FdciDetciu fdciDetcius) {
		getFdciDetcius().remove(fdciDetcius);
		fdciDetcius.setFmonMoneda(null);

		return fdciDetcius;
	}

}