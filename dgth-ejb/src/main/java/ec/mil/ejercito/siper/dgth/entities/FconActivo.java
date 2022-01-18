package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FCON_ACTIVO database table.
 * 
 */
@Entity
@Table(name="FCON_ACTIVO")
@NamedQuery(name="FconActivo.findAll", query="SELECT f FROM FconActivo f")
public class FconActivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FCON_SECUEN")
	private long fconSecuen;

	@Column(name="FCON_BOSCUL")
	private String fconBoscul;

	@Column(name="FCON_CONSTR")
	private String fconConstr;

	@Column(name="FCON_DESCRI")
	private String fconDescri;

	@Column(name="FCON_MOBILI")
	private String fconMobili;

	@Column(name="FCON_SEMOVI")
	private String fconSemovi;

	@Column(name="FCON_TERREN")
	private String fconTerren;

	@Column(name="FCON_VEHICU")
	private String fconVehicu;

	//bi-directional many-to-one association to FmovArticulo
	@OneToMany(mappedBy="fconActivo")
	private List<FmovArticulo> fmovArticulos;

	public FconActivo() {
	}

	public long getFconSecuen() {
		return this.fconSecuen;
	}

	public void setFconSecuen(long fconSecuen) {
		this.fconSecuen = fconSecuen;
	}

	public String getFconBoscul() {
		return this.fconBoscul;
	}

	public void setFconBoscul(String fconBoscul) {
		this.fconBoscul = fconBoscul;
	}

	public String getFconConstr() {
		return this.fconConstr;
	}

	public void setFconConstr(String fconConstr) {
		this.fconConstr = fconConstr;
	}

	public String getFconDescri() {
		return this.fconDescri;
	}

	public void setFconDescri(String fconDescri) {
		this.fconDescri = fconDescri;
	}

	public String getFconMobili() {
		return this.fconMobili;
	}

	public void setFconMobili(String fconMobili) {
		this.fconMobili = fconMobili;
	}

	public String getFconSemovi() {
		return this.fconSemovi;
	}

	public void setFconSemovi(String fconSemovi) {
		this.fconSemovi = fconSemovi;
	}

	public String getFconTerren() {
		return this.fconTerren;
	}

	public void setFconTerren(String fconTerren) {
		this.fconTerren = fconTerren;
	}

	public String getFconVehicu() {
		return this.fconVehicu;
	}

	public void setFconVehicu(String fconVehicu) {
		this.fconVehicu = fconVehicu;
	}

	public List<FmovArticulo> getFmovArticulos() {
		return this.fmovArticulos;
	}

	public void setFmovArticulos(List<FmovArticulo> fmovArticulos) {
		this.fmovArticulos = fmovArticulos;
	}

	public FmovArticulo addFmovArticulo(FmovArticulo fmovArticulo) {
		getFmovArticulos().add(fmovArticulo);
		fmovArticulo.setFconActivo(this);

		return fmovArticulo;
	}

	public FmovArticulo removeFmovArticulo(FmovArticulo fmovArticulo) {
		getFmovArticulos().remove(fmovArticulo);
		fmovArticulo.setFconActivo(null);

		return fmovArticulo;
	}

}