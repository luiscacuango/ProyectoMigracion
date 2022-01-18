package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FPAR_PRESUP database table.
 * 
 */
@Entity
@Table(name="FPAR_PRESUP")
@NamedQuery(name="FparPresup.findAll", query="SELECT f FROM FparPresup f")
public class FparPresup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FparPresupPK id;

	@Column(name="PAR_CLASIF")
	private String parClasif;

	@Column(name="PAR_ESTADO")
	private String parEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="PAR_FECHA")
	private Date parFecha;

	@Column(name="PAR_LINEAL")
	private String parLineal;

	@Column(name="PAR_TIPO")
	private String parTipo;

	//bi-directional many-to-one association to FmvdDetmov
	@OneToMany(mappedBy="fparPresup")
	private List<FmvdDetmov> fmvdDetmovs;

	//bi-directional many-to-one association to FmvtMovpresu
	@OneToMany(mappedBy="fparPresup")
	private List<FmvtMovpresu> fmvtMovpresus;

	//bi-directional many-to-one association to FdatDato
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CTC_ANIO", referencedColumnName="CTC_ANIO"),
		@JoinColumn(name="CTC_SECUEN", referencedColumnName="CTC_SECUEN"),
		@JoinColumn(name="DAT_CODIGO", referencedColumnName="DAT_CODIGO")
		})
	private FdatDato fdatDato;

	//bi-directional many-to-one association to FprgEjecucion
	@OneToMany(mappedBy="fparPresup")
	private List<FprgEjecucion> fprgEjecucions;

	public FparPresup() {
	}

	public FparPresupPK getId() {
		return this.id;
	}

	public void setId(FparPresupPK id) {
		this.id = id;
	}

	public String getParClasif() {
		return this.parClasif;
	}

	public void setParClasif(String parClasif) {
		this.parClasif = parClasif;
	}

	public String getParEstado() {
		return this.parEstado;
	}

	public void setParEstado(String parEstado) {
		this.parEstado = parEstado;
	}

	public Date getParFecha() {
		return this.parFecha;
	}

	public void setParFecha(Date parFecha) {
		this.parFecha = parFecha;
	}

	public String getParLineal() {
		return this.parLineal;
	}

	public void setParLineal(String parLineal) {
		this.parLineal = parLineal;
	}

	public String getParTipo() {
		return this.parTipo;
	}

	public void setParTipo(String parTipo) {
		this.parTipo = parTipo;
	}

	public List<FmvdDetmov> getFmvdDetmovs() {
		return this.fmvdDetmovs;
	}

	public void setFmvdDetmovs(List<FmvdDetmov> fmvdDetmovs) {
		this.fmvdDetmovs = fmvdDetmovs;
	}

	public FmvdDetmov addFmvdDetmov(FmvdDetmov fmvdDetmov) {
		getFmvdDetmovs().add(fmvdDetmov);
		fmvdDetmov.setFparPresup(this);

		return fmvdDetmov;
	}

	public FmvdDetmov removeFmvdDetmov(FmvdDetmov fmvdDetmov) {
		getFmvdDetmovs().remove(fmvdDetmov);
		fmvdDetmov.setFparPresup(null);

		return fmvdDetmov;
	}

	public List<FmvtMovpresu> getFmvtMovpresus() {
		return this.fmvtMovpresus;
	}

	public void setFmvtMovpresus(List<FmvtMovpresu> fmvtMovpresus) {
		this.fmvtMovpresus = fmvtMovpresus;
	}

	public FmvtMovpresu addFmvtMovpresus(FmvtMovpresu fmvtMovpresus) {
		getFmvtMovpresus().add(fmvtMovpresus);
		fmvtMovpresus.setFparPresup(this);

		return fmvtMovpresus;
	}

	public FmvtMovpresu removeFmvtMovpresus(FmvtMovpresu fmvtMovpresus) {
		getFmvtMovpresus().remove(fmvtMovpresus);
		fmvtMovpresus.setFparPresup(null);

		return fmvtMovpresus;
	}

	public FdatDato getFdatDato() {
		return this.fdatDato;
	}

	public void setFdatDato(FdatDato fdatDato) {
		this.fdatDato = fdatDato;
	}

	public List<FprgEjecucion> getFprgEjecucions() {
		return this.fprgEjecucions;
	}

	public void setFprgEjecucions(List<FprgEjecucion> fprgEjecucions) {
		this.fprgEjecucions = fprgEjecucions;
	}

	public FprgEjecucion addFprgEjecucion(FprgEjecucion fprgEjecucion) {
		getFprgEjecucions().add(fprgEjecucion);
		fprgEjecucion.setFparPresup(this);

		return fprgEjecucion;
	}

	public FprgEjecucion removeFprgEjecucion(FprgEjecucion fprgEjecucion) {
		getFprgEjecucions().remove(fprgEjecucion);
		fprgEjecucion.setFparPresup(null);

		return fprgEjecucion;
	}

}