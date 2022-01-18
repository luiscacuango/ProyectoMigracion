package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FPER_PERIODOS database table.
 * 
 */
@Embeddable
public class FperPeriodoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="UNI_CODIGO2", insertable=false, updatable=false)
	private String uniCodigo2;

	@Column(name="EJE_ANIO", insertable=false, updatable=false)
	private long ejeAnio;

	@Column(name="PEA_MES")
	private long peaMes;

	public FperPeriodoPK() {
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
	public long getPeaMes() {
		return this.peaMes;
	}
	public void setPeaMes(long peaMes) {
		this.peaMes = peaMes;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FperPeriodoPK)) {
			return false;
		}
		FperPeriodoPK castOther = (FperPeriodoPK)other;
		return 
			this.uniCodigo2.equals(castOther.uniCodigo2)
			&& (this.ejeAnio == castOther.ejeAnio)
			&& (this.peaMes == castOther.peaMes);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.uniCodigo2.hashCode();
		hash = hash * prime + ((int) (this.ejeAnio ^ (this.ejeAnio >>> 32)));
		hash = hash * prime + ((int) (this.peaMes ^ (this.peaMes >>> 32)));
		
		return hash;
	}
}