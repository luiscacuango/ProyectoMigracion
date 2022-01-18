package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FPAR_PRESUP database table.
 * 
 */
@Embeddable
public class FparPresupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PAR_CODIGO")
	private String parCodigo;

	@Column(name="PAR_ANIO")
	private long parAnio;

	public FparPresupPK() {
	}
	public String getParCodigo() {
		return this.parCodigo;
	}
	public void setParCodigo(String parCodigo) {
		this.parCodigo = parCodigo;
	}
	public long getParAnio() {
		return this.parAnio;
	}
	public void setParAnio(long parAnio) {
		this.parAnio = parAnio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FparPresupPK)) {
			return false;
		}
		FparPresupPK castOther = (FparPresupPK)other;
		return 
			this.parCodigo.equals(castOther.parCodigo)
			&& (this.parAnio == castOther.parAnio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.parCodigo.hashCode();
		hash = hash * prime + ((int) (this.parAnio ^ (this.parAnio >>> 32)));
		
		return hash;
	}
}