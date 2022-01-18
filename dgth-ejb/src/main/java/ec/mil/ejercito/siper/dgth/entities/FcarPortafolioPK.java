package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FCAR_PORTAFOLIO database table.
 * 
 */
@Embeddable
public class FcarPortafolioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="FDC_DCI_CODIGO", insertable=false, updatable=false)
	private long fdcDciCodigo;

	@Column(name="CTC_SECUEN")
	private String ctcSecuen;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	public FcarPortafolioPK() {
	}
	public long getFdcDciCodigo() {
		return this.fdcDciCodigo;
	}
	public void setFdcDciCodigo(long fdcDciCodigo) {
		this.fdcDciCodigo = fdcDciCodigo;
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
		if (!(other instanceof FcarPortafolioPK)) {
			return false;
		}
		FcarPortafolioPK castOther = (FcarPortafolioPK)other;
		return 
			(this.fdcDciCodigo == castOther.fdcDciCodigo)
			&& this.ctcSecuen.equals(castOther.ctcSecuen)
			&& this.datCodigo.equals(castOther.datCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.fdcDciCodigo ^ (this.fdcDciCodigo >>> 32)));
		hash = hash * prime + this.ctcSecuen.hashCode();
		hash = hash * prime + this.datCodigo.hashCode();
		
		return hash;
	}
}