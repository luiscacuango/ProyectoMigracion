package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FAUP_AUXIPRESU database table.
 * 
 */
@Entity
@Table(name="FAUP_AUXIPRESU")
@NamedQuery(name="FaupAuxipresu.findAll", query="SELECT f FROM FaupAuxipresu f")
public class FaupAuxipresu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AUP_SECUENCIA")
	private long aupSecuencia;

	@Column(name="AUP_ANIO")
	private BigDecimal aupAnio;

	@Column(name="AUP_DESCRIPCION")
	private String aupDescripcion;

	@Column(name="AUP_ORDEN")
	private BigDecimal aupOrden;

	@Column(name="AUP_TIPO")
	private String aupTipo;

	@Column(name="AUP_VALOR")
	private BigDecimal aupValor;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	@Column(name="FDA_CTC_SECUEN")
	private String fdaCtcSecuen;

	public FaupAuxipresu() {
	}

	public long getAupSecuencia() {
		return this.aupSecuencia;
	}

	public void setAupSecuencia(long aupSecuencia) {
		this.aupSecuencia = aupSecuencia;
	}

	public BigDecimal getAupAnio() {
		return this.aupAnio;
	}

	public void setAupAnio(BigDecimal aupAnio) {
		this.aupAnio = aupAnio;
	}

	public String getAupDescripcion() {
		return this.aupDescripcion;
	}

	public void setAupDescripcion(String aupDescripcion) {
		this.aupDescripcion = aupDescripcion;
	}

	public BigDecimal getAupOrden() {
		return this.aupOrden;
	}

	public void setAupOrden(BigDecimal aupOrden) {
		this.aupOrden = aupOrden;
	}

	public String getAupTipo() {
		return this.aupTipo;
	}

	public void setAupTipo(String aupTipo) {
		this.aupTipo = aupTipo;
	}

	public BigDecimal getAupValor() {
		return this.aupValor;
	}

	public void setAupValor(BigDecimal aupValor) {
		this.aupValor = aupValor;
	}

	public String getDatCodigo() {
		return this.datCodigo;
	}

	public void setDatCodigo(String datCodigo) {
		this.datCodigo = datCodigo;
	}

	public String getFdaCtcSecuen() {
		return this.fdaCtcSecuen;
	}

	public void setFdaCtcSecuen(String fdaCtcSecuen) {
		this.fdaCtcSecuen = fdaCtcSecuen;
	}

}