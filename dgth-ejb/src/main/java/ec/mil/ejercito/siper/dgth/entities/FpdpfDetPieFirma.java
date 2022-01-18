package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPDPF_DET_PIE_FIRMA database table.
 * 
 */
@Entity
@Table(name="FPDPF_DET_PIE_FIRMA")
@NamedQuery(name="FpdpfDetPieFirma.findAll", query="SELECT f FROM FpdpfDetPieFirma f")
public class FpdpfDetPieFirma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PIF_SECUENCIAL")
	private BigDecimal pifSecuencial;

	@Column(name="TRP_CODIGO")
	private BigDecimal trpCodigo;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	public FpdpfDetPieFirma() {
	}

	public BigDecimal getPifSecuencial() {
		return this.pifSecuencial;
	}

	public void setPifSecuencial(BigDecimal pifSecuencial) {
		this.pifSecuencial = pifSecuencial;
	}

	public BigDecimal getTrpCodigo() {
		return this.trpCodigo;
	}

	public void setTrpCodigo(BigDecimal trpCodigo) {
		this.trpCodigo = trpCodigo;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

}