package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FDTC_CARACTERISTICAS database table.
 * 
 */
@Entity
@Table(name="FDTC_CARACTERISTICAS")
@NamedQuery(name="FdtcCaracteristica.findAll", query="SELECT f FROM FdtcCaracteristica f")
public class FdtcCaracteristica implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FdtcCaracteristicaPK id;

	@Column(name="DTC_DATO")
	private String dtcDato;

	//bi-directional many-to-one association to FcarActivo
	@ManyToOne
	@JoinColumn(name="CAR_SECUEN")
	private FcarActivo fcarActivo;

	//bi-directional many-to-one association to FinvInven
	@ManyToOne
	@JoinColumn(name="INV_SECUEN")
	private FinvInven finvInven;

	public FdtcCaracteristica() {
	}

	public FdtcCaracteristicaPK getId() {
		return this.id;
	}

	public void setId(FdtcCaracteristicaPK id) {
		this.id = id;
	}

	public String getDtcDato() {
		return this.dtcDato;
	}

	public void setDtcDato(String dtcDato) {
		this.dtcDato = dtcDato;
	}

	public FcarActivo getFcarActivo() {
		return this.fcarActivo;
	}

	public void setFcarActivo(FcarActivo fcarActivo) {
		this.fcarActivo = fcarActivo;
	}

	public FinvInven getFinvInven() {
		return this.finvInven;
	}

	public void setFinvInven(FinvInven finvInven) {
		this.finvInven = finvInven;
	}

}