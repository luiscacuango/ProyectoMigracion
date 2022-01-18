package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FV_DEPENDENCIA database table.
 * 
 */
@Entity
@Table(name="FV_DEPENDENCIA")
@NamedQuery(name="FvDependencia.findAll", query="SELECT f FROM FvDependencia f")
public class FvDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="MUN3_UNI_CODIGO2")
	private String mun3UniCodigo2;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	@Column(name="UNI_DESCRI2")
	private String uniDescri2;

	@Column(name="UNI_SIGLAS2")
	private String uniSiglas2;

	@Column(name="UNI_TIPO")
	private String uniTipo;

	public FvDependencia() {
	}

	public String getMun3UniCodigo2() {
		return this.mun3UniCodigo2;
	}

	public void setMun3UniCodigo2(String mun3UniCodigo2) {
		this.mun3UniCodigo2 = mun3UniCodigo2;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public String getUniDescri2() {
		return this.uniDescri2;
	}

	public void setUniDescri2(String uniDescri2) {
		this.uniDescri2 = uniDescri2;
	}

	public String getUniSiglas2() {
		return this.uniSiglas2;
	}

	public void setUniSiglas2(String uniSiglas2) {
		this.uniSiglas2 = uniSiglas2;
	}

	public String getUniTipo() {
		return this.uniTipo;
	}

	public void setUniTipo(String uniTipo) {
		this.uniTipo = uniTipo;
	}

}