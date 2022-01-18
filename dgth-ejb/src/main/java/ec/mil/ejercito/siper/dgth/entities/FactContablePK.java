package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FACT_CONTABLE database table.
 * 
 */
@Embeddable
public class FactContablePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ACT_SECCON")
	private long actSeccon;

	@Column(name="ACT_ANIO")
	private long actAnio;

	public FactContablePK() {
	}
	public long getActSeccon() {
		return this.actSeccon;
	}
	public void setActSeccon(long actSeccon) {
		this.actSeccon = actSeccon;
	}
	public long getActAnio() {
		return this.actAnio;
	}
	public void setActAnio(long actAnio) {
		this.actAnio = actAnio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FactContablePK)) {
			return false;
		}
		FactContablePK castOther = (FactContablePK)other;
		return 
			(this.actSeccon == castOther.actSeccon)
			&& (this.actAnio == castOther.actAnio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.actSeccon ^ (this.actSeccon >>> 32)));
		hash = hash * prime + ((int) (this.actAnio ^ (this.actAnio >>> 32)));
		
		return hash;
	}
}