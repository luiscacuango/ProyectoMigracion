package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FCAR_PORTAFOLIO database table.
 * 
 */
@Entity
@Table(name="FCAR_PORTAFOLIO")
@NamedQuery(name="FcarPortafolio.findAll", query="SELECT f FROM FcarPortafolio f")
public class FcarPortafolio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FcarPortafolioPK id;

	@Column(name="CAR_ASOCIADO")
	private String carAsociado;

	@Column(name="CAR_CUENTA")
	private String carCuenta;

	@Column(name="CAR_PRINCIPAL")
	private BigDecimal carPrincipal;

	//bi-directional many-to-one association to FdciDetciu
	@ManyToOne
	@JoinColumn(name="FDC_DCI_CODIGO")
	private FdciDetciu fdciDetciu;

	public FcarPortafolio() {
	}

	public FcarPortafolioPK getId() {
		return this.id;
	}

	public void setId(FcarPortafolioPK id) {
		this.id = id;
	}

	public String getCarAsociado() {
		return this.carAsociado;
	}

	public void setCarAsociado(String carAsociado) {
		this.carAsociado = carAsociado;
	}

	public String getCarCuenta() {
		return this.carCuenta;
	}

	public void setCarCuenta(String carCuenta) {
		this.carCuenta = carCuenta;
	}

	public BigDecimal getCarPrincipal() {
		return this.carPrincipal;
	}

	public void setCarPrincipal(BigDecimal carPrincipal) {
		this.carPrincipal = carPrincipal;
	}

	public FdciDetciu getFdciDetciu() {
		return this.fdciDetciu;
	}

	public void setFdciDetciu(FdciDetciu fdciDetciu) {
		this.fdciDetciu = fdciDetciu;
	}

}