package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPRP_PLANTREPO database table.
 * 
 */
@Entity
@Table(name="FPRP_PLANTREPO")
@NamedQuery(name="FprpPlantrepo.findAll", query="SELECT f FROM FprpPlantrepo f")
public class FprpPlantrepo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRP_SECUENCIAL")
	private long prpSecuencial;

	@Column(name="CTC_SECUEN")
	private String ctcSecuen;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	@Column(name="PRP_BLOQUE")
	private BigDecimal prpBloque;

	@Column(name="PRP_CTACONT")
	private String prpCtacont;

	@Column(name="PRP_TIPO")
	private String prpTipo;

	@Column(name="TRP_CODIGO")
	private BigDecimal trpCodigo;

	public FprpPlantrepo() {
	}

	public long getPrpSecuencial() {
		return this.prpSecuencial;
	}

	public void setPrpSecuencial(long prpSecuencial) {
		this.prpSecuencial = prpSecuencial;
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

	public BigDecimal getPrpBloque() {
		return this.prpBloque;
	}

	public void setPrpBloque(BigDecimal prpBloque) {
		this.prpBloque = prpBloque;
	}

	public String getPrpCtacont() {
		return this.prpCtacont;
	}

	public void setPrpCtacont(String prpCtacont) {
		this.prpCtacont = prpCtacont;
	}

	public String getPrpTipo() {
		return this.prpTipo;
	}

	public void setPrpTipo(String prpTipo) {
		this.prpTipo = prpTipo;
	}

	public BigDecimal getTrpCodigo() {
		return this.trpCodigo;
	}

	public void setTrpCodigo(BigDecimal trpCodigo) {
		this.trpCodigo = trpCodigo;
	}

}