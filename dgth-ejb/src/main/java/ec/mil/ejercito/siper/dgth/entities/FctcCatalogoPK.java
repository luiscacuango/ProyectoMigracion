package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FCTC_CATALOGO database table.
 * 
 */
@Embeddable
public class FctcCatalogoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CTC_SECUEN")
	private String ctcSecuen;

	@Column(name="CTC_ANIO")
	private long ctcAnio;

	public FctcCatalogoPK() {
	}
	public String getCtcSecuen() {
		return this.ctcSecuen;
	}
	public void setCtcSecuen(String ctcSecuen) {
		this.ctcSecuen = ctcSecuen;
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
		if (!(other instanceof FctcCatalogoPK)) {
			return false;
		}
		FctcCatalogoPK castOther = (FctcCatalogoPK)other;
		return 
			this.ctcSecuen.equals(castOther.ctcSecuen)
			&& (this.ctcAnio == castOther.ctcAnio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ctcSecuen.hashCode();
		hash = hash * prime + ((int) (this.ctcAnio ^ (this.ctcAnio >>> 32)));
		
		return hash;
	}
}