package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPPP_PARAMPAR database table.
 * 
 */
@Entity
@Table(name="FPPP_PARAMPAR")
@NamedQuery(name="FpppParampar.findAll", query="SELECT f FROM FpppParampar f")
public class FpppParampar implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FpppParamparPK id;

	@Column(name="PPP_BLOQUE")
	private BigDecimal pppBloque;

	@Column(name="PPP_BLOQUEREP")
	private BigDecimal pppBloquerep;

	@Column(name="PPP_COD")
	private String pppCod;

	@Column(name="PPP_MUESTRA")
	private BigDecimal pppMuestra;

	@Column(name="PPP_MUESTRAREP")
	private BigDecimal pppMuestrarep;

	@Column(name="PPP_POSINI")
	private BigDecimal pppPosini;

	@Column(name="PPP_TAMANO")
	private BigDecimal pppTamano;

	//bi-directional many-to-one association to FctcCatalogo
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CTC_ANIO", referencedColumnName="CTC_ANIO"),
		@JoinColumn(name="CTC_SECUEN", referencedColumnName="CTC_SECUEN")
		})
	private FctcCatalogo fctcCatalogo;

	public FpppParampar() {
	}

	public FpppParamparPK getId() {
		return this.id;
	}

	public void setId(FpppParamparPK id) {
		this.id = id;
	}

	public BigDecimal getPppBloque() {
		return this.pppBloque;
	}

	public void setPppBloque(BigDecimal pppBloque) {
		this.pppBloque = pppBloque;
	}

	public BigDecimal getPppBloquerep() {
		return this.pppBloquerep;
	}

	public void setPppBloquerep(BigDecimal pppBloquerep) {
		this.pppBloquerep = pppBloquerep;
	}

	public String getPppCod() {
		return this.pppCod;
	}

	public void setPppCod(String pppCod) {
		this.pppCod = pppCod;
	}

	public BigDecimal getPppMuestra() {
		return this.pppMuestra;
	}

	public void setPppMuestra(BigDecimal pppMuestra) {
		this.pppMuestra = pppMuestra;
	}

	public BigDecimal getPppMuestrarep() {
		return this.pppMuestrarep;
	}

	public void setPppMuestrarep(BigDecimal pppMuestrarep) {
		this.pppMuestrarep = pppMuestrarep;
	}

	public BigDecimal getPppPosini() {
		return this.pppPosini;
	}

	public void setPppPosini(BigDecimal pppPosini) {
		this.pppPosini = pppPosini;
	}

	public BigDecimal getPppTamano() {
		return this.pppTamano;
	}

	public void setPppTamano(BigDecimal pppTamano) {
		this.pppTamano = pppTamano;
	}

	public FctcCatalogo getFctcCatalogo() {
		return this.fctcCatalogo;
	}

	public void setFctcCatalogo(FctcCatalogo fctcCatalogo) {
		this.fctcCatalogo = fctcCatalogo;
	}

}