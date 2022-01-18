package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FINA_UNIDADES database table.
 * 
 */
@Entity
@Table(name="FINA_UNIDADES")
@NamedQuery(name="FinaUnidade.findAll", query="SELECT f FROM FinaUnidade f")
public class FinaUnidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String secuencial;

	@Column(name="CODUNID_99")
	private String codunid99;

	@Column(name="LUGAR_99")
	private String lugar99;

	@Column(name="NOMBRE_99")
	private String nombre99;

	private String observ;

	@Column(name="SIGLAS_99")
	private String siglas99;

	private String unicodigo2;

	public FinaUnidade() {
	}

	public String getSecuencial() {
		return this.secuencial;
	}

	public void setSecuencial(String secuencial) {
		this.secuencial = secuencial;
	}

	public String getCodunid99() {
		return this.codunid99;
	}

	public void setCodunid99(String codunid99) {
		this.codunid99 = codunid99;
	}

	public String getLugar99() {
		return this.lugar99;
	}

	public void setLugar99(String lugar99) {
		this.lugar99 = lugar99;
	}

	public String getNombre99() {
		return this.nombre99;
	}

	public void setNombre99(String nombre99) {
		this.nombre99 = nombre99;
	}

	public String getObserv() {
		return this.observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public String getSiglas99() {
		return this.siglas99;
	}

	public void setSiglas99(String siglas99) {
		this.siglas99 = siglas99;
	}

	public String getUnicodigo2() {
		return this.unicodigo2;
	}

	public void setUnicodigo2(String unicodigo2) {
		this.unicodigo2 = unicodigo2;
	}

}