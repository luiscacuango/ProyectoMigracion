package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FMVT_MOVPRESU database table.
 * 
 */
@Entity
@Table(name="FMVT_MOVPRESU")
@NamedQuery(name="FmvtMovpresu.findAll", query="SELECT f FROM FmvtMovpresu f")
public class FmvtMovpresu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MVT_SECUEN")
	private long mvtSecuen;

	@Column(name="COG_NUMEROG")
	private BigDecimal cogNumerog;

	@Column(name="MVT_COD_PRESUP")
	private BigDecimal mvtCodPresup;

	@Column(name="MVT_DESCRI")
	private String mvtDescri;

	@Column(name="MVT_ESTADO")
	private String mvtEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="MVT_FECAPR")
	private Date mvtFecapr;

	@Temporal(TemporalType.DATE)
	@Column(name="MVT_FECELA")
	private Date mvtFecela;

	@Column(name="MVT_NUMERORP")
	private BigDecimal mvtNumerorp;

	@Column(name="MVT_REFORMA")
	private String mvtReforma;

	@Column(name="MVT_RESOLU")
	private String mvtResolu;

	@Column(name="MVT_RP")
	private BigDecimal mvtRp;

	@Column(name="MVT_TIPMOV")
	private String mvtTipmov;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	//bi-directional many-to-one association to FmvdDetmov
	@OneToMany(mappedBy="fmvtMovpresu")
	private List<FmvdDetmov> fmvdDetmovs;

	//bi-directional many-to-one association to FmvtMovpresu
	@ManyToOne
	@JoinColumn(name="FMV_MVT_SECUEN")
	private FmvtMovpresu fmvtMovpresu;

	//bi-directional many-to-one association to FmvtMovpresu
	@OneToMany(mappedBy="fmvtMovpresu")
	private List<FmvtMovpresu> fmvtMovpresus;

	//bi-directional many-to-one association to FparPresup
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="MVT_ANIO", referencedColumnName="PAR_ANIO"),
		@JoinColumn(name="PAR_CODIGO", referencedColumnName="PAR_CODIGO")
		})
	private FparPresup fparPresup;

	//bi-directional many-to-one association to FprgEjecucion
	@OneToMany(mappedBy="fmvtMovpresu1")
	private List<FprgEjecucion> fprgEjecucions1;

	//bi-directional many-to-one association to FprgEjecucion
	@OneToMany(mappedBy="fmvtMovpresu2")
	private List<FprgEjecucion> fprgEjecucions2;

	public FmvtMovpresu() {
	}

	public long getMvtSecuen() {
		return this.mvtSecuen;
	}

	public void setMvtSecuen(long mvtSecuen) {
		this.mvtSecuen = mvtSecuen;
	}

	public BigDecimal getCogNumerog() {
		return this.cogNumerog;
	}

	public void setCogNumerog(BigDecimal cogNumerog) {
		this.cogNumerog = cogNumerog;
	}

	public BigDecimal getMvtCodPresup() {
		return this.mvtCodPresup;
	}

	public void setMvtCodPresup(BigDecimal mvtCodPresup) {
		this.mvtCodPresup = mvtCodPresup;
	}

	public String getMvtDescri() {
		return this.mvtDescri;
	}

	public void setMvtDescri(String mvtDescri) {
		this.mvtDescri = mvtDescri;
	}

	public String getMvtEstado() {
		return this.mvtEstado;
	}

	public void setMvtEstado(String mvtEstado) {
		this.mvtEstado = mvtEstado;
	}

	public Date getMvtFecapr() {
		return this.mvtFecapr;
	}

	public void setMvtFecapr(Date mvtFecapr) {
		this.mvtFecapr = mvtFecapr;
	}

	public Date getMvtFecela() {
		return this.mvtFecela;
	}

	public void setMvtFecela(Date mvtFecela) {
		this.mvtFecela = mvtFecela;
	}

	public BigDecimal getMvtNumerorp() {
		return this.mvtNumerorp;
	}

	public void setMvtNumerorp(BigDecimal mvtNumerorp) {
		this.mvtNumerorp = mvtNumerorp;
	}

	public String getMvtReforma() {
		return this.mvtReforma;
	}

	public void setMvtReforma(String mvtReforma) {
		this.mvtReforma = mvtReforma;
	}

	public String getMvtResolu() {
		return this.mvtResolu;
	}

	public void setMvtResolu(String mvtResolu) {
		this.mvtResolu = mvtResolu;
	}

	public BigDecimal getMvtRp() {
		return this.mvtRp;
	}

	public void setMvtRp(BigDecimal mvtRp) {
		this.mvtRp = mvtRp;
	}

	public String getMvtTipmov() {
		return this.mvtTipmov;
	}

	public void setMvtTipmov(String mvtTipmov) {
		this.mvtTipmov = mvtTipmov;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public List<FmvdDetmov> getFmvdDetmovs() {
		return this.fmvdDetmovs;
	}

	public void setFmvdDetmovs(List<FmvdDetmov> fmvdDetmovs) {
		this.fmvdDetmovs = fmvdDetmovs;
	}

	public FmvdDetmov addFmvdDetmov(FmvdDetmov fmvdDetmov) {
		getFmvdDetmovs().add(fmvdDetmov);
		fmvdDetmov.setFmvtMovpresu(this);

		return fmvdDetmov;
	}

	public FmvdDetmov removeFmvdDetmov(FmvdDetmov fmvdDetmov) {
		getFmvdDetmovs().remove(fmvdDetmov);
		fmvdDetmov.setFmvtMovpresu(null);

		return fmvdDetmov;
	}

	public FmvtMovpresu getFmvtMovpresu() {
		return this.fmvtMovpresu;
	}

	public void setFmvtMovpresu(FmvtMovpresu fmvtMovpresu) {
		this.fmvtMovpresu = fmvtMovpresu;
	}

	public List<FmvtMovpresu> getFmvtMovpresus() {
		return this.fmvtMovpresus;
	}

	public void setFmvtMovpresus(List<FmvtMovpresu> fmvtMovpresus) {
		this.fmvtMovpresus = fmvtMovpresus;
	}

	public FmvtMovpresu addFmvtMovpresus(FmvtMovpresu fmvtMovpresus) {
		getFmvtMovpresus().add(fmvtMovpresus);
		fmvtMovpresus.setFmvtMovpresu(this);

		return fmvtMovpresus;
	}

	public FmvtMovpresu removeFmvtMovpresus(FmvtMovpresu fmvtMovpresus) {
		getFmvtMovpresus().remove(fmvtMovpresus);
		fmvtMovpresus.setFmvtMovpresu(null);

		return fmvtMovpresus;
	}

	public FparPresup getFparPresup() {
		return this.fparPresup;
	}

	public void setFparPresup(FparPresup fparPresup) {
		this.fparPresup = fparPresup;
	}

	public List<FprgEjecucion> getFprgEjecucions1() {
		return this.fprgEjecucions1;
	}

	public void setFprgEjecucions1(List<FprgEjecucion> fprgEjecucions1) {
		this.fprgEjecucions1 = fprgEjecucions1;
	}

	public FprgEjecucion addFprgEjecucions1(FprgEjecucion fprgEjecucions1) {
		getFprgEjecucions1().add(fprgEjecucions1);
		fprgEjecucions1.setFmvtMovpresu1(this);

		return fprgEjecucions1;
	}

	public FprgEjecucion removeFprgEjecucions1(FprgEjecucion fprgEjecucions1) {
		getFprgEjecucions1().remove(fprgEjecucions1);
		fprgEjecucions1.setFmvtMovpresu1(null);

		return fprgEjecucions1;
	}

	public List<FprgEjecucion> getFprgEjecucions2() {
		return this.fprgEjecucions2;
	}

	public void setFprgEjecucions2(List<FprgEjecucion> fprgEjecucions2) {
		this.fprgEjecucions2 = fprgEjecucions2;
	}

	public FprgEjecucion addFprgEjecucions2(FprgEjecucion fprgEjecucions2) {
		getFprgEjecucions2().add(fprgEjecucions2);
		fprgEjecucions2.setFmvtMovpresu2(this);

		return fprgEjecucions2;
	}

	public FprgEjecucion removeFprgEjecucions2(FprgEjecucion fprgEjecucions2) {
		getFprgEjecucions2().remove(fprgEjecucions2);
		fprgEjecucions2.setFmvtMovpresu2(null);

		return fprgEjecucions2;
	}

}