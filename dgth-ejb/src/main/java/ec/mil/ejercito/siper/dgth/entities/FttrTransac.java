package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FTTR_TRANSAC database table.
 * 
 */
@Entity
@Table(name="FTTR_TRANSAC")
@NamedQuery(name="FttrTransac.findAll", query="SELECT f FROM FttrTransac f")
public class FttrTransac implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TTR_SECUEN")
	private long ttrSecuen;

	@Column(name="TTR_TRANSAC")
	private String ttrTransac;

	@Column(name="TTR_VALIDAR")
	private String ttrValidar;

	//bi-directional many-to-one association to FasiModelo
	@OneToMany(mappedBy="fttrTransac")
	private List<FasiModelo> fasiModelos;

	public FttrTransac() {
	}

	public long getTtrSecuen() {
		return this.ttrSecuen;
	}

	public void setTtrSecuen(long ttrSecuen) {
		this.ttrSecuen = ttrSecuen;
	}

	public String getTtrTransac() {
		return this.ttrTransac;
	}

	public void setTtrTransac(String ttrTransac) {
		this.ttrTransac = ttrTransac;
	}

	public String getTtrValidar() {
		return this.ttrValidar;
	}

	public void setTtrValidar(String ttrValidar) {
		this.ttrValidar = ttrValidar;
	}

	public List<FasiModelo> getFasiModelos() {
		return this.fasiModelos;
	}

	public void setFasiModelos(List<FasiModelo> fasiModelos) {
		this.fasiModelos = fasiModelos;
	}

	public FasiModelo addFasiModelo(FasiModelo fasiModelo) {
		getFasiModelos().add(fasiModelo);
		fasiModelo.setFttrTransac(this);

		return fasiModelo;
	}

	public FasiModelo removeFasiModelo(FasiModelo fasiModelo) {
		getFasiModelos().remove(fasiModelo);
		fasiModelo.setFttrTransac(null);

		return fasiModelo;
	}

}