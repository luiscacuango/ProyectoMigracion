package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPER_PRESUP database table.
 * 
 */
@Entity
@Table(name="FPER_PRESUP")
@NamedQuery(name="FperPresup.findAll", query="SELECT f FROM FperPresup f")
public class FperPresup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PER_SECUEN")
	private long perSecuen;

	@Column(name="PER_ANIO")
	private BigDecimal perAnio;

	@Column(name="PER_DESCRI")
	private String perDescri;

	@Column(name="PER_NMESES")
	private BigDecimal perNmeses;

	@Column(name="PER_PERIODOS")
	private BigDecimal perPeriodos;

	public FperPresup() {
	}

	public long getPerSecuen() {
		return this.perSecuen;
	}

	public void setPerSecuen(long perSecuen) {
		this.perSecuen = perSecuen;
	}

	public BigDecimal getPerAnio() {
		return this.perAnio;
	}

	public void setPerAnio(BigDecimal perAnio) {
		this.perAnio = perAnio;
	}

	public String getPerDescri() {
		return this.perDescri;
	}

	public void setPerDescri(String perDescri) {
		this.perDescri = perDescri;
	}

	public BigDecimal getPerNmeses() {
		return this.perNmeses;
	}

	public void setPerNmeses(BigDecimal perNmeses) {
		this.perNmeses = perNmeses;
	}

	public BigDecimal getPerPeriodos() {
		return this.perPeriodos;
	}

	public void setPerPeriodos(BigDecimal perPeriodos) {
		this.perPeriodos = perPeriodos;
	}

}