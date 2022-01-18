package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPRG_PRGCUATRIMESTRE database table.
 * 
 */
@Entity
@Table(name="FPRG_PRGCUATRIMESTRE")
@NamedQuery(name="FprgPrgcuatrimestre.findAll", query="SELECT f FROM FprgPrgcuatrimestre f")
public class FprgPrgcuatrimestre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PRG_CODIGO")
	private String prgCodigo;

	@Column(name="PRG_DISPONIBLE")
	private BigDecimal prgDisponible;

	@Column(name="PRG_INICIAL")
	private BigDecimal prgInicial;

	@Column(name="PRG_MES")
	private BigDecimal prgMes;

	@Column(name="PRG_REFORMADO")
	private BigDecimal prgReformado;

	@Column(name="PRG_SECUENCIA")
	private BigDecimal prgSecuencia;

	@Column(name="PRG_USUARIO")
	private BigDecimal prgUsuario;

	public FprgPrgcuatrimestre() {
	}

	public String getPrgCodigo() {
		return this.prgCodigo;
	}

	public void setPrgCodigo(String prgCodigo) {
		this.prgCodigo = prgCodigo;
	}

	public BigDecimal getPrgDisponible() {
		return this.prgDisponible;
	}

	public void setPrgDisponible(BigDecimal prgDisponible) {
		this.prgDisponible = prgDisponible;
	}

	public BigDecimal getPrgInicial() {
		return this.prgInicial;
	}

	public void setPrgInicial(BigDecimal prgInicial) {
		this.prgInicial = prgInicial;
	}

	public BigDecimal getPrgMes() {
		return this.prgMes;
	}

	public void setPrgMes(BigDecimal prgMes) {
		this.prgMes = prgMes;
	}

	public BigDecimal getPrgReformado() {
		return this.prgReformado;
	}

	public void setPrgReformado(BigDecimal prgReformado) {
		this.prgReformado = prgReformado;
	}

	public BigDecimal getPrgSecuencia() {
		return this.prgSecuencia;
	}

	public void setPrgSecuencia(BigDecimal prgSecuencia) {
		this.prgSecuencia = prgSecuencia;
	}

	public BigDecimal getPrgUsuario() {
		return this.prgUsuario;
	}

	public void setPrgUsuario(BigDecimal prgUsuario) {
		this.prgUsuario = prgUsuario;
	}

}