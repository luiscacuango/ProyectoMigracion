package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FDSC_DESCUENTOS database table.
 * 
 */
@Entity
@Table(name="FDSC_DESCUENTOS")
@NamedQuery(name="FdscDescuento.findAll", query="SELECT f FROM FdscDescuento f")
public class FdscDescuento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DSC_SECUENCIA")
	private long dscSecuencia;

	@Temporal(TemporalType.DATE)
	@Column(name="DSC_FECHA")
	private Date dscFecha;

	@Column(name="DSC_VALOR")
	private BigDecimal dscValor;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	//bi-directional many-to-one association to FantSolant
	@ManyToOne
	@JoinColumn(name="ANT_SECUENCIA")
	private FantSolant fantSolant;

	public FdscDescuento() {
	}

	public long getDscSecuencia() {
		return this.dscSecuencia;
	}

	public void setDscSecuencia(long dscSecuencia) {
		this.dscSecuencia = dscSecuencia;
	}

	public Date getDscFecha() {
		return this.dscFecha;
	}

	public void setDscFecha(Date dscFecha) {
		this.dscFecha = dscFecha;
	}

	public BigDecimal getDscValor() {
		return this.dscValor;
	}

	public void setDscValor(BigDecimal dscValor) {
		this.dscValor = dscValor;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public FantSolant getFantSolant() {
		return this.fantSolant;
	}

	public void setFantSolant(FantSolant fantSolant) {
		this.fantSolant = fantSolant;
	}

}