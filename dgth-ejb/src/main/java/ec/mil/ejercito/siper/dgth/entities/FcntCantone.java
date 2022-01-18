package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FCNT_CANTONES database table.
 * 
 */
@Entity
@Table(name="FCNT_CANTONES")
@NamedQuery(name="FcntCantone.findAll", query="SELECT f FROM FcntCantone f")
public class FcntCantone implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FcntCantonePK id;

	@Column(name="CNT_CODIGO")
	private String cntCodigo;

	public FcntCantone() {
	}

	public FcntCantonePK getId() {
		return this.id;
	}

	public void setId(FcntCantonePK id) {
		this.id = id;
	}

	public String getCntCodigo() {
		return this.cntCodigo;
	}

	public void setCntCodigo(String cntCodigo) {
		this.cntCodigo = cntCodigo;
	}

}