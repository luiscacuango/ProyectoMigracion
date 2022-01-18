package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FFRE_REFORMA database table.
 * 
 */
@Entity
@Table(name="FFRE_REFORMA")
@NamedQuery(name="FfreReforma.findAll", query="SELECT f FROM FfreReforma f")
public class FfreReforma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="FRE_ANIO")
	private BigDecimal freAnio;

	@Column(name="FRE_ASIG")
	private BigDecimal freAsig;

	@Column(name="FRE_CLASIF")
	private String freClasif;

	@Column(name="FRE_CODIGO")
	private String freCodigo;

	@Column(name="FRE_GASTO")
	private BigDecimal freGasto;

	@Column(name="FRE_MONTO")
	private BigDecimal freMonto;

	@Column(name="FRE_REFORMA")
	private BigDecimal freReforma;

	@Column(name="FRE_SALDO")
	private BigDecimal freSaldo;

	@Column(name="FRE_SECUENCIA")
	private String freSecuencia;

	@Column(name="FRE_TIPO")
	private String freTipo;

	@Column(name="FRE_USUARIO")
	private String freUsuario;

	public FfreReforma() {
	}

	public BigDecimal getFreAnio() {
		return this.freAnio;
	}

	public void setFreAnio(BigDecimal freAnio) {
		this.freAnio = freAnio;
	}

	public BigDecimal getFreAsig() {
		return this.freAsig;
	}

	public void setFreAsig(BigDecimal freAsig) {
		this.freAsig = freAsig;
	}

	public String getFreClasif() {
		return this.freClasif;
	}

	public void setFreClasif(String freClasif) {
		this.freClasif = freClasif;
	}

	public String getFreCodigo() {
		return this.freCodigo;
	}

	public void setFreCodigo(String freCodigo) {
		this.freCodigo = freCodigo;
	}

	public BigDecimal getFreGasto() {
		return this.freGasto;
	}

	public void setFreGasto(BigDecimal freGasto) {
		this.freGasto = freGasto;
	}

	public BigDecimal getFreMonto() {
		return this.freMonto;
	}

	public void setFreMonto(BigDecimal freMonto) {
		this.freMonto = freMonto;
	}

	public BigDecimal getFreReforma() {
		return this.freReforma;
	}

	public void setFreReforma(BigDecimal freReforma) {
		this.freReforma = freReforma;
	}

	public BigDecimal getFreSaldo() {
		return this.freSaldo;
	}

	public void setFreSaldo(BigDecimal freSaldo) {
		this.freSaldo = freSaldo;
	}

	public String getFreSecuencia() {
		return this.freSecuencia;
	}

	public void setFreSecuencia(String freSecuencia) {
		this.freSecuencia = freSecuencia;
	}

	public String getFreTipo() {
		return this.freTipo;
	}

	public void setFreTipo(String freTipo) {
		this.freTipo = freTipo;
	}

	public String getFreUsuario() {
		return this.freUsuario;
	}

	public void setFreUsuario(String freUsuario) {
		this.freUsuario = freUsuario;
	}

}