package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FREP_REPROGRAMACION database table.
 * 
 */
@Entity
@Table(name="FREP_REPROGRAMACION")
@NamedQuery(name="FrepReprogramacion.findAll", query="SELECT f FROM FrepReprogramacion f")
public class FrepReprogramacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="REP_ASIGNADO")
	private BigDecimal repAsignado;

	@Column(name="REP_CLASIF")
	private String repClasif;

	@Column(name="REP_CODIGO")
	private String repCodigo;

	@Column(name="REP_GASTADO")
	private BigDecimal repGastado;

	@Column(name="REP_MES")
	private String repMes;

	@Column(name="REP_REFORMADO")
	private BigDecimal repReformado;

	@Column(name="REP_SALDO")
	private BigDecimal repSaldo;

	@Column(name="REP_SECUENCIA")
	private String repSecuencia;

	@Column(name="REP_TIPO")
	private String repTipo;

	@Column(name="REP_USUARIO")
	private String repUsuario;

	public FrepReprogramacion() {
	}

	public BigDecimal getRepAsignado() {
		return this.repAsignado;
	}

	public void setRepAsignado(BigDecimal repAsignado) {
		this.repAsignado = repAsignado;
	}

	public String getRepClasif() {
		return this.repClasif;
	}

	public void setRepClasif(String repClasif) {
		this.repClasif = repClasif;
	}

	public String getRepCodigo() {
		return this.repCodigo;
	}

	public void setRepCodigo(String repCodigo) {
		this.repCodigo = repCodigo;
	}

	public BigDecimal getRepGastado() {
		return this.repGastado;
	}

	public void setRepGastado(BigDecimal repGastado) {
		this.repGastado = repGastado;
	}

	public String getRepMes() {
		return this.repMes;
	}

	public void setRepMes(String repMes) {
		this.repMes = repMes;
	}

	public BigDecimal getRepReformado() {
		return this.repReformado;
	}

	public void setRepReformado(BigDecimal repReformado) {
		this.repReformado = repReformado;
	}

	public BigDecimal getRepSaldo() {
		return this.repSaldo;
	}

	public void setRepSaldo(BigDecimal repSaldo) {
		this.repSaldo = repSaldo;
	}

	public String getRepSecuencia() {
		return this.repSecuencia;
	}

	public void setRepSecuencia(String repSecuencia) {
		this.repSecuencia = repSecuencia;
	}

	public String getRepTipo() {
		return this.repTipo;
	}

	public void setRepTipo(String repTipo) {
		this.repTipo = repTipo;
	}

	public String getRepUsuario() {
		return this.repUsuario;
	}

	public void setRepUsuario(String repUsuario) {
		this.repUsuario = repUsuario;
	}

}