package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FMVD_DETMOV database table.
 * 
 */
@Entity
@Table(name="FMVD_DETMOV")
@NamedQuery(name="FmvdDetmov.findAll", query="SELECT f FROM FmvdDetmov f")
public class FmvdDetmov implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MVD_SECUEN")
	private long mvdSecuen;

	@Column(name="FMV_MVT_SECUEN")
	private BigDecimal fmvMvtSecuen;

	@Column(name="MVD_COMPROMISO")
	private BigDecimal mvdCompromiso;

	@Column(name="MVD_DESCRI")
	private String mvdDescri;

	@Column(name="MVD_DEVENGADO")
	private String mvdDevengado;

	@Column(name="MVD_ESTADO")
	private String mvdEstado;

	@Column(name="MVD_MONTO")
	private BigDecimal mvdMonto;

	@Column(name="MVD_SALDO")
	private BigDecimal mvdSaldo;

	@Column(name="MVD_SECUENPI")
	private BigDecimal mvdSecuenpi;

	@Column(name="MVD_USUARIO")
	private String mvdUsuario;

	@Column(name="ORG_CODSEC")
	private BigDecimal orgCodsec;

	//bi-directional many-to-one association to FcmpCompromiso
	@ManyToOne
	@JoinColumn(name="CMP_SECUENCIAL")
	private FcmpCompromiso fcmpCompromiso;

	//bi-directional many-to-one association to FmvtMovpresu
	@ManyToOne
	@JoinColumn(name="MVT_SECUEN")
	private FmvtMovpresu fmvtMovpresu;

	//bi-directional many-to-one association to FparPresup
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="PAR_ANIO", referencedColumnName="PAR_ANIO"),
		@JoinColumn(name="PAR_CODIGO", referencedColumnName="PAR_CODIGO")
		})
	private FparPresup fparPresup;

	public FmvdDetmov() {
	}

	public long getMvdSecuen() {
		return this.mvdSecuen;
	}

	public void setMvdSecuen(long mvdSecuen) {
		this.mvdSecuen = mvdSecuen;
	}

	public BigDecimal getFmvMvtSecuen() {
		return this.fmvMvtSecuen;
	}

	public void setFmvMvtSecuen(BigDecimal fmvMvtSecuen) {
		this.fmvMvtSecuen = fmvMvtSecuen;
	}

	public BigDecimal getMvdCompromiso() {
		return this.mvdCompromiso;
	}

	public void setMvdCompromiso(BigDecimal mvdCompromiso) {
		this.mvdCompromiso = mvdCompromiso;
	}

	public String getMvdDescri() {
		return this.mvdDescri;
	}

	public void setMvdDescri(String mvdDescri) {
		this.mvdDescri = mvdDescri;
	}

	public String getMvdDevengado() {
		return this.mvdDevengado;
	}

	public void setMvdDevengado(String mvdDevengado) {
		this.mvdDevengado = mvdDevengado;
	}

	public String getMvdEstado() {
		return this.mvdEstado;
	}

	public void setMvdEstado(String mvdEstado) {
		this.mvdEstado = mvdEstado;
	}

	public BigDecimal getMvdMonto() {
		return this.mvdMonto;
	}

	public void setMvdMonto(BigDecimal mvdMonto) {
		this.mvdMonto = mvdMonto;
	}

	public BigDecimal getMvdSaldo() {
		return this.mvdSaldo;
	}

	public void setMvdSaldo(BigDecimal mvdSaldo) {
		this.mvdSaldo = mvdSaldo;
	}

	public BigDecimal getMvdSecuenpi() {
		return this.mvdSecuenpi;
	}

	public void setMvdSecuenpi(BigDecimal mvdSecuenpi) {
		this.mvdSecuenpi = mvdSecuenpi;
	}

	public String getMvdUsuario() {
		return this.mvdUsuario;
	}

	public void setMvdUsuario(String mvdUsuario) {
		this.mvdUsuario = mvdUsuario;
	}

	public BigDecimal getOrgCodsec() {
		return this.orgCodsec;
	}

	public void setOrgCodsec(BigDecimal orgCodsec) {
		this.orgCodsec = orgCodsec;
	}

	public FcmpCompromiso getFcmpCompromiso() {
		return this.fcmpCompromiso;
	}

	public void setFcmpCompromiso(FcmpCompromiso fcmpCompromiso) {
		this.fcmpCompromiso = fcmpCompromiso;
	}

	public FmvtMovpresu getFmvtMovpresu() {
		return this.fmvtMovpresu;
	}

	public void setFmvtMovpresu(FmvtMovpresu fmvtMovpresu) {
		this.fmvtMovpresu = fmvtMovpresu;
	}

	public FparPresup getFparPresup() {
		return this.fparPresup;
	}

	public void setFparPresup(FparPresup fparPresup) {
		this.fparPresup = fparPresup;
	}

}