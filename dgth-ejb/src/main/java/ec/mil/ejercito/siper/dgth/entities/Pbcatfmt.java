package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PBCATFMT database table.
 * 
 */
@Entity
@NamedQuery(name="Pbcatfmt.findAll", query="SELECT p FROM Pbcatfmt p")
public class Pbcatfmt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PBF_CNTR")
	private BigDecimal pbfCntr;

	@Column(name="PBF_FRMT")
	private String pbfFrmt;

	@Column(name="PBF_NAME")
	private String pbfName;

	@Column(name="PBF_TYPE")
	private BigDecimal pbfType;

	public Pbcatfmt() {
	}

	public BigDecimal getPbfCntr() {
		return this.pbfCntr;
	}

	public void setPbfCntr(BigDecimal pbfCntr) {
		this.pbfCntr = pbfCntr;
	}

	public String getPbfFrmt() {
		return this.pbfFrmt;
	}

	public void setPbfFrmt(String pbfFrmt) {
		this.pbfFrmt = pbfFrmt;
	}

	public String getPbfName() {
		return this.pbfName;
	}

	public void setPbfName(String pbfName) {
		this.pbfName = pbfName;
	}

	public BigDecimal getPbfType() {
		return this.pbfType;
	}

	public void setPbfType(BigDecimal pbfType) {
		this.pbfType = pbfType;
	}

}