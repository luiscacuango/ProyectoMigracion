package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FCAL_CALCULO database table.
 * 
 */
@Entity
@Table(name="FCAL_CALCULO")
@NamedQuery(name="FcalCalculo.findAll", query="SELECT f FROM FcalCalculo f")
public class FcalCalculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CAL_SECUENCIA")
	private long calSecuencia;

	@Column(name="CAL_COMPONENTS")
	private String calComponents;

	@Column(name="CAL_PERIODO")
	private BigDecimal calPeriodo;

	@Column(name="CAL_PORCENTA")
	private BigDecimal calPorcenta;

	@Column(name="TDE_CODIGO")
	private BigDecimal tdeCodigo;

	public FcalCalculo() {
	}

	public long getCalSecuencia() {
		return this.calSecuencia;
	}

	public void setCalSecuencia(long calSecuencia) {
		this.calSecuencia = calSecuencia;
	}

	public String getCalComponents() {
		return this.calComponents;
	}

	public void setCalComponents(String calComponents) {
		this.calComponents = calComponents;
	}

	public BigDecimal getCalPeriodo() {
		return this.calPeriodo;
	}

	public void setCalPeriodo(BigDecimal calPeriodo) {
		this.calPeriodo = calPeriodo;
	}

	public BigDecimal getCalPorcenta() {
		return this.calPorcenta;
	}

	public void setCalPorcenta(BigDecimal calPorcenta) {
		this.calPorcenta = calPorcenta;
	}

	public BigDecimal getTdeCodigo() {
		return this.tdeCodigo;
	}

	public void setTdeCodigo(BigDecimal tdeCodigo) {
		this.tdeCodigo = tdeCodigo;
	}

}