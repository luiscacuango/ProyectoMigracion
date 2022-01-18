package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PORTA_PERJURI database table.
 * 
 */
@Entity
@Table(name="PORTA_PERJURI")
@NamedQuery(name="PortaPerjuri.findAll", query="SELECT p FROM PortaPerjuri p")
public class PortaPerjuri implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CTC_SECUEN")
	private String ctcSecuen;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	@Column(name="FDC_DCI_CODIGO")
	private BigDecimal fdcDciCodigo;

	public PortaPerjuri() {
	}

	public String getCtcSecuen() {
		return this.ctcSecuen;
	}

	public void setCtcSecuen(String ctcSecuen) {
		this.ctcSecuen = ctcSecuen;
	}

	public String getDatCodigo() {
		return this.datCodigo;
	}

	public void setDatCodigo(String datCodigo) {
		this.datCodigo = datCodigo;
	}

	public BigDecimal getFdcDciCodigo() {
		return this.fdcDciCodigo;
	}

	public void setFdcDciCodigo(BigDecimal fdcDciCodigo) {
		this.fdcDciCodigo = fdcDciCodigo;
	}

}