package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FANT_SOLANT database table.
 * 
 */
@Entity
@Table(name="FANT_SOLANT")
@NamedQuery(name="FantSolant.findAll", query="SELECT f FROM FantSolant f")
public class FantSolant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ANT_SECUENCIA")
	private long antSecuencia;

	@Column(name="ANT_ALCANCE")
	private BigDecimal antAlcance;

	@Column(name="ANT_ESTADO")
	private String antEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="ANT_FECHA_SOL")
	private Date antFechaSol;

	@Column(name="ANT_PLAZO")
	private BigDecimal antPlazo;

	@Column(name="ANT_PLAZOREAL")
	private BigDecimal antPlazoreal;

	@Column(name="ANT_PORC")
	private BigDecimal antPorc;

	@Column(name="ANT_RMU")
	private BigDecimal antRmu;

	@Column(name="ANT_VALORSOL")
	private BigDecimal antValorsol;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	//bi-directional many-to-one association to FcsmConsumo
	@OneToMany(mappedBy="fantSolant")
	private List<FcsmConsumo> fcsmConsumos;

	//bi-directional many-to-one association to FdscDescuento
	@OneToMany(mappedBy="fantSolant")
	private List<FdscDescuento> fdscDescuentos;

	//bi-directional many-to-one association to FsegSeganticipo
	@OneToMany(mappedBy="fantSolant")
	private List<FsegSeganticipo> fsegSeganticipos;

	public FantSolant() {
	}

	public long getAntSecuencia() {
		return this.antSecuencia;
	}

	public void setAntSecuencia(long antSecuencia) {
		this.antSecuencia = antSecuencia;
	}

	public BigDecimal getAntAlcance() {
		return this.antAlcance;
	}

	public void setAntAlcance(BigDecimal antAlcance) {
		this.antAlcance = antAlcance;
	}

	public String getAntEstado() {
		return this.antEstado;
	}

	public void setAntEstado(String antEstado) {
		this.antEstado = antEstado;
	}

	public Date getAntFechaSol() {
		return this.antFechaSol;
	}

	public void setAntFechaSol(Date antFechaSol) {
		this.antFechaSol = antFechaSol;
	}

	public BigDecimal getAntPlazo() {
		return this.antPlazo;
	}

	public void setAntPlazo(BigDecimal antPlazo) {
		this.antPlazo = antPlazo;
	}

	public BigDecimal getAntPlazoreal() {
		return this.antPlazoreal;
	}

	public void setAntPlazoreal(BigDecimal antPlazoreal) {
		this.antPlazoreal = antPlazoreal;
	}

	public BigDecimal getAntPorc() {
		return this.antPorc;
	}

	public void setAntPorc(BigDecimal antPorc) {
		this.antPorc = antPorc;
	}

	public BigDecimal getAntRmu() {
		return this.antRmu;
	}

	public void setAntRmu(BigDecimal antRmu) {
		this.antRmu = antRmu;
	}

	public BigDecimal getAntValorsol() {
		return this.antValorsol;
	}

	public void setAntValorsol(BigDecimal antValorsol) {
		this.antValorsol = antValorsol;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public List<FcsmConsumo> getFcsmConsumos() {
		return this.fcsmConsumos;
	}

	public void setFcsmConsumos(List<FcsmConsumo> fcsmConsumos) {
		this.fcsmConsumos = fcsmConsumos;
	}

	public FcsmConsumo addFcsmConsumo(FcsmConsumo fcsmConsumo) {
		getFcsmConsumos().add(fcsmConsumo);
		fcsmConsumo.setFantSolant(this);

		return fcsmConsumo;
	}

	public FcsmConsumo removeFcsmConsumo(FcsmConsumo fcsmConsumo) {
		getFcsmConsumos().remove(fcsmConsumo);
		fcsmConsumo.setFantSolant(null);

		return fcsmConsumo;
	}

	public List<FdscDescuento> getFdscDescuentos() {
		return this.fdscDescuentos;
	}

	public void setFdscDescuentos(List<FdscDescuento> fdscDescuentos) {
		this.fdscDescuentos = fdscDescuentos;
	}

	public FdscDescuento addFdscDescuento(FdscDescuento fdscDescuento) {
		getFdscDescuentos().add(fdscDescuento);
		fdscDescuento.setFantSolant(this);

		return fdscDescuento;
	}

	public FdscDescuento removeFdscDescuento(FdscDescuento fdscDescuento) {
		getFdscDescuentos().remove(fdscDescuento);
		fdscDescuento.setFantSolant(null);

		return fdscDescuento;
	}

	public List<FsegSeganticipo> getFsegSeganticipos() {
		return this.fsegSeganticipos;
	}

	public void setFsegSeganticipos(List<FsegSeganticipo> fsegSeganticipos) {
		this.fsegSeganticipos = fsegSeganticipos;
	}

	public FsegSeganticipo addFsegSeganticipo(FsegSeganticipo fsegSeganticipo) {
		getFsegSeganticipos().add(fsegSeganticipo);
		fsegSeganticipo.setFantSolant(this);

		return fsegSeganticipo;
	}

	public FsegSeganticipo removeFsegSeganticipo(FsegSeganticipo fsegSeganticipo) {
		getFsegSeganticipos().remove(fsegSeganticipo);
		fsegSeganticipo.setFantSolant(null);

		return fsegSeganticipo;
	}

}