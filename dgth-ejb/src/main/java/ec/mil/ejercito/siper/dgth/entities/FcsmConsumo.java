package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FCSM_CONSUMO database table.
 * 
 */
@Entity
@Table(name="FCSM_CONSUMO")
@NamedQuery(name="FcsmConsumo.findAll", query="SELECT f FROM FcsmConsumo f")
public class FcsmConsumo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CSM_SECUENCIA")
	private long csmSecuencia;

	@Column(name="CSM_ANTICIPO")
	private String csmAnticipo;

	@Column(name="CSM_COMPROBANTE")
	private BigDecimal csmComprobante;

	@Column(name="CSM_DETALLE")
	private String csmDetalle;

	@Column(name="CSM_DOCUMENTO")
	private String csmDocumento;

	@Column(name="CSM_ESTADO")
	private String csmEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="CSM_FECHA")
	private Date csmFecha;

	@Column(name="CSM_SECCON")
	private BigDecimal csmSeccon;

	@Column(name="CSM_VALOR")
	private BigDecimal csmValor;

	@Column(name="FPA_CODIGO")
	private BigDecimal fpaCodigo;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	@Column(name="PME_MEM_CEDULA")
	private String pmeMemCedula;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	//bi-directional many-to-one association to FantSolant
	@ManyToOne
	@JoinColumn(name="ANT_SECUENCIA")
	private FantSolant fantSolant;

	//bi-directional many-to-one association to FconConcepto
	@ManyToOne
	@JoinColumn(name="CON_SECUENCIA")
	private FconConcepto fconConcepto;

	//bi-directional many-to-one association to FpexPersonaExterna
	@ManyToOne
	@JoinColumn(name="PEX_SECUENCIA")
	private FpexPersonaExterna fpexPersonaExterna;

	//bi-directional many-to-one association to FrecRecaudacion
	@OneToMany(mappedBy="fcsmConsumo")
	private List<FrecRecaudacion> frecRecaudacions;

	public FcsmConsumo() {
	}

	public long getCsmSecuencia() {
		return this.csmSecuencia;
	}

	public void setCsmSecuencia(long csmSecuencia) {
		this.csmSecuencia = csmSecuencia;
	}

	public String getCsmAnticipo() {
		return this.csmAnticipo;
	}

	public void setCsmAnticipo(String csmAnticipo) {
		this.csmAnticipo = csmAnticipo;
	}

	public BigDecimal getCsmComprobante() {
		return this.csmComprobante;
	}

	public void setCsmComprobante(BigDecimal csmComprobante) {
		this.csmComprobante = csmComprobante;
	}

	public String getCsmDetalle() {
		return this.csmDetalle;
	}

	public void setCsmDetalle(String csmDetalle) {
		this.csmDetalle = csmDetalle;
	}

	public String getCsmDocumento() {
		return this.csmDocumento;
	}

	public void setCsmDocumento(String csmDocumento) {
		this.csmDocumento = csmDocumento;
	}

	public String getCsmEstado() {
		return this.csmEstado;
	}

	public void setCsmEstado(String csmEstado) {
		this.csmEstado = csmEstado;
	}

	public Date getCsmFecha() {
		return this.csmFecha;
	}

	public void setCsmFecha(Date csmFecha) {
		this.csmFecha = csmFecha;
	}

	public BigDecimal getCsmSeccon() {
		return this.csmSeccon;
	}

	public void setCsmSeccon(BigDecimal csmSeccon) {
		this.csmSeccon = csmSeccon;
	}

	public BigDecimal getCsmValor() {
		return this.csmValor;
	}

	public void setCsmValor(BigDecimal csmValor) {
		this.csmValor = csmValor;
	}

	public BigDecimal getFpaCodigo() {
		return this.fpaCodigo;
	}

	public void setFpaCodigo(BigDecimal fpaCodigo) {
		this.fpaCodigo = fpaCodigo;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public String getPmeMemCedula() {
		return this.pmeMemCedula;
	}

	public void setPmeMemCedula(String pmeMemCedula) {
		this.pmeMemCedula = pmeMemCedula;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public FantSolant getFantSolant() {
		return this.fantSolant;
	}

	public void setFantSolant(FantSolant fantSolant) {
		this.fantSolant = fantSolant;
	}

	public FconConcepto getFconConcepto() {
		return this.fconConcepto;
	}

	public void setFconConcepto(FconConcepto fconConcepto) {
		this.fconConcepto = fconConcepto;
	}

	public FpexPersonaExterna getFpexPersonaExterna() {
		return this.fpexPersonaExterna;
	}

	public void setFpexPersonaExterna(FpexPersonaExterna fpexPersonaExterna) {
		this.fpexPersonaExterna = fpexPersonaExterna;
	}

	public List<FrecRecaudacion> getFrecRecaudacions() {
		return this.frecRecaudacions;
	}

	public void setFrecRecaudacions(List<FrecRecaudacion> frecRecaudacions) {
		this.frecRecaudacions = frecRecaudacions;
	}

	public FrecRecaudacion addFrecRecaudacion(FrecRecaudacion frecRecaudacion) {
		getFrecRecaudacions().add(frecRecaudacion);
		frecRecaudacion.setFcsmConsumo(this);

		return frecRecaudacion;
	}

	public FrecRecaudacion removeFrecRecaudacion(FrecRecaudacion frecRecaudacion) {
		getFrecRecaudacions().remove(frecRecaudacion);
		frecRecaudacion.setFcsmConsumo(null);

		return frecRecaudacion;
	}

}