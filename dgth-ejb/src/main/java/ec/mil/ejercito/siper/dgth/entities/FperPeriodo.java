package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FPER_PERIODOS database table.
 * 
 */
@Entity
@Table(name="FPER_PERIODOS")
@NamedQuery(name="FperPeriodo.findAll", query="SELECT f FROM FperPeriodo f")
public class FperPeriodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FperPeriodoPK id;

	@Column(name="PEA_CO")
	private BigDecimal peaCo;

	@Column(name="PEA_EEP")
	private BigDecimal peaEep;

	@Column(name="PEA_ER")
	private BigDecimal peaEr;

	@Column(name="PEA_ESF")
	private BigDecimal peaEsf;

	@Column(name="PEA_ESTADO")
	private String peaEstado;

	@Column(name="PEA_FE")
	private BigDecimal peaFe;

	@Temporal(TemporalType.DATE)
	@Column(name="PEA_FECFIN")
	private Date peaFecfin;

	@Temporal(TemporalType.DATE)
	@Column(name="PEA_FECINI")
	private Date peaFecini;

	//bi-directional many-to-one association to FejeFiscale
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="EJE_ANIO", referencedColumnName="EJE_ANIO"),
		@JoinColumn(name="UNI_CODIGO2", referencedColumnName="UNI_CODIGO2")
		})
	private FejeFiscale fejeFiscale;

	//bi-directional many-to-one association to FsmsSaldomensual
	@OneToMany(mappedBy="fperPeriodo")
	private List<FsmsSaldomensual> fsmsSaldomensuals;

	public FperPeriodo() {
	}

	public FperPeriodoPK getId() {
		return this.id;
	}

	public void setId(FperPeriodoPK id) {
		this.id = id;
	}

	public BigDecimal getPeaCo() {
		return this.peaCo;
	}

	public void setPeaCo(BigDecimal peaCo) {
		this.peaCo = peaCo;
	}

	public BigDecimal getPeaEep() {
		return this.peaEep;
	}

	public void setPeaEep(BigDecimal peaEep) {
		this.peaEep = peaEep;
	}

	public BigDecimal getPeaEr() {
		return this.peaEr;
	}

	public void setPeaEr(BigDecimal peaEr) {
		this.peaEr = peaEr;
	}

	public BigDecimal getPeaEsf() {
		return this.peaEsf;
	}

	public void setPeaEsf(BigDecimal peaEsf) {
		this.peaEsf = peaEsf;
	}

	public String getPeaEstado() {
		return this.peaEstado;
	}

	public void setPeaEstado(String peaEstado) {
		this.peaEstado = peaEstado;
	}

	public BigDecimal getPeaFe() {
		return this.peaFe;
	}

	public void setPeaFe(BigDecimal peaFe) {
		this.peaFe = peaFe;
	}

	public Date getPeaFecfin() {
		return this.peaFecfin;
	}

	public void setPeaFecfin(Date peaFecfin) {
		this.peaFecfin = peaFecfin;
	}

	public Date getPeaFecini() {
		return this.peaFecini;
	}

	public void setPeaFecini(Date peaFecini) {
		this.peaFecini = peaFecini;
	}

	public FejeFiscale getFejeFiscale() {
		return this.fejeFiscale;
	}

	public void setFejeFiscale(FejeFiscale fejeFiscale) {
		this.fejeFiscale = fejeFiscale;
	}

	public List<FsmsSaldomensual> getFsmsSaldomensuals() {
		return this.fsmsSaldomensuals;
	}

	public void setFsmsSaldomensuals(List<FsmsSaldomensual> fsmsSaldomensuals) {
		this.fsmsSaldomensuals = fsmsSaldomensuals;
	}

	public FsmsSaldomensual addFsmsSaldomensual(FsmsSaldomensual fsmsSaldomensual) {
		getFsmsSaldomensuals().add(fsmsSaldomensual);
		fsmsSaldomensual.setFperPeriodo(this);

		return fsmsSaldomensual;
	}

	public FsmsSaldomensual removeFsmsSaldomensual(FsmsSaldomensual fsmsSaldomensual) {
		getFsmsSaldomensuals().remove(fsmsSaldomensual);
		fsmsSaldomensual.setFperPeriodo(null);

		return fsmsSaldomensual;
	}

}