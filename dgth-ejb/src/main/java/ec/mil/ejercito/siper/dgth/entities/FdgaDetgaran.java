package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FDGA_DETGARAN database table.
 * 
 */
@Entity
@Table(name="FDGA_DETGARAN")
@NamedQuery(name="FdgaDetgaran.findAll", query="SELECT f FROM FdgaDetgaran f")
public class FdgaDetgaran implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DGA_SECUEN")
	private long dgaSecuen;

	@Column(name="DGA_ACCION")
	private String dgaAccion;

	@Column(name="DGA_ESTADO")
	private String dgaEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="DGA_FECHA")
	private Date dgaFecha;

	@Column(name="GAR_CODIGOGA")
	private BigDecimal garCodigoga;

	public FdgaDetgaran() {
	}

	public long getDgaSecuen() {
		return this.dgaSecuen;
	}

	public void setDgaSecuen(long dgaSecuen) {
		this.dgaSecuen = dgaSecuen;
	}

	public String getDgaAccion() {
		return this.dgaAccion;
	}

	public void setDgaAccion(String dgaAccion) {
		this.dgaAccion = dgaAccion;
	}

	public String getDgaEstado() {
		return this.dgaEstado;
	}

	public void setDgaEstado(String dgaEstado) {
		this.dgaEstado = dgaEstado;
	}

	public Date getDgaFecha() {
		return this.dgaFecha;
	}

	public void setDgaFecha(Date dgaFecha) {
		this.dgaFecha = dgaFecha;
	}

	public BigDecimal getGarCodigoga() {
		return this.garCodigoga;
	}

	public void setGarCodigoga(BigDecimal garCodigoga) {
		this.garCodigoga = garCodigoga;
	}

}