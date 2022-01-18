package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPDR_PORDESREN database table.
 * 
 */
@Entity
@Table(name="FPDR_PORDESREN")
@NamedQuery(name="FpdrPordesren.findAll", query="SELECT f FROM FpdrPordesren f")
public class FpdrPordesren implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PDR_SECUEN")
	private long pdrSecuen;

	@Column(name="PDR_MAXGD")
	private BigDecimal pdrMaxgd;

	@Column(name="PDR_MINGD")
	private BigDecimal pdrMingd;

	@Column(name="PDR_NUMFRAC")
	private BigDecimal pdrNumfrac;

	@Column(name="PDR_PERIODO")
	private BigDecimal pdrPeriodo;

	//bi-directional many-to-one association to FtdrTipdesren
	@ManyToOne
	@JoinColumn(name="TDR_SECUENCIA")
	private FtdrTipdesren ftdrTipdesren;

	public FpdrPordesren() {
	}

	public long getPdrSecuen() {
		return this.pdrSecuen;
	}

	public void setPdrSecuen(long pdrSecuen) {
		this.pdrSecuen = pdrSecuen;
	}

	public BigDecimal getPdrMaxgd() {
		return this.pdrMaxgd;
	}

	public void setPdrMaxgd(BigDecimal pdrMaxgd) {
		this.pdrMaxgd = pdrMaxgd;
	}

	public BigDecimal getPdrMingd() {
		return this.pdrMingd;
	}

	public void setPdrMingd(BigDecimal pdrMingd) {
		this.pdrMingd = pdrMingd;
	}

	public BigDecimal getPdrNumfrac() {
		return this.pdrNumfrac;
	}

	public void setPdrNumfrac(BigDecimal pdrNumfrac) {
		this.pdrNumfrac = pdrNumfrac;
	}

	public BigDecimal getPdrPeriodo() {
		return this.pdrPeriodo;
	}

	public void setPdrPeriodo(BigDecimal pdrPeriodo) {
		this.pdrPeriodo = pdrPeriodo;
	}

	public FtdrTipdesren getFtdrTipdesren() {
		return this.ftdrTipdesren;
	}

	public void setFtdrTipdesren(FtdrTipdesren ftdrTipdesren) {
		this.ftdrTipdesren = ftdrTipdesren;
	}

}