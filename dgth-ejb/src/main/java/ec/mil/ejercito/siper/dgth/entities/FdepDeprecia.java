package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FDEP_DEPRECIA database table.
 * 
 */
@Entity
@Table(name="FDEP_DEPRECIA")
@NamedQuery(name="FdepDeprecia.findAll", query="SELECT f FROM FdepDeprecia f")
public class FdepDeprecia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DEP_SECUEN")
	private long depSecuen;

	@Temporal(TemporalType.DATE)
	@Column(name="DEP_FECDEP")
	private Date depFecdep;

	@Column(name="MONTO_ACUMULADO")
	private BigDecimal montoAcumulado;

	@Column(name="MONTO_DEPRECIADO")
	private BigDecimal montoDepreciado;

	@Column(name="MONTO_HISTORICO")
	private BigDecimal montoHistorico;

	@Column(name="VIDAUTIL_HISTORICA")
	private BigDecimal vidautilHistorica;

	//bi-directional many-to-one association to FactContable
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ACT_ANIO", referencedColumnName="ACT_ANIO"),
		@JoinColumn(name="FAC_ACT_SECCON", referencedColumnName="ACT_SECCON")
		})
	private FactContable factContable;

	//bi-directional many-to-one association to FmovArticulo
	@ManyToOne
	@JoinColumn(name="FMO_MOV_SECUEN")
	private FmovArticulo fmovArticulo;

	public FdepDeprecia() {
	}

	public long getDepSecuen() {
		return this.depSecuen;
	}

	public void setDepSecuen(long depSecuen) {
		this.depSecuen = depSecuen;
	}

	public Date getDepFecdep() {
		return this.depFecdep;
	}

	public void setDepFecdep(Date depFecdep) {
		this.depFecdep = depFecdep;
	}

	public BigDecimal getMontoAcumulado() {
		return this.montoAcumulado;
	}

	public void setMontoAcumulado(BigDecimal montoAcumulado) {
		this.montoAcumulado = montoAcumulado;
	}

	public BigDecimal getMontoDepreciado() {
		return this.montoDepreciado;
	}

	public void setMontoDepreciado(BigDecimal montoDepreciado) {
		this.montoDepreciado = montoDepreciado;
	}

	public BigDecimal getMontoHistorico() {
		return this.montoHistorico;
	}

	public void setMontoHistorico(BigDecimal montoHistorico) {
		this.montoHistorico = montoHistorico;
	}

	public BigDecimal getVidautilHistorica() {
		return this.vidautilHistorica;
	}

	public void setVidautilHistorica(BigDecimal vidautilHistorica) {
		this.vidautilHistorica = vidautilHistorica;
	}

	public FactContable getFactContable() {
		return this.factContable;
	}

	public void setFactContable(FactContable factContable) {
		this.factContable = factContable;
	}

	public FmovArticulo getFmovArticulo() {
		return this.fmovArticulo;
	}

	public void setFmovArticulo(FmovArticulo fmovArticulo) {
		this.fmovArticulo = fmovArticulo;
	}

}