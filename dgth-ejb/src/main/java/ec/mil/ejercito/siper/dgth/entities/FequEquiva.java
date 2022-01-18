package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FEQU_EQUIVA database table.
 * 
 */
@Entity
@Table(name="FEQU_EQUIVA")
@NamedQuery(name="FequEquiva.findAll", query="SELECT f FROM FequEquiva f")
public class FequEquiva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EQU_SECUEN")
	private long equSecuen;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	@Column(name="DAT_TIPO")
	private String datTipo;

	@Column(name="FDA_CTC_SECUEN")
	private String fdaCtcSecuen;

	@Column(name="TAR_CODIGO_TAR")
	private double tarCodigoTar;

	//bi-directional many-to-one association to FasiModelo
	@ManyToOne
	@JoinColumn(name="ASI_SECUEN")
	private FasiModelo fasiModelo;

	public FequEquiva() {
	}

	public long getEquSecuen() {
		return this.equSecuen;
	}

	public void setEquSecuen(long equSecuen) {
		this.equSecuen = equSecuen;
	}

	public String getDatCodigo() {
		return this.datCodigo;
	}

	public void setDatCodigo(String datCodigo) {
		this.datCodigo = datCodigo;
	}

	public String getDatTipo() {
		return this.datTipo;
	}

	public void setDatTipo(String datTipo) {
		this.datTipo = datTipo;
	}

	public String getFdaCtcSecuen() {
		return this.fdaCtcSecuen;
	}

	public void setFdaCtcSecuen(String fdaCtcSecuen) {
		this.fdaCtcSecuen = fdaCtcSecuen;
	}

	public double getTarCodigoTar() {
		return this.tarCodigoTar;
	}

	public void setTarCodigoTar(double tarCodigoTar) {
		this.tarCodigoTar = tarCodigoTar;
	}

	public FasiModelo getFasiModelo() {
		return this.fasiModelo;
	}

	public void setFasiModelo(FasiModelo fasiModelo) {
		this.fasiModelo = fasiModelo;
	}

}