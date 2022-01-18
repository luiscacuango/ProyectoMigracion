package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FV_ULTIMA_DEPRECIACION database table.
 * 
 */
@Entity
@Table(name="FV_ULTIMA_DEPRECIACION")
@NamedQuery(name="FvUltimaDepreciacion.findAll", query="SELECT f FROM FvUltimaDepreciacion f")
public class FvUltimaDepreciacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private BigDecimal movimiento;

	public FvUltimaDepreciacion() {
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMovimiento() {
		return this.movimiento;
	}

	public void setMovimiento(BigDecimal movimiento) {
		this.movimiento = movimiento;
	}

}