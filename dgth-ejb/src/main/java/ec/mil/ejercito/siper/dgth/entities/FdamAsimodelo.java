package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FDAM_ASIMODELO database table.
 * 
 */
@Entity
@Table(name="FDAM_ASIMODELO")
@NamedQuery(name="FdamAsimodelo.findAll", query="SELECT f FROM FdamAsimodelo f")
public class FdamAsimodelo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DAM_SECUEN")
	private long damSecuen;

	private String cuenta;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	@Column(name="FDA_CTC_SECUEN")
	private String fdaCtcSecuen;

	//bi-directional many-to-one association to FasiModelo
	@ManyToOne
	@JoinColumn(name="FAS_ASI_SECUEN")
	private FasiModelo fasiModelo;

	public FdamAsimodelo() {
	}

	public long getDamSecuen() {
		return this.damSecuen;
	}

	public void setDamSecuen(long damSecuen) {
		this.damSecuen = damSecuen;
	}

	public String getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getDatCodigo() {
		return this.datCodigo;
	}

	public void setDatCodigo(String datCodigo) {
		this.datCodigo = datCodigo;
	}

	public String getFdaCtcSecuen() {
		return this.fdaCtcSecuen;
	}

	public void setFdaCtcSecuen(String fdaCtcSecuen) {
		this.fdaCtcSecuen = fdaCtcSecuen;
	}

	public FasiModelo getFasiModelo() {
		return this.fasiModelo;
	}

	public void setFasiModelo(FasiModelo fasiModelo) {
		this.fasiModelo = fasiModelo;
	}

}