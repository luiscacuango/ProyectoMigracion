package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FSCT_CONTABLES database table.
 * 
 */
@Embeddable
public class FsctContablePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="FEJ_UNI_CODIGO2", insertable=false, updatable=false)
	private String fejUniCodigo2;

	@Column(name="EJE_ANIO", insertable=false, updatable=false)
	private long ejeAnio;

	@Column(name="CTC_SECUEN")
	private String ctcSecuen;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	public FsctContablePK() {
	}
	public String getFejUniCodigo2() {
		return this.fejUniCodigo2;
	}
	public void setFejUniCodigo2(String fejUniCodigo2) {
		this.fejUniCodigo2 = fejUniCodigo2;
	}
	public long getEjeAnio() {
		return this.ejeAnio;
	}
	public void setEjeAnio(long ejeAnio) {
		this.ejeAnio = ejeAnio;
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
		if (!(other instanceof FsctContablePK)) {
			return false;
		}
		FsctContablePK castOther = (FsctContablePK)other;
		return 
			this.fejUniCodigo2.equals(castOther.fejUniCodigo2)
			&& (this.ejeAnio == castOther.ejeAnio)
			&& this.ctcSecuen.equals(castOther.ctcSecuen)
			&& this.datCodigo.equals(castOther.datCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fejUniCodigo2.hashCode();
		hash = hash * prime + ((int) (this.ejeAnio ^ (this.ejeAnio >>> 32)));
		hash = hash * prime + this.ctcSecuen.hashCode();
		hash = hash * prime + this.datCodigo.hashCode();
		
		return hash;
	}
}