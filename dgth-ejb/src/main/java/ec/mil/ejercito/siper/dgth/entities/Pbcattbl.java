package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PBCATTBL database table.
 * 
 */
@Entity
@NamedQuery(name="Pbcattbl.findAll", query="SELECT p FROM Pbcattbl p")
public class Pbcattbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PBD_FCHR")
	private BigDecimal pbdFchr;

	@Column(name="PBD_FFCE")
	private String pbdFfce;

	@Column(name="PBD_FHGT")
	private BigDecimal pbdFhgt;

	@Column(name="PBD_FITL")
	private String pbdFitl;

	@Column(name="PBD_FPTC")
	private BigDecimal pbdFptc;

	@Column(name="PBD_FUNL")
	private String pbdFunl;

	@Column(name="PBD_FWGT")
	private BigDecimal pbdFwgt;

	@Column(name="PBH_FCHR")
	private BigDecimal pbhFchr;

	@Column(name="PBH_FFCE")
	private String pbhFfce;

	@Column(name="PBH_FHGT")
	private BigDecimal pbhFhgt;

	@Column(name="PBH_FITL")
	private String pbhFitl;

	@Column(name="PBH_FPTC")
	private BigDecimal pbhFptc;

	@Column(name="PBH_FUNL")
	private String pbhFunl;

	@Column(name="PBH_FWGT")
	private BigDecimal pbhFwgt;

	@Column(name="PBL_FCHR")
	private BigDecimal pblFchr;

	@Column(name="PBL_FFCE")
	private String pblFfce;

	@Column(name="PBL_FHGT")
	private BigDecimal pblFhgt;

	@Column(name="PBL_FITL")
	private String pblFitl;

	@Column(name="PBL_FPTC")
	private BigDecimal pblFptc;

	@Column(name="PBL_FUNL")
	private String pblFunl;

	@Column(name="PBL_FWGT")
	private BigDecimal pblFwgt;

	@Column(name="PBT_CMNT")
	private String pbtCmnt;

	@Column(name="PBT_OWNR")
	private String pbtOwnr;

	@Column(name="PBT_TID")
	private BigDecimal pbtTid;

	@Column(name="PBT_TNAM")
	private String pbtTnam;

	public Pbcattbl() {
	}

	public BigDecimal getPbdFchr() {
		return this.pbdFchr;
	}

	public void setPbdFchr(BigDecimal pbdFchr) {
		this.pbdFchr = pbdFchr;
	}

	public String getPbdFfce() {
		return this.pbdFfce;
	}

	public void setPbdFfce(String pbdFfce) {
		this.pbdFfce = pbdFfce;
	}

	public BigDecimal getPbdFhgt() {
		return this.pbdFhgt;
	}

	public void setPbdFhgt(BigDecimal pbdFhgt) {
		this.pbdFhgt = pbdFhgt;
	}

	public String getPbdFitl() {
		return this.pbdFitl;
	}

	public void setPbdFitl(String pbdFitl) {
		this.pbdFitl = pbdFitl;
	}

	public BigDecimal getPbdFptc() {
		return this.pbdFptc;
	}

	public void setPbdFptc(BigDecimal pbdFptc) {
		this.pbdFptc = pbdFptc;
	}

	public String getPbdFunl() {
		return this.pbdFunl;
	}

	public void setPbdFunl(String pbdFunl) {
		this.pbdFunl = pbdFunl;
	}

	public BigDecimal getPbdFwgt() {
		return this.pbdFwgt;
	}

	public void setPbdFwgt(BigDecimal pbdFwgt) {
		this.pbdFwgt = pbdFwgt;
	}

	public BigDecimal getPbhFchr() {
		return this.pbhFchr;
	}

	public void setPbhFchr(BigDecimal pbhFchr) {
		this.pbhFchr = pbhFchr;
	}

	public String getPbhFfce() {
		return this.pbhFfce;
	}

	public void setPbhFfce(String pbhFfce) {
		this.pbhFfce = pbhFfce;
	}

	public BigDecimal getPbhFhgt() {
		return this.pbhFhgt;
	}

	public void setPbhFhgt(BigDecimal pbhFhgt) {
		this.pbhFhgt = pbhFhgt;
	}

	public String getPbhFitl() {
		return this.pbhFitl;
	}

	public void setPbhFitl(String pbhFitl) {
		this.pbhFitl = pbhFitl;
	}

	public BigDecimal getPbhFptc() {
		return this.pbhFptc;
	}

	public void setPbhFptc(BigDecimal pbhFptc) {
		this.pbhFptc = pbhFptc;
	}

	public String getPbhFunl() {
		return this.pbhFunl;
	}

	public void setPbhFunl(String pbhFunl) {
		this.pbhFunl = pbhFunl;
	}

	public BigDecimal getPbhFwgt() {
		return this.pbhFwgt;
	}

	public void setPbhFwgt(BigDecimal pbhFwgt) {
		this.pbhFwgt = pbhFwgt;
	}

	public BigDecimal getPblFchr() {
		return this.pblFchr;
	}

	public void setPblFchr(BigDecimal pblFchr) {
		this.pblFchr = pblFchr;
	}

	public String getPblFfce() {
		return this.pblFfce;
	}

	public void setPblFfce(String pblFfce) {
		this.pblFfce = pblFfce;
	}

	public BigDecimal getPblFhgt() {
		return this.pblFhgt;
	}

	public void setPblFhgt(BigDecimal pblFhgt) {
		this.pblFhgt = pblFhgt;
	}

	public String getPblFitl() {
		return this.pblFitl;
	}

	public void setPblFitl(String pblFitl) {
		this.pblFitl = pblFitl;
	}

	public BigDecimal getPblFptc() {
		return this.pblFptc;
	}

	public void setPblFptc(BigDecimal pblFptc) {
		this.pblFptc = pblFptc;
	}

	public String getPblFunl() {
		return this.pblFunl;
	}

	public void setPblFunl(String pblFunl) {
		this.pblFunl = pblFunl;
	}

	public BigDecimal getPblFwgt() {
		return this.pblFwgt;
	}

	public void setPblFwgt(BigDecimal pblFwgt) {
		this.pblFwgt = pblFwgt;
	}

	public String getPbtCmnt() {
		return this.pbtCmnt;
	}

	public void setPbtCmnt(String pbtCmnt) {
		this.pbtCmnt = pbtCmnt;
	}

	public String getPbtOwnr() {
		return this.pbtOwnr;
	}

	public void setPbtOwnr(String pbtOwnr) {
		this.pbtOwnr = pbtOwnr;
	}

	public BigDecimal getPbtTid() {
		return this.pbtTid;
	}

	public void setPbtTid(BigDecimal pbtTid) {
		this.pbtTid = pbtTid;
	}

	public String getPbtTnam() {
		return this.pbtTnam;
	}

	public void setPbtTnam(String pbtTnam) {
		this.pbtTnam = pbtTnam;
	}

}