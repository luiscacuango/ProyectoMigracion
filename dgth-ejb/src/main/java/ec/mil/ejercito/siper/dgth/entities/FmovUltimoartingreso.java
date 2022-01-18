package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FMOV_ULTIMOARTINGRESO database table.
 * 
 */
@Entity
@Table(name="FMOV_ULTIMOARTINGRESO")
@NamedQuery(name="FmovUltimoartingreso.findAll", query="SELECT f FROM FmovUltimoartingreso f")
public class FmovUltimoartingreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="FIN_INV_SECUEN")
	private BigDecimal finInvSecuen;

	private BigDecimal movimiento;

	public FmovUltimoartingreso() {
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

}