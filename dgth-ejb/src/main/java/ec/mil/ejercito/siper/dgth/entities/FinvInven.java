package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FINV_INVEN database table.
 * 
 */
@Entity
@Table(name="FINV_INVEN")
@NamedQuery(name="FinvInven.findAll", query="SELECT f FROM FinvInven f")
public class FinvInven implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INV_SECUEN")
	private long invSecuen;

	@Column(name="INV_CARACT_ANT")
	private String invCaractAnt;

	@Column(name="INV_CODIGO")
	private String invCodigo;

	@Column(name="INV_CODIGO_ANT")
	private String invCodigoAnt;

	@Column(name="INV_ESTADO")
	private String invEstado;

	@Column(name="INV_TIPO")
	private String invTipo;

	@Column(name="INV_VALUNI")
	private BigDecimal invValuni;

	//bi-directional many-to-one association to FdtcCaracteristica
	@OneToMany(mappedBy="finvInven")
	private List<FdtcCaracteristica> fdtcCaracteristicas;

	//bi-directional many-to-one association to FiarIngartic
	@ManyToOne
	@JoinColumn(name="FIA_IAR_SECUEN")
	private FiarIngartic fiarIngartic;

	//bi-directional many-to-one association to FinvInven
	@ManyToOne
	@JoinColumn(name="FIN_INV_SECUEN")
	private FinvInven finvInven;

	//bi-directional many-to-one association to FinvInven
	@OneToMany(mappedBy="finvInven")
	private List<FinvInven> finvInvens;

	//bi-directional many-to-one association to FmovArticulo
	@OneToMany(mappedBy="finvInven")
	private List<FmovArticulo> fmovArticulos;

	public FinvInven() {
	}

	public long getInvSecuen() {
		return this.invSecuen;
	}

	public void setInvSecuen(long invSecuen) {
		this.invSecuen = invSecuen;
	}

	public String getInvCaractAnt() {
		return this.invCaractAnt;
	}

	public void setInvCaractAnt(String invCaractAnt) {
		this.invCaractAnt = invCaractAnt;
	}

	public String getInvCodigo() {
		return this.invCodigo;
	}

	public void setInvCodigo(String invCodigo) {
		this.invCodigo = invCodigo;
	}

	public String getInvCodigoAnt() {
		return this.invCodigoAnt;
	}

	public void setInvCodigoAnt(String invCodigoAnt) {
		this.invCodigoAnt = invCodigoAnt;
	}

	public String getInvEstado() {
		return this.invEstado;
	}

	public void setInvEstado(String invEstado) {
		this.invEstado = invEstado;
	}

	public String getInvTipo() {
		return this.invTipo;
	}

	public void setInvTipo(String invTipo) {
		this.invTipo = invTipo;
	}

	public BigDecimal getInvValuni() {
		return this.invValuni;
	}

	public void setInvValuni(BigDecimal invValuni) {
		this.invValuni = invValuni;
	}

	public List<FdtcCaracteristica> getFdtcCaracteristicas() {
		return this.fdtcCaracteristicas;
	}

	public void setFdtcCaracteristicas(List<FdtcCaracteristica> fdtcCaracteristicas) {
		this.fdtcCaracteristicas = fdtcCaracteristicas;
	}

	public FdtcCaracteristica addFdtcCaracteristica(FdtcCaracteristica fdtcCaracteristica) {
		getFdtcCaracteristicas().add(fdtcCaracteristica);
		fdtcCaracteristica.setFinvInven(this);

		return fdtcCaracteristica;
	}

	public FdtcCaracteristica removeFdtcCaracteristica(FdtcCaracteristica fdtcCaracteristica) {
		getFdtcCaracteristicas().remove(fdtcCaracteristica);
		fdtcCaracteristica.setFinvInven(null);

		return fdtcCaracteristica;
	}

	public FiarIngartic getFiarIngartic() {
		return this.fiarIngartic;
	}

	public void setFiarIngartic(FiarIngartic fiarIngartic) {
		this.fiarIngartic = fiarIngartic;
	}

	public FinvInven getFinvInven() {
		return this.finvInven;
	}

	public void setFinvInven(FinvInven finvInven) {
		this.finvInven = finvInven;
	}

	public List<FinvInven> getFinvInvens() {
		return this.finvInvens;
	}

	public void setFinvInvens(List<FinvInven> finvInvens) {
		this.finvInvens = finvInvens;
	}

	public FinvInven addFinvInven(FinvInven finvInven) {
		getFinvInvens().add(finvInven);
		finvInven.setFinvInven(this);

		return finvInven;
	}

	public FinvInven removeFinvInven(FinvInven finvInven) {
		getFinvInvens().remove(finvInven);
		finvInven.setFinvInven(null);

		return finvInven;
	}

	public List<FmovArticulo> getFmovArticulos() {
		return this.fmovArticulos;
	}

	public void setFmovArticulos(List<FmovArticulo> fmovArticulos) {
		this.fmovArticulos = fmovArticulos;
	}

	public FmovArticulo addFmovArticulo(FmovArticulo fmovArticulo) {
		getFmovArticulos().add(fmovArticulo);
		fmovArticulo.setFinvInven(this);

		return fmovArticulo;
	}

	public FmovArticulo removeFmovArticulo(FmovArticulo fmovArticulo) {
		getFmovArticulos().remove(fmovArticulo);
		fmovArticulo.setFinvInven(null);

		return fmovArticulo;
	}

}