package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PBCATEDT database table.
 * 
 */
@Entity
@NamedQuery(name="Pbcatedt.findAll", query="SELECT p FROM Pbcatedt p")
public class Pbcatedt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PBE_CNTR")
	private BigDecimal pbeCntr;

	@Column(name="PBE_EDIT")
	private String pbeEdit;

	@Column(name="PBE_FLAG")
	private BigDecimal pbeFlag;

	@Column(name="PBE_NAME")
	private String pbeName;

	@Column(name="PBE_SEQN")
	private BigDecimal pbeSeqn;

	@Column(name="PBE_TYPE")
	private BigDecimal pbeType;

	@Column(name="PBE_WORK")
	private String pbeWork;

	public Pbcatedt() {
	}

	public BigDecimal getPbeCntr() {
		return this.pbeCntr;
	}

	public void setPbeCntr(BigDecimal pbeCntr) {
		this.pbeCntr = pbeCntr;
	}

	public String getPbeEdit() {
		return this.pbeEdit;
	}

	public void setPbeEdit(String pbeEdit) {
		this.pbeEdit = pbeEdit;
	}

	public BigDecimal getPbeFlag() {
		return this.pbeFlag;
	}

	public void setPbeFlag(BigDecimal pbeFlag) {
		this.pbeFlag = pbeFlag;
	}

	public String getPbeName() {
		return this.pbeName;
	}

	public void setPbeName(String pbeName) {
		this.pbeName = pbeName;
	}

	public BigDecimal getPbeSeqn() {
		return this.pbeSeqn;
	}

	public void setPbeSeqn(BigDecimal pbeSeqn) {
		this.pbeSeqn = pbeSeqn;
	}

	public BigDecimal getPbeType() {
		return this.pbeType;
	}

	public void setPbeType(BigDecimal pbeType) {
		this.pbeType = pbeType;
	}

	public String getPbeWork() {
		return this.pbeWork;
	}

	public void setPbeWork(String pbeWork) {
		this.pbeWork = pbeWork;
	}

}