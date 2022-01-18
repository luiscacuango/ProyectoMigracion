package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FSAL_SALDOS database table.
 * 
 */
@Entity
@Table(name="FSAL_SALDOS")
@NamedQuery(name="FsalSaldo.findAll", query="SELECT f FROM FsalSaldo f")
public class FsalSaldo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SAL_SECUENCIA")
	private long salSecuencia;

	@Column(name="SAL_CEDULA")
	private String salCedula;

	@Temporal(TemporalType.DATE)
	@Column(name="SAL_FECHA")
	private Date salFecha;

	@Column(name="SAL_SALDO")
	private BigDecimal salSaldo;

	//bi-directional many-to-one association to FconConcepto
	@ManyToOne
	@JoinColumn(name="CON_SECUENCIA")
	private FconConcepto fconConcepto;

	public FsalSaldo() {
	}

	public long getSalSecuencia() {
		return this.salSecuencia;
	}

	public void setSalSecuencia(long salSecuencia) {
		this.salSecuencia = salSecuencia;
	}

	public String getSalCedula() {
		return this.salCedula;
	}

	public void setSalCedula(String salCedula) {
		this.salCedula = salCedula;
	}

	public Date getSalFecha() {
		return this.salFecha;
	}

	public void setSalFecha(Date salFecha) {
		this.salFecha = salFecha;
	}

	public BigDecimal getSalSaldo() {
		return this.salSaldo;
	}

	public void setSalSaldo(BigDecimal salSaldo) {
		this.salSaldo = salSaldo;
	}

	public FconConcepto getFconConcepto() {
		return this.fconConcepto;
	}

	public void setFconConcepto(FconConcepto fconConcepto) {
		this.fconConcepto = fconConcepto;
	}

}