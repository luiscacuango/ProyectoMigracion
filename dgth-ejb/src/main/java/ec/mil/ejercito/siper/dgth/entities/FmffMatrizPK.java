package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FMFF_MATRIZ database table.
 * 
 */
@Embeddable
public class FmffMatrizPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="FDA3_CTC_SECUEN")
	private String fda3CtcSecuen;

	@Column(name="FDA2_DAT_CODIGO")
	private String fda2DatCodigo;

	@Column(name="FDA2_CTC_SECUEN")
	private String fda2CtcSecuen;

	@Column(name="FDA_DAT_CODIGO")
	private String fdaDatCodigo;

	@Column(name="FDA_CTC_SECUEN")
	private String fdaCtcSecuen;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	@Column(name="CNC_SECUEN", insertable=false, updatable=false)
	private long cncSecuen;

	public FmffMatrizPK() {
	}
	public String getFda3CtcSecuen() {
		return this.fda3CtcSecuen;
	}
	public void setFda3CtcSecuen(String fda3CtcSecuen) {
		this.fda3CtcSecuen = fda3CtcSecuen;
	}
	public String getFda2DatCodigo() {
		return this.fda2DatCodigo;
	}
	public void setFda2DatCodigo(String fda2DatCodigo) {
		this.fda2DatCodigo = fda2DatCodigo;
	}
	public String getFda2CtcSecuen() {
		return this.fda2CtcSecuen;
	}
	public void setFda2CtcSecuen(String fda2CtcSecuen) {
		this.fda2CtcSecuen = fda2CtcSecuen;
	}
	public String getFdaDatCodigo() {
		return this.fdaDatCodigo;
	}
	public void setFdaDatCodigo(String fdaDatCodigo) {
		this.fdaDatCodigo = fdaDatCodigo;
	}
	public String getFdaCtcSecuen() {
		return this.fdaCtcSecuen;
	}
	public void setFdaCtcSecuen(String fdaCtcSecuen) {
		this.fdaCtcSecuen = fdaCtcSecuen;
	}
	public String getDatCodigo() {
		return this.datCodigo;
	}
	public void setDatCodigo(String datCodigo) {
		this.datCodigo = datCodigo;
	}
	public long getCncSecuen() {
		return this.cncSecuen;
	}
	public void setCncSecuen(long cncSecuen) {
		this.cncSecuen = cncSecuen;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FmffMatrizPK)) {
			return false;
		}
		FmffMatrizPK castOther = (FmffMatrizPK)other;
		return 
			this.fda3CtcSecuen.equals(castOther.fda3CtcSecuen)
			&& this.fda2DatCodigo.equals(castOther.fda2DatCodigo)
			&& this.fda2CtcSecuen.equals(castOther.fda2CtcSecuen)
			&& this.fdaDatCodigo.equals(castOther.fdaDatCodigo)
			&& this.fdaCtcSecuen.equals(castOther.fdaCtcSecuen)
			&& this.datCodigo.equals(castOther.datCodigo)
			&& (this.cncSecuen == castOther.cncSecuen);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fda3CtcSecuen.hashCode();
		hash = hash * prime + this.fda2DatCodigo.hashCode();
		hash = hash * prime + this.fda2CtcSecuen.hashCode();
		hash = hash * prime + this.fdaDatCodigo.hashCode();
		hash = hash * prime + this.fdaCtcSecuen.hashCode();
		hash = hash * prime + this.datCodigo.hashCode();
		hash = hash * prime + ((int) (this.cncSecuen ^ (this.cncSecuen >>> 32)));
		
		return hash;
	}
}