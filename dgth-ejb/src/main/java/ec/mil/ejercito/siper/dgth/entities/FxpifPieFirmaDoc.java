package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FXPIF_PIE_FIRMA_DOC database table.
 * 
 */
@Entity
@Table(name="FXPIF_PIE_FIRMA_DOC")
@NamedQuery(name="FxpifPieFirmaDoc.findAll", query="SELECT f FROM FxpifPieFirmaDoc f")
public class FxpifPieFirmaDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	@Column(name="PIF_DESC_PUESTO")
	private String pifDescPuesto;

	@Column(name="PIF_ESPECIALIDAD")
	private String pifEspecialidad;

	@Column(name="PIF_NOMBRE")
	private String pifNombre;

	@Column(name="PIF_SECUENCIAL")
	private BigDecimal pifSecuencial;

	@Column(name="PUE_CODIGO2")
	private String pueCodigo2;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	public FxpifPieFirmaDoc() {
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public String getPifDescPuesto() {
		return this.pifDescPuesto;
	}

	public void setPifDescPuesto(String pifDescPuesto) {
		this.pifDescPuesto = pifDescPuesto;
	}

	public String getPifEspecialidad() {
		return this.pifEspecialidad;
	}

	public void setPifEspecialidad(String pifEspecialidad) {
		this.pifEspecialidad = pifEspecialidad;
	}

	public String getPifNombre() {
		return this.pifNombre;
	}

	public void setPifNombre(String pifNombre) {
		this.pifNombre = pifNombre;
	}

	public BigDecimal getPifSecuencial() {
		return this.pifSecuencial;
	}

	public void setPifSecuencial(BigDecimal pifSecuencial) {
		this.pifSecuencial = pifSecuencial;
	}

	public String getPueCodigo2() {
		return this.pueCodigo2;
	}

	public void setPueCodigo2(String pueCodigo2) {
		this.pueCodigo2 = pueCodigo2;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

}