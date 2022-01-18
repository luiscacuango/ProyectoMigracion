package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FMFF_MATRIZ database table.
 * 
 */
@Entity
@Table(name="FMFF_MATRIZ")
@NamedQuery(name="FmffMatriz.findAll", query="SELECT f FROM FmffMatriz f")
public class FmffMatriz implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FmffMatrizPK id;

	//bi-directional many-to-one association to FcncConcepto
	@ManyToOne
	@JoinColumn(name="CNC_SECUEN")
	private FcncConcepto fcncConcepto;

	public FmffMatriz() {
	}

	public FmffMatrizPK getId() {
		return this.id;
	}

	public void setId(FmffMatrizPK id) {
		this.id = id;
	}

	public FcncConcepto getFcncConcepto() {
		return this.fcncConcepto;
	}

	public void setFcncConcepto(FcncConcepto fcncConcepto) {
		this.fcncConcepto = fcncConcepto;
	}

}