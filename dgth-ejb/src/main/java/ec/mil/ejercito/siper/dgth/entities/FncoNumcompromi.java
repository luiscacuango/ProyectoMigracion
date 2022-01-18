package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FNCO_NUMCOMPROMI database table.
 * 
 */
@Entity
@Table(name="FNCO_NUMCOMPROMI")
@NamedQuery(name="FncoNumcompromi.findAll", query="SELECT f FROM FncoNumcompromi f")
public class FncoNumcompromi implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FncoNumcompromiPK id;

	@Column(name="NCO_MAX")
	private BigDecimal ncoMax;

	@Column(name="NCO_NCMAX")
	private BigDecimal ncoNcmax;

	@Column(name="NRE_REFORMAS")
	private BigDecimal nreReformas;

	@Column(name="NRE_REFORMASPRESUP")
	private BigDecimal nreReformaspresup;

	public FncoNumcompromi() {
	}

	public FncoNumcompromiPK getId() {
		return this.id;
	}

	public void setId(FncoNumcompromiPK id) {
		this.id = id;
	}

	public BigDecimal getNcoMax() {
		return this.ncoMax;
	}

	public void setNcoMax(BigDecimal ncoMax) {
		this.ncoMax = ncoMax;
	}

	public BigDecimal getNcoNcmax() {
		return this.ncoNcmax;
	}

	public void setNcoNcmax(BigDecimal ncoNcmax) {
		this.ncoNcmax = ncoNcmax;
	}

	public BigDecimal getNreReformas() {
		return this.nreReformas;
	}

	public void setNreReformas(BigDecimal nreReformas) {
		this.nreReformas = nreReformas;
	}

	public BigDecimal getNreReformaspresup() {
		return this.nreReformaspresup;
	}

	public void setNreReformaspresup(BigDecimal nreReformaspresup) {
		this.nreReformaspresup = nreReformaspresup;
	}

}