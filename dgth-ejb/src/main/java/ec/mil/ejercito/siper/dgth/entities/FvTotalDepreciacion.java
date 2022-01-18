package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FV_TOTAL_DEPRECIACION database table.
 * 
 */
@Entity
@Table(name="FV_TOTAL_DEPRECIACION")
@NamedQuery(name="FvTotalDepreciacion.findAll", query="SELECT f FROM FvTotalDepreciacion f")
public class FvTotalDepreciacion implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal acumulado;

	private String cuenta;

	private BigDecimal depreciacion;

	private BigDecimal historico;

	private String ncuenta;

	private BigDecimal neto;

	public FvTotalDepreciacion() {
	}

	public BigDecimal getAcumulado() {
		return this.acumulado;
	}

	public void setAcumulado(BigDecimal acumulado) {
		this.acumulado = acumulado;
	}

	public String getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public BigDecimal getDepreciacion() {
		return this.depreciacion;
	}

	public void setDepreciacion(BigDecimal depreciacion) {
		this.depreciacion = depreciacion;
	}

	public BigDecimal getHistorico() {
		return this.historico;
	}

	public void setHistorico(BigDecimal historico) {
		this.historico = historico;
	}

	public String getNcuenta() {
		return this.ncuenta;
	}

	public void setNcuenta(String ncuenta) {
		this.ncuenta = ncuenta;
	}

	public BigDecimal getNeto() {
		return this.neto;
	}

	public void setNeto(BigDecimal neto) {
		this.neto = neto;
	}

}