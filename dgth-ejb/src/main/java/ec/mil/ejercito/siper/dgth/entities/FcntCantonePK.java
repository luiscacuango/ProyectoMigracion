package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FCNT_CANTONES database table.
 * 
 */
@Embeddable
public class FcntCantonePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PRV_CODIGO")
	private String prvCodigo;

	@Column(name="CAN_CODIGO")
	private String canCodigo;

	public FcntCantonePK() {
	}
	public String getPrvCodigo() {
		return this.prvCodigo;
	}
	public void setPrvCodigo(String prvCodigo) {
		this.prvCodigo = prvCodigo;
	}
	public String getCanCodigo() {
		return this.canCodigo;
	}
	public void setCanCodigo(String canCodigo) {
		this.canCodigo = canCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FcntCantonePK)) {
			return false;
		}
		FcntCantonePK castOther = (FcntCantonePK)other;
		return 
			this.prvCodigo.equals(castOther.prvCodigo)
			&& this.canCodigo.equals(castOther.canCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.prvCodigo.hashCode();
		hash = hash * prime + this.canCodigo.hashCode();
		
		return hash;
	}
}