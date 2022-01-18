package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PBCATVLD database table.
 * 
 */
@Entity
@NamedQuery(name="Pbcatvld.findAll", query="SELECT p FROM Pbcatvld p")
public class Pbcatvld implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PBV_CNTR")
	private BigDecimal pbvCntr;

	@Column(name="PBV_MSG")
	private String pbvMsg;

	@Column(name="PBV_NAME")
	private String pbvName;

	@Column(name="PBV_TYPE")
	private BigDecimal pbvType;

	@Column(name="PBV_VALD")
	private String pbvVald;

	public Pbcatvld() {
	}

	public BigDecimal getPbvCntr() {
		return this.pbvCntr;
	}

	public void setPbvCntr(BigDecimal pbvCntr) {
		this.pbvCntr = pbvCntr;
	}

	public String getPbvMsg() {
		return this.pbvMsg;
	}

	public void setPbvMsg(String pbvMsg) {
		this.pbvMsg = pbvMsg;
	}

	public String getPbvName() {
		return this.pbvName;
	}

	public void setPbvName(String pbvName) {
		this.pbvName = pbvName;
	}

	public BigDecimal getPbvType() {
		return this.pbvType;
	}

	public void setPbvType(BigDecimal pbvType) {
		this.pbvType = pbvType;
	}

	public String getPbvVald() {
		return this.pbvVald;
	}

	public void setPbvVald(String pbvVald) {
		this.pbvVald = pbvVald;
	}

}