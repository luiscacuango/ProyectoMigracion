package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FV_FIRMAS database table.
 * 
 */
@Entity
@Table(name="FV_FIRMAS")
@NamedQuery(name="FvFirma.findAll", query="SELECT f FROM FvFirma f")
public class FvFirma implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descripcion;

	private String firma;

	private BigDecimal ord;

	public FvFirma() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFirma() {
		return this.firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public BigDecimal getOrd() {
		return this.ord;
	}

	public void setOrd(BigDecimal ord) {
		this.ord = ord;
	}

}