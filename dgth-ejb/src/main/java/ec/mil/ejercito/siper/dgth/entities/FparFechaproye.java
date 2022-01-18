package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPAR_FECHAPROYE database table.
 * 
 */
@Entity
@Table(name="FPAR_FECHAPROYE")
@NamedQuery(name="FparFechaproye.findAll", query="SELECT f FROM FparFechaproye f")
public class FparFechaproye implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PAR_CODIGO")
	private BigDecimal parCodigo;

	@Column(name="PAR_ESTADO")
	private String parEstado;

	@Column(name="PAR_FECHALIM")
	private BigDecimal parFechalim;

	@Column(name="PAR_TIPOPAR")
	private String parTipopar;

	public FparFechaproye() {
	}

	public BigDecimal getParCodigo() {
		return this.parCodigo;
	}

	public void setParCodigo(BigDecimal parCodigo) {
		this.parCodigo = parCodigo;
	}

	public String getParEstado() {
		return this.parEstado;
	}

	public void setParEstado(String parEstado) {
		this.parEstado = parEstado;
	}

	public BigDecimal getParFechalim() {
		return this.parFechalim;
	}

	public void setParFechalim(BigDecimal parFechalim) {
		this.parFechalim = parFechalim;
	}

	public String getParTipopar() {
		return this.parTipopar;
	}

	public void setParTipopar(String parTipopar) {
		this.parTipopar = parTipopar;
	}

}