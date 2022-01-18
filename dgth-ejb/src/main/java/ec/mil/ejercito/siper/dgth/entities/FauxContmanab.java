package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FAUX_CONTMANAB database table.
 * 
 */
@Entity
@Table(name="FAUX_CONTMANAB")
@NamedQuery(name="FauxContmanab.findAll", query="SELECT f FROM FauxContmanab f")
public class FauxContmanab implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AUX_SECUENCIA")
	private long auxSecuencia;

	@Temporal(TemporalType.DATE)
	@Column(name="AUX_FECHA")
	private Date auxFecha;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	public FauxContmanab() {
	}

	public long getAuxSecuencia() {
		return this.auxSecuencia;
	}

	public void setAuxSecuencia(long auxSecuencia) {
		this.auxSecuencia = auxSecuencia;
	}

	public Date getAuxFecha() {
		return this.auxFecha;
	}

	public void setAuxFecha(Date auxFecha) {
		this.auxFecha = auxFecha;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

}