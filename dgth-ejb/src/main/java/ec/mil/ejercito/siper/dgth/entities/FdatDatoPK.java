package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FDAT_DATOS database table.
 * 
 */
@Embeddable
public class FdatDatoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CTC_SECUEN", insertable=false, updatable=false)
	private String ctcSecuen;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	@Column(name="CTC_ANIO", insertable=false, updatable=false)
	private long ctcAnio;

	public FdatDatoPK() {
	}
	public String getCtcSecuen() {
		return this.ctcSecuen;
	}
	public void setCtcSecuen(String ctcSecuen) {
		this.ctcSecuen = ctcSecuen;
	}
	public String getDatCodigo() {
		return this.datCodigo;
	}
	public void setDatCodigo(String datCodigo) {
		this.datCodigo = datCodigo;
	}
	public long getCtcAnio() {
		return this.ctcAnio;
	}
	public void setCtcAnio(long ctcAnio) {
		this.ctcAnio = ctcAnio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FdatDatoPK)) {
			return false;
		}
		FdatDatoPK castOther = (FdatDatoPK)other;
		return 
			this.ctcSecuen.equals(castOther.ctcSecuen)
			&& this.datCodigo.equals(castOther.datCodigo)
			&& (this.ctcAnio == castOther.ctcAnio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ctcSecuen.hashCode();
		hash = hash * prime + this.datCodigo.hashCode();
		hash = hash * prime + ((int) (this.ctcAnio ^ (this.ctcAnio >>> 32)));
		
		return hash;
	}
}