package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FEJE_FISCALES database table.
 * 
 */
@Embeddable
public class FejeFiscalePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="UNI_CODIGO2", insertable=false, updatable=false)
	private String uniCodigo2;

	@Column(name="EJE_ANIO")
	private long ejeAnio;

	public FejeFiscalePK() {
	}
	public String getUniCodigo2() {
		return this.uniCodigo2;
	}
	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}
	public long getEjeAnio() {
		return this.ejeAnio;
	}
	public void setEjeAnio(long ejeAnio) {
		this.ejeAnio = ejeAnio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FejeFiscalePK)) {
			return false;
		}
		FejeFiscalePK castOther = (FejeFiscalePK)other;
		return 
			this.uniCodigo2.equals(castOther.uniCodigo2)
			&& (this.ejeAnio == castOther.ejeAnio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.uniCodigo2.hashCode();
		hash = hash * prime + ((int) (this.ejeAnio ^ (this.ejeAnio >>> 32)));
		
		return hash;
	}
}