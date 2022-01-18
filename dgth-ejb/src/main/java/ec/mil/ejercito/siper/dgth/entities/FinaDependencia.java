package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FINA_DEPENDENCIAS database table.
 * 
 */
@Entity
@Table(name="FINA_DEPENDENCIAS")
@NamedQuery(name="FinaDependencia.findAll", query="SELECT f FROM FinaDependencia f")
public class FinaDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String secuencial;

	@Column(name="CODUNID_99")
	private String codunid99;

	@Column(name="NOMBRE_99")
	private String nombre99;

	private String observacion;

	private String unicodigo2;

	public FinaDependencia() {
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

	public String getNombre99() {
		return this.nombre99;
	}

	public void setNombre99(String nombre99) {
		this.nombre99 = nombre99;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getUnicodigo2() {
		return this.unicodigo2;
	}

	public void setUnicodigo2(String unicodigo2) {
		this.unicodigo2 = unicodigo2;
	}

}