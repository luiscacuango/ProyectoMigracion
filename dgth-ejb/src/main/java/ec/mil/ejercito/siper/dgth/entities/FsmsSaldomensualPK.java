package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FSMS_SALDOMENSUAL database table.
 * 
 */
@Embeddable
public class FsmsSaldomensualPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="FPE_UNI_CODIGO2", insertable=false, updatable=false)
	private String fpeUniCodigo2;

	@Column(name="EJE_ANIO", insertable=false, updatable=false)
	private long ejeAnio;

	@Column(name="PEA_MES", insertable=false, updatable=false)
	private long peaMes;

	@Column(name="CTC_SECUEN")
	private String ctcSecuen;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	public FsmsSaldomensualPK() {
	}
	public String getFpeUniCodigo2() {
		return this.fpeUniCodigo2;
	}
	public void setFpeUniCodigo2(String fpeUniCodigo2) {
		this.fpeUniCodigo2 = fpeUniCodigo2;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FsmsSaldomensualPK)) {
			return false;
		}
		FsmsSaldomensualPK castOther = (FsmsSaldomensualPK)other;
		return 
			this.fpeUniCodigo2.equals(castOther.fpeUniCodigo2)
			&& (this.ejeAnio == castOther.ejeAnio)
			&& (this.peaMes == castOther.peaMes)
			&& this.ctcSecuen.equals(castOther.ctcSecuen)
			&& this.datCodigo.equals(castOther.datCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fpeUniCodigo2.hashCode();
		hash = hash * prime + ((int) (this.ejeAnio ^ (this.ejeAnio >>> 32)));
		hash = hash * prime + ((int) (this.peaMes ^ (this.peaMes >>> 32)));
		hash = hash * prime + this.ctcSecuen.hashCode();
		hash = hash * prime + this.datCodigo.hashCode();
		
		return hash;
	}
}