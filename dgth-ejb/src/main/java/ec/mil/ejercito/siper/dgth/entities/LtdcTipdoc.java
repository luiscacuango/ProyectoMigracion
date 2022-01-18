package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LTDC_TIPDOC database table.
 * 
 */
@Entity
@Table(name="LTDC_TIPDOC")
@NamedQuery(name="LtdcTipdoc.findAll", query="SELECT l FROM LtdcTipdoc l")
public class LtdcTipdoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="TDC_ABREVI")
	private String tdcAbrevi;

	@Column(name="TDC_DOCUME")
	private String tdcDocume;

	@Column(name="TDC_SECUEN")
	private BigDecimal tdcSecuen;

	public LtdcTipdoc() {
	}

	public String getTdcAbrevi() {
		return this.tdcAbrevi;
	}

	public void setTdcAbrevi(String tdcAbrevi) {
		this.tdcAbrevi = tdcAbrevi;
	}

	public String getTdcDocume() {
		return this.tdcDocume;
	}

	public void setTdcDocume(String tdcDocume) {
		this.tdcDocume = tdcDocume;
	}

	public BigDecimal getTdcSecuen() {
		return this.tdcSecuen;
	}

	public void setTdcSecuen(BigDecimal tdcSecuen) {
		this.tdcSecuen = tdcSecuen;
	}

}