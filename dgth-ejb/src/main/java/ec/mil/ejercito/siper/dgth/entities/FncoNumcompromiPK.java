package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FNCO_NUMCOMPROMI database table.
 * 
 */
@Embeddable
public class FncoNumcompromiPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="UNI_CODIGO2", insertable=false, updatable=false)
	private String uniCodigo2;

	@Column(name="NCO_ANIO")
	private long ncoAnio;

	public FncoNumcompromiPK() {
	}
	public String getUniCodigo2() {
		return this.uniCodigo2;
	}
	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}
	public long getNcoAnio() {
		return this.ncoAnio;
	}
	public void setNcoAnio(long ncoAnio) {
		this.ncoAnio = ncoAnio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FncoNumcompromiPK)) {
			return false;
		}
		FncoNumcompromiPK castOther = (FncoNumcompromiPK)other;
		return 
			this.uniCodigo2.equals(castOther.uniCodigo2)
			&& (this.ncoAnio == castOther.ncoAnio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.uniCodigo2.hashCode();
		hash = hash * prime + ((int) (this.ncoAnio ^ (this.ncoAnio >>> 32)));
		
		return hash;
	}
}