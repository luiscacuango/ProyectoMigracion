package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FACT_FIRMAS database table.
 * 
 */
@Entity
@Table(name="FACT_FIRMAS")
@NamedQuery(name="FactFirma.findAll", query="SELECT f FROM FactFirma f")
public class FactFirma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FIR_SECUEN")
	private long firSecuen;

	@Column(name="FIR_CARGO")
	private String firCargo;

	@Column(name="FIR_ORDEN")
	private BigDecimal firOrden;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	@Column(name="MEN_OPCION")
	private String menOpcion;

	@Column(name="SIS_CODIGOSISSUB")
	private String sisCodigosissub;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	public FactFirma() {
	}

	public long getFirSecuen() {
		return this.firSecuen;
	}

	public void setFirSecuen(long firSecuen) {
		this.firSecuen = firSecuen;
	}

	public String getFirCargo() {
		return this.firCargo;
	}

	public void setFirCargo(String firCargo) {
		this.firCargo = firCargo;
	}

	public BigDecimal getFirOrden() {
		return this.firOrden;
	}

	public void setFirOrden(BigDecimal firOrden) {
		this.firOrden = firOrden;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public String getMenOpcion() {
		return this.menOpcion;
	}

	public void setMenOpcion(String menOpcion) {
		this.menOpcion = menOpcion;
	}

	public String getSisCodigosissub() {
		return this.sisCodigosissub;
	}

	public void setSisCodigosissub(String sisCodigosissub) {
		this.sisCodigosissub = sisCodigosissub;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

}