package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPPR_PIAPROFORMA database table.
 * 
 */
@Entity
@Table(name="FPPR_PIAPROFORMA")
@NamedQuery(name="FpprPiaproforma.findAll", query="SELECT f FROM FpprPiaproforma f")
public class FpprPiaproforma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PPR_SECUENCIA")
	private long pprSecuencia;

	@Column(name="PPR_MES")
	private BigDecimal pprMes;

	@Column(name="PPR_MONTO")
	private BigDecimal pprMonto;

	@Column(name="PPR_PERIODOS")
	private BigDecimal pprPeriodos;

	@Column(name="PPR_TIPO")
	private String pprTipo;

	//bi-directional many-to-one association to FproProforma
	@ManyToOne
	@JoinColumn(name="PRO_SECUENCIA")
	private FproProforma fproProforma;

	public FpprPiaproforma() {
	}

	public long getPprSecuencia() {
		return this.pprSecuencia;
	}

	public void setPprSecuencia(long pprSecuencia) {
		this.pprSecuencia = pprSecuencia;
	}

	public BigDecimal getPprMes() {
		return this.pprMes;
	}

	public void setPprMes(BigDecimal pprMes) {
		this.pprMes = pprMes;
	}

	public BigDecimal getPprMonto() {
		return this.pprMonto;
	}

	public void setPprMonto(BigDecimal pprMonto) {
		this.pprMonto = pprMonto;
	}

	public BigDecimal getPprPeriodos() {
		return this.pprPeriodos;
	}

	public void setPprPeriodos(BigDecimal pprPeriodos) {
		this.pprPeriodos = pprPeriodos;
	}

	public String getPprTipo() {
		return this.pprTipo;
	}

	public void setPprTipo(String pprTipo) {
		this.pprTipo = pprTipo;
	}

	public FproProforma getFproProforma() {
		return this.fproProforma;
	}

	public void setFproProforma(FproProforma fproProforma) {
		this.fproProforma = fproProforma;
	}

}