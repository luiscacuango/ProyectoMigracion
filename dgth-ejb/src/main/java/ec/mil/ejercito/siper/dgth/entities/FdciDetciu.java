package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FDCI_DETCIU database table.
 * 
 */
@Entity
@Table(name="FDCI_DETCIU")
@NamedQuery(name="FdciDetciu.findAll", query="SELECT f FROM FdciDetciu f")
public class FdciDetciu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DCI_CODIGO")
	private long dciCodigo;

	@Column(name="DCI_CUENTAB")
	private String dciCuentab;

	@Column(name="DCI_RUC")
	private String dciRuc;

	@Column(name="DCI_TIPO")
	private String dciTipo;

	@Column(name="ETD_CODIGO")
	private java.math.BigDecimal etdCodigo;

	@Column(name="ETD_TIPO")
	private String etdTipo;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	@Column(name="MUN_UNI_CODIGO2")
	private String munUniCodigo2;

	@Column(name="PVE_CODIGO")
	private java.math.BigDecimal pveCodigo;

	@Column(name="SET_ETD_CODIGO")
	private java.math.BigDecimal setEtdCodigo;

	@Column(name="SET_ETD_TIPO")
	private String setEtdTipo;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	//bi-directional many-to-one association to FcarPortafolio
	@OneToMany(mappedBy="fdciDetciu")
	private List<FcarPortafolio> fcarPortafolios;

	//bi-directional many-to-one association to FdaaAuxiliar
	@OneToMany(mappedBy="fdciDetciu")
	private List<FdaaAuxiliar> fdaaAuxiliars;

	//bi-directional many-to-one association to FcciCabciu
	@ManyToOne
	@JoinColumn(name="CCI_ID")
	private FcciCabciu fcciCabciu;

	//bi-directional many-to-one association to FdciAuxiliar
	@ManyToOne
	@JoinColumn(name="ID_AUXILIAR")
	private FdciAuxiliar fdciAuxiliar;

	//bi-directional many-to-one association to FmonMoneda
	@ManyToOne
	@JoinColumn(name="MON_SECUEN")
	private FmonMoneda fmonMoneda;

	public FdciDetciu() {
	}

	public long getDciCodigo() {
		return this.dciCodigo;
	}

	public void setDciCodigo(long dciCodigo) {
		this.dciCodigo = dciCodigo;
	}

	public String getDciCuentab() {
		return this.dciCuentab;
	}

	public void setDciCuentab(String dciCuentab) {
		this.dciCuentab = dciCuentab;
	}

	public String getDciRuc() {
		return this.dciRuc;
	}

	public void setDciRuc(String dciRuc) {
		this.dciRuc = dciRuc;
	}

	public String getDciTipo() {
		return this.dciTipo;
	}

	public void setDciTipo(String dciTipo) {
		this.dciTipo = dciTipo;
	}

	public java.math.BigDecimal getEtdCodigo() {
		return this.etdCodigo;
	}

	public void setEtdCodigo(java.math.BigDecimal etdCodigo) {
		this.etdCodigo = etdCodigo;
	}

	public String getEtdTipo() {
		return this.etdTipo;
	}

	public void setEtdTipo(String etdTipo) {
		this.etdTipo = etdTipo;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public String getMunUniCodigo2() {
		return this.munUniCodigo2;
	}

	public void setMunUniCodigo2(String munUniCodigo2) {
		this.munUniCodigo2 = munUniCodigo2;
	}

	public java.math.BigDecimal getPveCodigo() {
		return this.pveCodigo;
	}

	public void setPveCodigo(java.math.BigDecimal pveCodigo) {
		this.pveCodigo = pveCodigo;
	}

	public java.math.BigDecimal getSetEtdCodigo() {
		return this.setEtdCodigo;
	}

	public void setSetEtdCodigo(java.math.BigDecimal setEtdCodigo) {
		this.setEtdCodigo = setEtdCodigo;
	}

	public String getSetEtdTipo() {
		return this.setEtdTipo;
	}

	public void setSetEtdTipo(String setEtdTipo) {
		this.setEtdTipo = setEtdTipo;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public List<FcarPortafolio> getFcarPortafolios() {
		return this.fcarPortafolios;
	}

	public void setFcarPortafolios(List<FcarPortafolio> fcarPortafolios) {
		this.fcarPortafolios = fcarPortafolios;
	}

	public FcarPortafolio addFcarPortafolio(FcarPortafolio fcarPortafolio) {
		getFcarPortafolios().add(fcarPortafolio);
		fcarPortafolio.setFdciDetciu(this);

		return fcarPortafolio;
	}

	public FcarPortafolio removeFcarPortafolio(FcarPortafolio fcarPortafolio) {
		getFcarPortafolios().remove(fcarPortafolio);
		fcarPortafolio.setFdciDetciu(null);

		return fcarPortafolio;
	}

	public List<FdaaAuxiliar> getFdaaAuxiliars() {
		return this.fdaaAuxiliars;
	}

	public void setFdaaAuxiliars(List<FdaaAuxiliar> fdaaAuxiliars) {
		this.fdaaAuxiliars = fdaaAuxiliars;
	}

	public FdaaAuxiliar addFdaaAuxiliar(FdaaAuxiliar fdaaAuxiliar) {
		getFdaaAuxiliars().add(fdaaAuxiliar);
		fdaaAuxiliar.setFdciDetciu(this);

		return fdaaAuxiliar;
	}

	public FdaaAuxiliar removeFdaaAuxiliar(FdaaAuxiliar fdaaAuxiliar) {
		getFdaaAuxiliars().remove(fdaaAuxiliar);
		fdaaAuxiliar.setFdciDetciu(null);

		return fdaaAuxiliar;
	}

	public FcciCabciu getFcciCabciu() {
		return this.fcciCabciu;
	}

	public void setFcciCabciu(FcciCabciu fcciCabciu) {
		this.fcciCabciu = fcciCabciu;
	}

	public FdciAuxiliar getFdciAuxiliar() {
		return this.fdciAuxiliar;
	}

	public void setFdciAuxiliar(FdciAuxiliar fdciAuxiliar) {
		this.fdciAuxiliar = fdciAuxiliar;
	}

	public FmonMoneda getFmonMoneda() {
		return this.fmonMoneda;
	}

	public void setFmonMoneda(FmonMoneda fmonMoneda) {
		this.fmonMoneda = fmonMoneda;
	}

}