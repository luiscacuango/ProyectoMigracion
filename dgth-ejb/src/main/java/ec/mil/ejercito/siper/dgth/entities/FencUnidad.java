package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FENC_UNIDAD database table.
 * 
 */
@Entity
@Table(name="FENC_UNIDAD")
@NamedQuery(name="FencUnidad.findAll", query="SELECT f FROM FencUnidad f")
public class FencUnidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ENCUNI_SECUEN")
	private long encuniSecuen;

	@Column(name="ENCUNI_CEDULA")
	private String encuniCedula;

	@Temporal(TemporalType.DATE)
	@Column(name="ENCUNI_FECINICIO")
	private Date encuniFecinicio;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	public FencUnidad() {
	}

	public long getEncuniSecuen() {
		return this.encuniSecuen;
	}

	public void setEncuniSecuen(long encuniSecuen) {
		this.encuniSecuen = encuniSecuen;
	}

	public String getEncuniCedula() {
		return this.encuniCedula;
	}

	public void setEncuniCedula(String encuniCedula) {
		this.encuniCedula = encuniCedula;
	}

	public Date getEncuniFecinicio() {
		return this.encuniFecinicio;
	}

	public void setEncuniFecinicio(Date encuniFecinicio) {
		this.encuniFecinicio = encuniFecinicio;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

}