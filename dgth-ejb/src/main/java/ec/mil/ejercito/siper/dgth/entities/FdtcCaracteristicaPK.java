package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FDTC_CARACTERISTICAS database table.
 * 
 */
@Embeddable
public class FdtcCaracteristicaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="INV_SECUEN", insertable=false, updatable=false)
	private long invSecuen;

	@Column(name="CAR_SECUEN", insertable=false, updatable=false)
	private long carSecuen;

	public FdtcCaracteristicaPK() {
	}
	public long getInvSecuen() {
		return this.invSecuen;
	}
	public void setInvSecuen(long invSecuen) {
		this.invSecuen = invSecuen;
	}
	public long getCarSecuen() {
		return this.carSecuen;
	}
	public void setCarSecuen(long carSecuen) {
		this.carSecuen = carSecuen;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FdtcCaracteristicaPK)) {
			return false;
		}
		FdtcCaracteristicaPK castOther = (FdtcCaracteristicaPK)other;
		return 
			(this.invSecuen == castOther.invSecuen)
			&& (this.carSecuen == castOther.carSecuen);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.invSecuen ^ (this.invSecuen >>> 32)));
		hash = hash * prime + ((int) (this.carSecuen ^ (this.carSecuen >>> 32)));
		
		return hash;
	}
}