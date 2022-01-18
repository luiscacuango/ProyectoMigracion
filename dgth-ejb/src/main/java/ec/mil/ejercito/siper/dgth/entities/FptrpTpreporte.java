package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPTRP_TPREPORTE database table.
 * 
 */
@Entity
@Table(name="FPTRP_TPREPORTE")
@NamedQuery(name="FptrpTpreporte.findAll", query="SELECT f FROM FptrpTpreporte f")
public class FptrpTpreporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="TRP_CODIGO")
	private BigDecimal trpCodigo;

	@Column(name="TRP_DESCRIPCION")
	private String trpDescripcion;

	public FptrpTpreporte() {
	}

	public BigDecimal getTrpCodigo() {
		return this.trpCodigo;
	}

	public void setTrpCodigo(BigDecimal trpCodigo) {
		this.trpCodigo = trpCodigo;
	}

	public String getTrpDescripcion() {
		return this.trpDescripcion;
	}

	public void setTrpDescripcion(String trpDescripcion) {
		this.trpDescripcion = trpDescripcion;
	}

}