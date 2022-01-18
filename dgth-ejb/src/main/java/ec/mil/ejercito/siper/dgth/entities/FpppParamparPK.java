package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FPPP_PARAMPAR database table.
 * 
 */
@Embeddable
public class FpppParamparPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PPP_TIPO")
	private String pppTipo;

	@Column(name="PPP_ANIO")
	private long pppAnio;

	@Column(name="PPP_ORDEN")
	private long pppOrden;

	public FpppParamparPK() {
	}
	public String getPppTipo() {
		return this.pppTipo;
	}
	public void setPppTipo(String pppTipo) {
		this.pppTipo = pppTipo;
	}
	public long getPppAnio() {
		return this.pppAnio;
	}
	public void setPppAnio(long pppAnio) {
		this.pppAnio = pppAnio;
	}
	public long getPppOrden() {
		return this.pppOrden;
	}
	public void setPppOrden(long pppOrden) {
		this.pppOrden = pppOrden;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FpppParamparPK)) {
			return false;
		}
		FpppParamparPK castOther = (FpppParamparPK)other;
		return 
			this.pppTipo.equals(castOther.pppTipo)
			&& (this.pppAnio == castOther.pppAnio)
			&& (this.pppOrden == castOther.pppOrden);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pppTipo.hashCode();
		hash = hash * prime + ((int) (this.pppAnio ^ (this.pppAnio >>> 32)));
		hash = hash * prime + ((int) (this.pppOrden ^ (this.pppOrden >>> 32)));
		
		return hash;
	}
}