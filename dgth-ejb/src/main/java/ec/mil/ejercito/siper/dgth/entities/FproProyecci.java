package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FPRO_PROYECCI database table.
 * 
 */
@Entity
@Table(name="FPRO_PROYECCI")
@NamedQuery(name="FproProyecci.findAll", query="SELECT f FROM FproProyecci f")
public class FproProyecci implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRO_SECUENCIA")
	private long proSecuencia;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	@Column(name="PRO_ESTADO")
	private String proEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="PRO_FECHAING")
	private Date proFechaing;

	@Column(name="PRO_OBSERVA")
	private String proObserva;

	@Column(name="PRO_VALOR")
	private BigDecimal proValor;

	@Column(name="TDE_CODIGO")
	private BigDecimal tdeCodigo;

	public FproProyecci() {
	}

	public long getProSecuencia() {
		return this.proSecuencia;
	}

	public void setProSecuencia(long proSecuencia) {
		this.proSecuencia = proSecuencia;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public String getProEstado() {
		return this.proEstado;
	}

	public void setProEstado(String proEstado) {
		this.proEstado = proEstado;
	}

	public Date getProFechaing() {
		return this.proFechaing;
	}

	public void setProFechaing(Date proFechaing) {
		this.proFechaing = proFechaing;
	}

	public String getProObserva() {
		return this.proObserva;
	}

	public void setProObserva(String proObserva) {
		this.proObserva = proObserva;
	}

	public BigDecimal getProValor() {
		return this.proValor;
	}

	public void setProValor(BigDecimal proValor) {
		this.proValor = proValor;
	}

	public BigDecimal getTdeCodigo() {
		return this.tdeCodigo;
	}

	public void setTdeCodigo(BigDecimal tdeCodigo) {
		this.tdeCodigo = tdeCodigo;
	}

}