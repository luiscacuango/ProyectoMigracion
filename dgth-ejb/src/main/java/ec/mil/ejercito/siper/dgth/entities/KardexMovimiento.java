package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the KARDEX_MOVIMIENTOS database table.
 * 
 */
@Entity
@Table(name="KARDEX_MOVIMIENTOS")
@NamedQuery(name="KardexMovimiento.findAll", query="SELECT k FROM KardexMovimiento k")
public class KardexMovimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="FIN_INV_SECUEN")
	private BigDecimal finInvSecuen;

	private BigDecimal movimiento;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	private BigDecimal valor;

	public KardexMovimiento() {
	}

	public BigDecimal getFinInvSecuen() {
		return this.finInvSecuen;
	}

	public void setFinInvSecuen(BigDecimal finInvSecuen) {
		this.finInvSecuen = finInvSecuen;
	}

	public BigDecimal getMovimiento() {
		return this.movimiento;
	}

	public void setMovimiento(BigDecimal movimiento) {
		this.movimiento = movimiento;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}