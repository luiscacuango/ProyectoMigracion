package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FCVH_COBVEH database table.
 * 
 */
@Entity
@Table(name="FCVH_COBVEH")
@NamedQuery(name="FcvhCobveh.findAll", query="SELECT f FROM FcvhCobveh f")
public class FcvhCobveh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVH_SECUEN")
	private long cvhSecuen;

	@Column(name="CVH_APORTACION")
	private BigDecimal cvhAportacion;

	@Column(name="CVH_AVALUO")
	private BigDecimal cvhAvaluo;

	@Temporal(TemporalType.DATE)
	@Column(name="CVH_FECHA")
	private Date cvhFecha;

	@Column(name="CVH_IMPUESTOS")
	private BigDecimal cvhImpuestos;

	@Column(name="CVH_NUMDOC")
	private String cvhNumdoc;

	@Column(name="CVH_VENTA")
	private BigDecimal cvhVenta;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	public FcvhCobveh() {
	}

	public long getCvhSecuen() {
		return this.cvhSecuen;
	}

	public void setCvhSecuen(long cvhSecuen) {
		this.cvhSecuen = cvhSecuen;
	}

	public BigDecimal getCvhAportacion() {
		return this.cvhAportacion;
	}

	public void setCvhAportacion(BigDecimal cvhAportacion) {
		this.cvhAportacion = cvhAportacion;
	}

	public BigDecimal getCvhAvaluo() {
		return this.cvhAvaluo;
	}

	public void setCvhAvaluo(BigDecimal cvhAvaluo) {
		this.cvhAvaluo = cvhAvaluo;
	}

	public Date getCvhFecha() {
		return this.cvhFecha;
	}

	public void setCvhFecha(Date cvhFecha) {
		this.cvhFecha = cvhFecha;
	}

	public BigDecimal getCvhImpuestos() {
		return this.cvhImpuestos;
	}

	public void setCvhImpuestos(BigDecimal cvhImpuestos) {
		this.cvhImpuestos = cvhImpuestos;
	}

	public String getCvhNumdoc() {
		return this.cvhNumdoc;
	}

	public void setCvhNumdoc(String cvhNumdoc) {
		this.cvhNumdoc = cvhNumdoc;
	}

	public BigDecimal getCvhVenta() {
		return this.cvhVenta;
	}

	public void setCvhVenta(BigDecimal cvhVenta) {
		this.cvhVenta = cvhVenta;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

}