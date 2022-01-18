package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FASI_MODELOS database table.
 * 
 */
@Entity
@Table(name="FASI_MODELOS")
@NamedQuery(name="FasiModelo.findAll", query="SELECT f FROM FasiModelo f")
public class FasiModelo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ASI_SECUEN")
	private long asiSecuen;

	@Column(name="ASI_ASIENTOS")
	private String asiAsientos;

	@Column(name="ASI_DESCRI")
	private String asiDescri;

	@Column(name="ASI_ESTADO")
	private String asiEstado;

	@Column(name="ASI_NOMBRE")
	private String asiNombre;

	@Column(name="ASI_REQUIS")
	private String asiRequis;

	//bi-directional many-to-one association to FsubSistema
	@ManyToOne
	@JoinColumn(name="FSU_SUB_CODIGO")
	private FsubSistema fsubSistema;

	//bi-directional many-to-one association to FtmoTipmovimiento
	@ManyToOne
	@JoinColumn(name="TMO_CODIGO")
	private FtmoTipmovimiento ftmoTipmovimiento;

	//bi-directional many-to-one association to FttrTransac
	@ManyToOne
	@JoinColumn(name="FTT_TTR_SECUEN")
	private FttrTransac fttrTransac;

	//bi-directional many-to-one association to FdamAsimodelo
	@OneToMany(mappedBy="fasiModelo")
	private List<FdamAsimodelo> fdamAsimodelos;

	//bi-directional many-to-one association to FequEquiva
	@OneToMany(mappedBy="fasiModelo")
	private List<FequEquiva> fequEquivas;

	public FasiModelo() {
	}

	public long getAsiSecuen() {
		return this.asiSecuen;
	}

	public void setAsiSecuen(long asiSecuen) {
		this.asiSecuen = asiSecuen;
	}

	public String getAsiAsientos() {
		return this.asiAsientos;
	}

	public void setAsiAsientos(String asiAsientos) {
		this.asiAsientos = asiAsientos;
	}

	public String getAsiDescri() {
		return this.asiDescri;
	}

	public void setAsiDescri(String asiDescri) {
		this.asiDescri = asiDescri;
	}

	public String getAsiEstado() {
		return this.asiEstado;
	}

	public void setAsiEstado(String asiEstado) {
		this.asiEstado = asiEstado;
	}

	public String getAsiNombre() {
		return this.asiNombre;
	}

	public void setAsiNombre(String asiNombre) {
		this.asiNombre = asiNombre;
	}

	public String getAsiRequis() {
		return this.asiRequis;
	}

	public void setAsiRequis(String asiRequis) {
		this.asiRequis = asiRequis;
	}

	public FsubSistema getFsubSistema() {
		return this.fsubSistema;
	}

	public void setFsubSistema(FsubSistema fsubSistema) {
		this.fsubSistema = fsubSistema;
	}

	public FtmoTipmovimiento getFtmoTipmovimiento() {
		return this.ftmoTipmovimiento;
	}

	public void setFtmoTipmovimiento(FtmoTipmovimiento ftmoTipmovimiento) {
		this.ftmoTipmovimiento = ftmoTipmovimiento;
	}

	public FttrTransac getFttrTransac() {
		return this.fttrTransac;
	}

	public void setFttrTransac(FttrTransac fttrTransac) {
		this.fttrTransac = fttrTransac;
	}

	public List<FdamAsimodelo> getFdamAsimodelos() {
		return this.fdamAsimodelos;
	}

	public void setFdamAsimodelos(List<FdamAsimodelo> fdamAsimodelos) {
		this.fdamAsimodelos = fdamAsimodelos;
	}

	public FdamAsimodelo addFdamAsimodelo(FdamAsimodelo fdamAsimodelo) {
		getFdamAsimodelos().add(fdamAsimodelo);
		fdamAsimodelo.setFasiModelo(this);

		return fdamAsimodelo;
	}

	public FdamAsimodelo removeFdamAsimodelo(FdamAsimodelo fdamAsimodelo) {
		getFdamAsimodelos().remove(fdamAsimodelo);
		fdamAsimodelo.setFasiModelo(null);

		return fdamAsimodelo;
	}

	public List<FequEquiva> getFequEquivas() {
		return this.fequEquivas;
	}

	public void setFequEquivas(List<FequEquiva> fequEquivas) {
		this.fequEquivas = fequEquivas;
	}

	public FequEquiva addFequEquiva(FequEquiva fequEquiva) {
		getFequEquivas().add(fequEquiva);
		fequEquiva.setFasiModelo(this);

		return fequEquiva;
	}

	public FequEquiva removeFequEquiva(FequEquiva fequEquiva) {
		getFequEquivas().remove(fequEquiva);
		fequEquiva.setFasiModelo(null);

		return fequEquiva;
	}

}