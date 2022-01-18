package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FMAT_MATRIZ_CONTABLE database table.
 * 
 */
@Embeddable
public class FmatMatrizContablePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="FDA_CTC_SECUEN")
	private String fdaCtcSecuen;

	@Column(name="CTC_SECUEN")
	private String ctcSecuen;

	@Column(name="FDA_DAT_CODIGO")
	private String fdaDatCodigo;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	public FmatMatrizContablePK() {
	}
	public String getFdaCtcSecuen() {
		return this.fdaCtcSecuen;
	}
	public void setFdaCtcSecuen(String fdaCtcSecuen) {
		this.fdaCtcSecuen = fdaCtcSecuen;
	}
	public String getCtcSecuen() {
		return this.ctcSecuen;
	}
	public void setCtcSecuen(String ctcSecuen) {
		this.ctcSecuen = ctcSecuen;
	}
	public String getFdaDatCodigo() {
		return this.fdaDatCodigo;
	}
	public void setFdaDatCodigo(String fdaDatCodigo) {
		this.fdaDatCodigo = fdaDatCodigo;
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
		if (!(other instanceof FmatMatrizContablePK)) {
			return false;
		}
		FmatMatrizContablePK castOther = (FmatMatrizContablePK)other;
		return 
			this.fdaCtcSecuen.equals(castOther.fdaCtcSecuen)
			&& this.ctcSecuen.equals(castOther.ctcSecuen)
			&& this.fdaDatCodigo.equals(castOther.fdaDatCodigo)
			&& this.datCodigo.equals(castOther.datCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fdaCtcSecuen.hashCode();
		hash = hash * prime + this.ctcSecuen.hashCode();
		hash = hash * prime + this.fdaDatCodigo.hashCode();
		hash = hash * prime + this.datCodigo.hashCode();
		
		return hash;
	}
}