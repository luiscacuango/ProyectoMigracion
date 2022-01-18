package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FCTC_CATALOGO database table.
 * 
 */
@Entity
@Table(name="FCTC_CATALOGO")
@NamedQuery(name="FctcCatalogo.findAll", query="SELECT f FROM FctcCatalogo f")
public class FctcCatalogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctcCatalogoPK id;

	@Column(name="CTC_DESCRI")
	private String ctcDescri;

	@Column(name="CTC_MODULO")
	private String ctcModulo;

	//bi-directional many-to-one association to FctcCatalogo
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="FCT_CTC_SECUEN", referencedColumnName="CTC_SECUEN"),
		@JoinColumn(name="FCTC_CTC_ANIO", referencedColumnName="CTC_ANIO")
		})
	private FctcCatalogo fctcCatalogo;

	//bi-directional many-to-one association to FctcCatalogo
	@OneToMany(mappedBy="fctcCatalogo")
	private List<FctcCatalogo> fctcCatalogos;

	//bi-directional many-to-one association to FdatDato
	@OneToMany(mappedBy="fctcCatalogo")
	private List<FdatDato> fdatDatos;

	//bi-directional many-to-one association to FpppParampar
	@OneToMany(mappedBy="fctcCatalogo")
	private List<FpppParampar> fpppParampars;

	public FctcCatalogo() {
	}

	public FctcCatalogoPK getId() {
		return this.id;
	}

	public void setId(FctcCatalogoPK id) {
		this.id = id;
	}

	public String getCtcDescri() {
		return this.ctcDescri;
	}

	public void setCtcDescri(String ctcDescri) {
		this.ctcDescri = ctcDescri;
	}

	public String getCtcModulo() {
		return this.ctcModulo;
	}

	public void setCtcModulo(String ctcModulo) {
		this.ctcModulo = ctcModulo;
	}

	public FctcCatalogo getFctcCatalogo() {
		return this.fctcCatalogo;
	}

	public void setFctcCatalogo(FctcCatalogo fctcCatalogo) {
		this.fctcCatalogo = fctcCatalogo;
	}

	public List<FctcCatalogo> getFctcCatalogos() {
		return this.fctcCatalogos;
	}

	public void setFctcCatalogos(List<FctcCatalogo> fctcCatalogos) {
		this.fctcCatalogos = fctcCatalogos;
	}

	public FctcCatalogo addFctcCatalogo(FctcCatalogo fctcCatalogo) {
		getFctcCatalogos().add(fctcCatalogo);
		fctcCatalogo.setFctcCatalogo(this);

		return fctcCatalogo;
	}

	public FctcCatalogo removeFctcCatalogo(FctcCatalogo fctcCatalogo) {
		getFctcCatalogos().remove(fctcCatalogo);
		fctcCatalogo.setFctcCatalogo(null);

		return fctcCatalogo;
	}

	public List<FdatDato> getFdatDatos() {
		return this.fdatDatos;
	}

	public void setFdatDatos(List<FdatDato> fdatDatos) {
		this.fdatDatos = fdatDatos;
	}

	public FdatDato addFdatDato(FdatDato fdatDato) {
		getFdatDatos().add(fdatDato);
		fdatDato.setFctcCatalogo(this);

		return fdatDato;
	}

	public FdatDato removeFdatDato(FdatDato fdatDato) {
		getFdatDatos().remove(fdatDato);
		fdatDato.setFctcCatalogo(null);

		return fdatDato;
	}

	public List<FpppParampar> getFpppParampars() {
		return this.fpppParampars;
	}

	public void setFpppParampars(List<FpppParampar> fpppParampars) {
		this.fpppParampars = fpppParampars;
	}

	public FpppParampar addFpppParampar(FpppParampar fpppParampar) {
		getFpppParampars().add(fpppParampar);
		fpppParampar.setFctcCatalogo(this);

		return fpppParampar;
	}

	public FpppParampar removeFpppParampar(FpppParampar fpppParampar) {
		getFpppParampars().remove(fpppParampar);
		fpppParampar.setFctcCatalogo(null);

		return fpppParampar;
	}

}