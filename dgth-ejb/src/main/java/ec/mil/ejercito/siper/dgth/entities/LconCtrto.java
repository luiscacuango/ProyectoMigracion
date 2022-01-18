package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the LCON_CTRTO database table.
 * 
 */
@Entity
@Table(name="LCON_CTRTO")
@NamedQuery(name="LconCtrto.findAll", query="SELECT l FROM LconCtrto l")
public class LconCtrto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CON_CODIGO")
	private long conCodigo;

	@Column(name="CON_ANTICIPO")
	private BigDecimal conAnticipo;

	@Column(name="CON_CAUSAL")
	private String conCausal;

	@Column(name="CON_ESTADO")
	private String conEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="CON_FECAPROB")
	private Date conFecaprob;

	@Temporal(TemporalType.DATE)
	@Column(name="CON_FECCANAP")
	private Date conFeccanap;

	@Temporal(TemporalType.DATE)
	@Column(name="CON_FECCANC")
	private Date conFeccanc;

	@Temporal(TemporalType.DATE)
	@Column(name="CON_FECEMI")
	private Date conFecemi;

	@Temporal(TemporalType.DATE)
	@Column(name="CON_FECENTES")
	private Date conFecentes;

	@Temporal(TemporalType.DATE)
	@Column(name="CON_FECVEN")
	private Date conFecven;

	@Temporal(TemporalType.DATE)
	@Column(name="CON_FECVENC")
	private Date conFecvenc;

	@Column(name="CON_GARANTIA")
	private String conGarantia;

	@Column(name="CON_LUGENTR")
	private String conLugentr;

	@Column(name="CON_MONTO")
	private double conMonto;

	@Column(name="CON_MORA")
	private String conMora;

	@Column(name="CON_NUMCUOT")
	private BigDecimal conNumcuot;

	@Column(name="CON_NUMERO")
	private String conNumero;

	@Column(name="CON_NUMESI")
	private String conNumesi;

	@Column(name="CON_OBJCONT")
	private String conObjcont;

	@Column(name="CON_OBSERVA")
	private String conObserva;

	@Temporal(TemporalType.DATE)
	@Column(name="CON_PLAENT")
	private Date conPlaent;

	@Column(name="CPE_CEDRUCPAS")
	private String cpeCedrucpas;

	@Column(name="FPA_CODIGO")
	private BigDecimal fpaCodigo;

	@Column(name="PRF_CODIGO")
	private BigDecimal prfCodigo;

	@Column(name="REQ_CODIGOR")
	private BigDecimal reqCodigor;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	//bi-directional many-to-one association to FncuNumcur
	@OneToMany(mappedBy="lconCtrto")
	private List<FncuNumcur> fncuNumcurs;

	//bi-directional many-to-one association to LgarGaran
	@OneToMany(mappedBy="lconCtrto")
	private List<LgarGaran> lgarGarans;

	public LconCtrto() {
	}

	public long getConCodigo() {
		return this.conCodigo;
	}

	public void setConCodigo(long conCodigo) {
		this.conCodigo = conCodigo;
	}

	public BigDecimal getConAnticipo() {
		return this.conAnticipo;
	}

	public void setConAnticipo(BigDecimal conAnticipo) {
		this.conAnticipo = conAnticipo;
	}

	public String getConCausal() {
		return this.conCausal;
	}

	public void setConCausal(String conCausal) {
		this.conCausal = conCausal;
	}

	public String getConEstado() {
		return this.conEstado;
	}

	public void setConEstado(String conEstado) {
		this.conEstado = conEstado;
	}

	public Date getConFecaprob() {
		return this.conFecaprob;
	}

	public void setConFecaprob(Date conFecaprob) {
		this.conFecaprob = conFecaprob;
	}

	public Date getConFeccanap() {
		return this.conFeccanap;
	}

	public void setConFeccanap(Date conFeccanap) {
		this.conFeccanap = conFeccanap;
	}

	public Date getConFeccanc() {
		return this.conFeccanc;
	}

	public void setConFeccanc(Date conFeccanc) {
		this.conFeccanc = conFeccanc;
	}

	public Date getConFecemi() {
		return this.conFecemi;
	}

	public void setConFecemi(Date conFecemi) {
		this.conFecemi = conFecemi;
	}

	public Date getConFecentes() {
		return this.conFecentes;
	}

	public void setConFecentes(Date conFecentes) {
		this.conFecentes = conFecentes;
	}

	public Date getConFecven() {
		return this.conFecven;
	}

	public void setConFecven(Date conFecven) {
		this.conFecven = conFecven;
	}

	public Date getConFecvenc() {
		return this.conFecvenc;
	}

	public void setConFecvenc(Date conFecvenc) {
		this.conFecvenc = conFecvenc;
	}

	public String getConGarantia() {
		return this.conGarantia;
	}

	public void setConGarantia(String conGarantia) {
		this.conGarantia = conGarantia;
	}

	public String getConLugentr() {
		return this.conLugentr;
	}

	public void setConLugentr(String conLugentr) {
		this.conLugentr = conLugentr;
	}

	public double getConMonto() {
		return this.conMonto;
	}

	public void setConMonto(double conMonto) {
		this.conMonto = conMonto;
	}

	public String getConMora() {
		return this.conMora;
	}

	public void setConMora(String conMora) {
		this.conMora = conMora;
	}

	public BigDecimal getConNumcuot() {
		return this.conNumcuot;
	}

	public void setConNumcuot(BigDecimal conNumcuot) {
		this.conNumcuot = conNumcuot;
	}

	public String getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	public String getConNumesi() {
		return this.conNumesi;
	}

	public void setConNumesi(String conNumesi) {
		this.conNumesi = conNumesi;
	}

	public String getConObjcont() {
		return this.conObjcont;
	}

	public void setConObjcont(String conObjcont) {
		this.conObjcont = conObjcont;
	}

	public String getConObserva() {
		return this.conObserva;
	}

	public void setConObserva(String conObserva) {
		this.conObserva = conObserva;
	}

	public Date getConPlaent() {
		return this.conPlaent;
	}

	public void setConPlaent(Date conPlaent) {
		this.conPlaent = conPlaent;
	}

	public String getCpeCedrucpas() {
		return this.cpeCedrucpas;
	}

	public void setCpeCedrucpas(String cpeCedrucpas) {
		this.cpeCedrucpas = cpeCedrucpas;
	}

	public BigDecimal getFpaCodigo() {
		return this.fpaCodigo;
	}

	public void setFpaCodigo(BigDecimal fpaCodigo) {
		this.fpaCodigo = fpaCodigo;
	}

	public BigDecimal getPrfCodigo() {
		return this.prfCodigo;
	}

	public void setPrfCodigo(BigDecimal prfCodigo) {
		this.prfCodigo = prfCodigo;
	}

	public BigDecimal getReqCodigor() {
		return this.reqCodigor;
	}

	public void setReqCodigor(BigDecimal reqCodigor) {
		this.reqCodigor = reqCodigor;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public List<FncuNumcur> getFncuNumcurs() {
		return this.fncuNumcurs;
	}

	public void setFncuNumcurs(List<FncuNumcur> fncuNumcurs) {
		this.fncuNumcurs = fncuNumcurs;
	}

	public FncuNumcur addFncuNumcur(FncuNumcur fncuNumcur) {
		getFncuNumcurs().add(fncuNumcur);
		fncuNumcur.setLconCtrto(this);

		return fncuNumcur;
	}

	public FncuNumcur removeFncuNumcur(FncuNumcur fncuNumcur) {
		getFncuNumcurs().remove(fncuNumcur);
		fncuNumcur.setLconCtrto(null);

		return fncuNumcur;
	}

	public List<LgarGaran> getLgarGarans() {
		return this.lgarGarans;
	}

	public void setLgarGarans(List<LgarGaran> lgarGarans) {
		this.lgarGarans = lgarGarans;
	}

	public LgarGaran addLgarGaran(LgarGaran lgarGaran) {
		getLgarGarans().add(lgarGaran);
		lgarGaran.setLconCtrto(this);

		return lgarGaran;
	}

	public LgarGaran removeLgarGaran(LgarGaran lgarGaran) {
		getLgarGarans().remove(lgarGaran);
		lgarGaran.setLconCtrto(null);

		return lgarGaran;
	}

}