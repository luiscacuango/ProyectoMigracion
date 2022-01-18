package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FALC_ALCANCE database table.
 * 
 */
@Entity
@Table(name="FALC_ALCANCE")
@NamedQuery(name="FalcAlcance.findAll", query="SELECT f FROM FalcAlcance f")
public class FalcAlcance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ALC_SECUENCIA")
	private long alcSecuencia;

	@Column(name="ALC_ALCANCE0")
	private BigDecimal alcAlcance0;

	@Column(name="ALC_ALCANCE1")
	private BigDecimal alcAlcance1;

	@Temporal(TemporalType.DATE)
	@Column(name="ALC_FECHA")
	private Date alcFecha;

	@Column(name="ALC_MAXANT1")
	private BigDecimal alcMaxant1;

	@Column(name="ALC_MAXANTICIPO")
	private BigDecimal alcMaxanticipo;

	@Column(name="ALC_PLAZO0")
	private BigDecimal alcPlazo0;

	@Column(name="ALC_PLAZO1")
	private BigDecimal alcPlazo1;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	public FalcAlcance() {
	}

	public long getAlcSecuencia() {
		return this.alcSecuencia;
	}

	public void setAlcSecuencia(long alcSecuencia) {
		this.alcSecuencia = alcSecuencia;
	}

	public BigDecimal getAlcAlcance0() {
		return this.alcAlcance0;
	}

	public void setAlcAlcance0(BigDecimal alcAlcance0) {
		this.alcAlcance0 = alcAlcance0;
	}

	public BigDecimal getAlcAlcance1() {
		return this.alcAlcance1;
	}

	public void setAlcAlcance1(BigDecimal alcAlcance1) {
		this.alcAlcance1 = alcAlcance1;
	}

	public Date getAlcFecha() {
		return this.alcFecha;
	}

	public void setAlcFecha(Date alcFecha) {
		this.alcFecha = alcFecha;
	}

	public BigDecimal getAlcMaxant1() {
		return this.alcMaxant1;
	}

	public void setAlcMaxant1(BigDecimal alcMaxant1) {
		this.alcMaxant1 = alcMaxant1;
	}

	public BigDecimal getAlcMaxanticipo() {
		return this.alcMaxanticipo;
	}

	public void setAlcMaxanticipo(BigDecimal alcMaxanticipo) {
		this.alcMaxanticipo = alcMaxanticipo;
	}

	public BigDecimal getAlcPlazo0() {
		return this.alcPlazo0;
	}

	public void setAlcPlazo0(BigDecimal alcPlazo0) {
		this.alcPlazo0 = alcPlazo0;
	}

	public BigDecimal getAlcPlazo1() {
		return this.alcPlazo1;
	}

	public void setAlcPlazo1(BigDecimal alcPlazo1) {
		this.alcPlazo1 = alcPlazo1;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

}