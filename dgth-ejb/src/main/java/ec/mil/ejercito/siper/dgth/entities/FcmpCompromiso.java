package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FCMP_COMPROMISO database table.
 * 
 */
@Entity
@Table(name="FCMP_COMPROMISO")
@NamedQuery(name="FcmpCompromiso.findAll", query="SELECT f FROM FcmpCompromiso f")
public class FcmpCompromiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CMP_SECUENCIAL")
	private double cmpSecuencial;

	@Column(name="CMP_COMPROBANTE")
	private String cmpComprobante;

	@Column(name="CMP_CUR")
	private BigDecimal cmpCur;

	@Column(name="CMP_DESCRI")
	private String cmpDescri;

	@Column(name="CMP_DEVENGADO")
	private String cmpDevengado;

	@Column(name="CMP_ESTADO")
	private String cmpEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="CMP_FECAPRN")
	private Date cmpFecaprn;

	@Temporal(TemporalType.DATE)
	@Column(name="CMP_FECELA")
	private Date cmpFecela;

	@Column(name="CMP_NUMERO")
	private double cmpNumero;

	@Column(name="CMP_ORDEN")
	private BigDecimal cmpOrden;

	@Column(name="CMP_USUARIO")
	private String cmpUsuario;

	@Column(name="ORG_CODSEC")
	private BigDecimal orgCodsec;

	//bi-directional many-to-one association to FmvdDetmov
	@OneToMany(mappedBy="fcmpCompromiso")
	private List<FmvdDetmov> fmvdDetmovs;

	public FcmpCompromiso() {
	}

	public double getCmpSecuencial() {
		return this.cmpSecuencial;
	}

	public void setCmpSecuencial(double cmpSecuencial) {
		this.cmpSecuencial = cmpSecuencial;
	}

	public String getCmpComprobante() {
		return this.cmpComprobante;
	}

	public void setCmpComprobante(String cmpComprobante) {
		this.cmpComprobante = cmpComprobante;
	}

	public BigDecimal getCmpCur() {
		return this.cmpCur;
	}

	public void setCmpCur(BigDecimal cmpCur) {
		this.cmpCur = cmpCur;
	}

	public String getCmpDescri() {
		return this.cmpDescri;
	}

	public void setCmpDescri(String cmpDescri) {
		this.cmpDescri = cmpDescri;
	}

	public String getCmpDevengado() {
		return this.cmpDevengado;
	}

	public void setCmpDevengado(String cmpDevengado) {
		this.cmpDevengado = cmpDevengado;
	}

	public String getCmpEstado() {
		return this.cmpEstado;
	}

	public void setCmpEstado(String cmpEstado) {
		this.cmpEstado = cmpEstado;
	}

	public Date getCmpFecaprn() {
		return this.cmpFecaprn;
	}

	public void setCmpFecaprn(Date cmpFecaprn) {
		this.cmpFecaprn = cmpFecaprn;
	}

	public Date getCmpFecela() {
		return this.cmpFecela;
	}

	public void setCmpFecela(Date cmpFecela) {
		this.cmpFecela = cmpFecela;
	}

	public double getCmpNumero() {
		return this.cmpNumero;
	}

	public void setCmpNumero(double cmpNumero) {
		this.cmpNumero = cmpNumero;
	}

	public BigDecimal getCmpOrden() {
		return this.cmpOrden;
	}

	public void setCmpOrden(BigDecimal cmpOrden) {
		this.cmpOrden = cmpOrden;
	}

	public String getCmpUsuario() {
		return this.cmpUsuario;
	}

	public void setCmpUsuario(String cmpUsuario) {
		this.cmpUsuario = cmpUsuario;
	}

	public BigDecimal getOrgCodsec() {
		return this.orgCodsec;
	}

	public void setOrgCodsec(BigDecimal orgCodsec) {
		this.orgCodsec = orgCodsec;
	}

	public List<FmvdDetmov> getFmvdDetmovs() {
		return this.fmvdDetmovs;
	}

	public void setFmvdDetmovs(List<FmvdDetmov> fmvdDetmovs) {
		this.fmvdDetmovs = fmvdDetmovs;
	}

	public FmvdDetmov addFmvdDetmov(FmvdDetmov fmvdDetmov) {
		getFmvdDetmovs().add(fmvdDetmov);
		fmvdDetmov.setFcmpCompromiso(this);

		return fmvdDetmov;
	}

	public FmvdDetmov removeFmvdDetmov(FmvdDetmov fmvdDetmov) {
		getFmvdDetmovs().remove(fmvdDetmov);
		fmvdDetmov.setFcmpCompromiso(null);

		return fmvdDetmov;
	}

}