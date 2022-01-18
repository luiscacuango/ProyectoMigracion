package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PBCATCOL database table.
 * 
 */
@Entity
@NamedQuery(name="Pbcatcol.findAll", query="SELECT p FROM Pbcatcol p")
public class Pbcatcol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PBC_BMAP")
	private String pbcBmap;

	@Column(name="PBC_CASE")
	private BigDecimal pbcCase;

	@Column(name="PBC_CID")
	private BigDecimal pbcCid;

	@Column(name="PBC_CMNT")
	private String pbcCmnt;

	@Column(name="PBC_CNAM")
	private String pbcCnam;

	@Column(name="PBC_EDIT")
	private String pbcEdit;

	@Column(name="PBC_HDR")
	private String pbcHdr;

	@Column(name="PBC_HGHT")
	private BigDecimal pbcHght;

	@Column(name="PBC_HPOS")
	private BigDecimal pbcHpos;

	@Column(name="PBC_INIT")
	private String pbcInit;

	@Column(name="PBC_JTFY")
	private BigDecimal pbcJtfy;

	@Column(name="PBC_LABL")
	private String pbcLabl;

	@Column(name="PBC_LPOS")
	private BigDecimal pbcLpos;

	@Column(name="PBC_MASK")
	private String pbcMask;

	@Column(name="PBC_OWNR")
	private String pbcOwnr;

	@Column(name="PBC_PTRN")
	private String pbcPtrn;

	@Column(name="PBC_TAG")
	private String pbcTag;

	@Column(name="PBC_TID")
	private BigDecimal pbcTid;

	@Column(name="PBC_TNAM")
	private String pbcTnam;

	@Column(name="PBC_WDTH")
	private BigDecimal pbcWdth;

	public Pbcatcol() {
	}

	public String getPbcBmap() {
		return this.pbcBmap;
	}

	public void setPbcBmap(String pbcBmap) {
		this.pbcBmap = pbcBmap;
	}

	public BigDecimal getPbcCase() {
		return this.pbcCase;
	}

	public void setPbcCase(BigDecimal pbcCase) {
		this.pbcCase = pbcCase;
	}

	public BigDecimal getPbcCid() {
		return this.pbcCid;
	}

	public void setPbcCid(BigDecimal pbcCid) {
		this.pbcCid = pbcCid;
	}

	public String getPbcCmnt() {
		return this.pbcCmnt;
	}

	public void setPbcCmnt(String pbcCmnt) {
		this.pbcCmnt = pbcCmnt;
	}

	public String getPbcCnam() {
		return this.pbcCnam;
	}

	public void setPbcCnam(String pbcCnam) {
		this.pbcCnam = pbcCnam;
	}

	public String getPbcEdit() {
		return this.pbcEdit;
	}

	public void setPbcEdit(String pbcEdit) {
		this.pbcEdit = pbcEdit;
	}

	public String getPbcHdr() {
		return this.pbcHdr;
	}

	public void setPbcHdr(String pbcHdr) {
		this.pbcHdr = pbcHdr;
	}

	public BigDecimal getPbcHght() {
		return this.pbcHght;
	}

	public void setPbcHght(BigDecimal pbcHght) {
		this.pbcHght = pbcHght;
	}

	public BigDecimal getPbcHpos() {
		return this.pbcHpos;
	}

	public void setPbcHpos(BigDecimal pbcHpos) {
		this.pbcHpos = pbcHpos;
	}

	public String getPbcInit() {
		return this.pbcInit;
	}

	public void setPbcInit(String pbcInit) {
		this.pbcInit = pbcInit;
	}

	public BigDecimal getPbcJtfy() {
		return this.pbcJtfy;
	}

	public void setPbcJtfy(BigDecimal pbcJtfy) {
		this.pbcJtfy = pbcJtfy;
	}

	public String getPbcLabl() {
		return this.pbcLabl;
	}

	public void setPbcLabl(String pbcLabl) {
		this.pbcLabl = pbcLabl;
	}

	public BigDecimal getPbcLpos() {
		return this.pbcLpos;
	}

	public void setPbcLpos(BigDecimal pbcLpos) {
		this.pbcLpos = pbcLpos;
	}

	public String getPbcMask() {
		return this.pbcMask;
	}

	public void setPbcMask(String pbcMask) {
		this.pbcMask = pbcMask;
	}

	public String getPbcOwnr() {
		return this.pbcOwnr;
	}

	public void setPbcOwnr(String pbcOwnr) {
		this.pbcOwnr = pbcOwnr;
	}

	public String getPbcPtrn() {
		return this.pbcPtrn;
	}

	public void setPbcPtrn(String pbcPtrn) {
		this.pbcPtrn = pbcPtrn;
	}

	public String getPbcTag() {
		return this.pbcTag;
	}

	public void setPbcTag(String pbcTag) {
		this.pbcTag = pbcTag;
	}

	public BigDecimal getPbcTid() {
		return this.pbcTid;
	}

	public void setPbcTid(BigDecimal pbcTid) {
		this.pbcTid = pbcTid;
	}

	public String getPbcTnam() {
		return this.pbcTnam;
	}

	public void setPbcTnam(String pbcTnam) {
		this.pbcTnam = pbcTnam;
	}

	public BigDecimal getPbcWdth() {
		return this.pbcWdth;
	}

	public void setPbcWdth(BigDecimal pbcWdth) {
		this.pbcWdth = pbcWdth;
	}

}