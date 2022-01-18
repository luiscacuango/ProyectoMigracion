package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FCNC_CONCEPTO database table.
 * 
 */
@Entity
@Table(name="FCNC_CONCEPTO")
@NamedQuery(name="FcncConcepto.findAll", query="SELECT f FROM FcncConcepto f")
public class FcncConcepto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CNC_SECUEN")
	private long cncSecuen;

	@Temporal(TemporalType.DATE)
	@Column(name="CNC_FECHA")
	private Date cncFecha;

	@Column(name="CNC_NOMBRE")
	private String cncNombre;

	@Column(name="CNC_NUMERO")
	private String cncNumero;

	//bi-directional many-to-one association to FmffMatriz
	@OneToMany(mappedBy="fcncConcepto")
	private List<FmffMatriz> fmffMatrizs;

	public FcncConcepto() {
	}

	public long getCncSecuen() {
		return this.cncSecuen;
	}

	public void setCncSecuen(long cncSecuen) {
		this.cncSecuen = cncSecuen;
	}

	public Date getCncFecha() {
		return this.cncFecha;
	}

	public void setCncFecha(Date cncFecha) {
		this.cncFecha = cncFecha;
	}

	public String getCncNombre() {
		return this.cncNombre;
	}

	public void setCncNombre(String cncNombre) {
		this.cncNombre = cncNombre;
	}

	public String getCncNumero() {
		return this.cncNumero;
	}

	public void setCncNumero(String cncNumero) {
		this.cncNumero = cncNumero;
	}

	public List<FmffMatriz> getFmffMatrizs() {
		return this.fmffMatrizs;
	}

	public void setFmffMatrizs(List<FmffMatriz> fmffMatrizs) {
		this.fmffMatrizs = fmffMatrizs;
	}

	public FmffMatriz addFmffMatriz(FmffMatriz fmffMatriz) {
		getFmffMatrizs().add(fmffMatriz);
		fmffMatriz.setFcncConcepto(this);

		return fmffMatriz;
	}

	public FmffMatriz removeFmffMatriz(FmffMatriz fmffMatriz) {
		getFmffMatrizs().remove(fmffMatriz);
		fmffMatriz.setFcncConcepto(null);

		return fmffMatriz;
	}

}