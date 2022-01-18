package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MV_FDCI_DETCIU database table.
 * 
 */
@Entity
@Table(name="MV_FDCI_DETCIU")
@NamedQuery(name="MvFdciDetciu.findAll", query="SELECT m FROM MvFdciDetciu m")
public class MvFdciDetciu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DCI_CCI")
	private BigDecimal dciCci;

	@Column(name="DCI_CODIGO")
	private BigDecimal dciCodigo;

	@Column(name="DCI_RUC")
	private String dciRuc;

	private String descr;

	@Column(name="ETD_CODIGO")
	private BigDecimal etdCodigo;

	@Column(name="MEM_CUENTA")
	private String memCuenta;

	@Column(name="MEM_TIPCUEN")
	private String memTipcuen;

	public MvFdciDetciu() {
	}

	public BigDecimal getDciCci() {
		return this.dciCci;
	}

	public void setDciCci(BigDecimal dciCci) {
		this.dciCci = dciCci;
	}

	public BigDecimal getDciCodigo() {
		return this.dciCodigo;
	}

	public void setDciCodigo(BigDecimal dciCodigo) {
		this.dciCodigo = dciCodigo;
	}

	public String getDciRuc() {
		return this.dciRuc;
	}

	public void setDciRuc(String dciRuc) {
		this.dciRuc = dciRuc;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public BigDecimal getEtdCodigo() {
		return this.etdCodigo;
	}

	public void setEtdCodigo(BigDecimal etdCodigo) {
		this.etdCodigo = etdCodigo;
	}

	public String getMemCuenta() {
		return this.memCuenta;
	}

	public void setMemCuenta(String memCuenta) {
		this.memCuenta = memCuenta;
	}

	public String getMemTipcuen() {
		return this.memTipcuen;
	}

	public void setMemTipcuen(String memTipcuen) {
		this.memTipcuen = memTipcuen;
	}

}