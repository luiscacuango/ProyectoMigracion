package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MV_SP_SUELDOS database table.
 * 
 */
@Entity
@Table(name="MV_SP_SUELDOS")
@NamedQuery(name="MvSpSueldo.findAll", query="SELECT m FROM MvSpSueldo m")
public class MvSpSueldo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="HRL_FECHA")
	private Date hrlFecha;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	@Column(name="TIE_INGEGR")
	private String tieIngegr;

	private BigDecimal total;

	public MvSpSueldo() {
	}

	public Date getHrlFecha() {
		return this.hrlFecha;
	}

	public void setHrlFecha(Date hrlFecha) {
		this.hrlFecha = hrlFecha;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public String getTieIngegr() {
		return this.tieIngegr;
	}

	public void setTieIngegr(String tieIngegr) {
		this.tieIngegr = tieIngegr;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}