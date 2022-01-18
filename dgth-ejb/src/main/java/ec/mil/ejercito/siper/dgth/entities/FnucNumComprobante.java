package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FNUC_NUM_COMPROBANTE database table.
 * 
 */
@Entity
@Table(name="FNUC_NUM_COMPROBANTE")
@NamedQuery(name="FnucNumComprobante.findAll", query="SELECT f FROM FnucNumComprobante f")
public class FnucNumComprobante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NUC_SECUENCIA")
	private long nucSecuencia;

	@Column(name="NUC_COMPROBANTE")
	private BigDecimal nucComprobante;

	@Column(name="NUC_TIPO")
	private String nucTipo;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	public FnucNumComprobante() {
	}

	public long getNucSecuencia() {
		return this.nucSecuencia;
	}

	public void setNucSecuencia(long nucSecuencia) {
		this.nucSecuencia = nucSecuencia;
	}

	public BigDecimal getNucComprobante() {
		return this.nucComprobante;
	}

	public void setNucComprobante(BigDecimal nucComprobante) {
		this.nucComprobante = nucComprobante;
	}

	public String getNucTipo() {
		return this.nucTipo;
	}

	public void setNucTipo(String nucTipo) {
		this.nucTipo = nucTipo;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

}