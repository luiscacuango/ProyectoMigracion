package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FDAT_DATOS database table.
 * 
 */
@Entity
@Table(name="FDAT_DATOS")
@NamedQuery(name="FdatDato.findAll", query="SELECT f FROM FdatDato f")
public class FdatDato implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FdatDatoPK id;

	@Column(name="DAT_ABREV")
	private String datAbrev;

	@Column(name="DAT_AUXILIAR")
	private String datAuxiliar;

	@Column(name="DAT_CODACT")
	private String datCodact;

	@Column(name="DAT_CREDITO")
	private String datCredito;

	@Column(name="DAT_DEBITO")
	private String datDebito;

	@Column(name="DAT_DESCRI")
	private String datDescri;

	@Column(name="DAT_FUNCION")
	private String datFuncion;

	@Column(name="DAT_NIVEL")
	private BigDecimal datNivel;

	@Column(name="DAT_PORCEN")
	private BigDecimal datPorcen;

	@Column(name="DAT_SIGNO")
	private String datSigno;

	@Column(name="DAT_TIPCUEBA")
	private String datTipcueba;

	@Column(name="DAT_TIPO")
	private String datTipo;

	@Column(name="DAT_TIPODH")
	private String datTipodh;

	//bi-directional many-to-one association to FcpcCatalogo
	@OneToMany(mappedBy="fdatDato")
	private List<FcpcCatalogo> fcpcCatalogos;

	//bi-directional many-to-one association to FctcCatalogo
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CTC_ANIO", referencedColumnName="CTC_ANIO"),
		@JoinColumn(name="CTC_SECUEN", referencedColumnName="CTC_SECUEN")
		})
	private FctcCatalogo fctcCatalogo;

	//bi-directional many-to-one association to FdatDato
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="FDA_CTC_ANIO", referencedColumnName="CTC_ANIO"),
		@JoinColumn(name="FDA_CTC_SECUEN", referencedColumnName="CTC_SECUEN"),
		@JoinColumn(name="FDA_DAT_CODIGO", referencedColumnName="DAT_CODIGO")
		})
	private FdatDato fdatDato;

	//bi-directional many-to-one association to FdatDato
	@OneToMany(mappedBy="fdatDato")
	private List<FdatDato> fdatDatos;

	//bi-directional many-to-one association to FparPresup
	@OneToMany(mappedBy="fdatDato")
	private List<FparPresup> fparPresups;

	//bi-directional many-to-one association to FuniDato
	@OneToMany(mappedBy="fdatDato")
	private List<FuniDato> funiDatos;

	public FdatDato() {
	}

	public FdatDatoPK getId() {
		return this.id;
	}

	public void setId(FdatDatoPK id) {
		this.id = id;
	}

	public String getDatAbrev() {
		return this.datAbrev;
	}

	public void setDatAbrev(String datAbrev) {
		this.datAbrev = datAbrev;
	}

	public String getDatAuxiliar() {
		return this.datAuxiliar;
	}

	public void setDatAuxiliar(String datAuxiliar) {
		this.datAuxiliar = datAuxiliar;
	}

	public String getDatCodact() {
		return this.datCodact;
	}

	public void setDatCodact(String datCodact) {
		this.datCodact = datCodact;
	}

	public String getDatCredito() {
		return this.datCredito;
	}

	public void setDatCredito(String datCredito) {
		this.datCredito = datCredito;
	}

	public String getDatDebito() {
		return this.datDebito;
	}

	public void setDatDebito(String datDebito) {
		this.datDebito = datDebito;
	}

	public String getDatDescri() {
		return this.datDescri;
	}

	public void setDatDescri(String datDescri) {
		this.datDescri = datDescri;
	}

	public String getDatFuncion() {
		return this.datFuncion;
	}

	public void setDatFuncion(String datFuncion) {
		this.datFuncion = datFuncion;
	}

	public BigDecimal getDatNivel() {
		return this.datNivel;
	}

	public void setDatNivel(BigDecimal datNivel) {
		this.datNivel = datNivel;
	}

	public BigDecimal getDatPorcen() {
		return this.datPorcen;
	}

	public void setDatPorcen(BigDecimal datPorcen) {
		this.datPorcen = datPorcen;
	}

	public String getDatSigno() {
		return this.datSigno;
	}

	public void setDatSigno(String datSigno) {
		this.datSigno = datSigno;
	}

	public String getDatTipcueba() {
		return this.datTipcueba;
	}

	public void setDatTipcueba(String datTipcueba) {
		this.datTipcueba = datTipcueba;
	}

	public String getDatTipo() {
		return this.datTipo;
	}

	public void setDatTipo(String datTipo) {
		this.datTipo = datTipo;
	}

	public String getDatTipodh() {
		return this.datTipodh;
	}

	public void setDatTipodh(String datTipodh) {
		this.datTipodh = datTipodh;
	}

	public List<FcpcCatalogo> getFcpcCatalogos() {
		return this.fcpcCatalogos;
	}

	public void setFcpcCatalogos(List<FcpcCatalogo> fcpcCatalogos) {
		this.fcpcCatalogos = fcpcCatalogos;
	}

	public FcpcCatalogo addFcpcCatalogo(FcpcCatalogo fcpcCatalogo) {
		getFcpcCatalogos().add(fcpcCatalogo);
		fcpcCatalogo.setFdatDato(this);

		return fcpcCatalogo;
	}

	public FcpcCatalogo removeFcpcCatalogo(FcpcCatalogo fcpcCatalogo) {
		getFcpcCatalogos().remove(fcpcCatalogo);
		fcpcCatalogo.setFdatDato(null);

		return fcpcCatalogo;
	}

	public FctcCatalogo getFctcCatalogo() {
		return this.fctcCatalogo;
	}

	public void setFctcCatalogo(FctcCatalogo fctcCatalogo) {
		this.fctcCatalogo = fctcCatalogo;
	}

	public FdatDato getFdatDato() {
		return this.fdatDato;
	}

	public void setFdatDato(FdatDato fdatDato) {
		this.fdatDato = fdatDato;
	}

	public List<FdatDato> getFdatDatos() {
		return this.fdatDatos;
	}

	public void setFdatDatos(List<FdatDato> fdatDatos) {
		this.fdatDatos = fdatDatos;
	}

	public FdatDato addFdatDato(FdatDato fdatDato) {
		getFdatDatos().add(fdatDato);
		fdatDato.setFdatDato(this);

		return fdatDato;
	}

	public FdatDato removeFdatDato(FdatDato fdatDato) {
		getFdatDatos().remove(fdatDato);
		fdatDato.setFdatDato(null);

		return fdatDato;
	}

	public List<FparPresup> getFparPresups() {
		return this.fparPresups;
	}

	public void setFparPresups(List<FparPresup> fparPresups) {
		this.fparPresups = fparPresups;
	}

	public FparPresup addFparPresup(FparPresup fparPresup) {
		getFparPresups().add(fparPresup);
		fparPresup.setFdatDato(this);

		return fparPresup;
	}

	public FparPresup removeFparPresup(FparPresup fparPresup) {
		getFparPresups().remove(fparPresup);
		fparPresup.setFdatDato(null);

		return fparPresup;
	}

	public List<FuniDato> getFuniDatos() {
		return this.funiDatos;
	}

	public void setFuniDatos(List<FuniDato> funiDatos) {
		this.funiDatos = funiDatos;
	}

	public FuniDato addFuniDato(FuniDato funiDato) {
		getFuniDatos().add(funiDato);
		funiDato.setFdatDato(this);

		return funiDato;
	}

	public FuniDato removeFuniDato(FuniDato funiDato) {
		getFuniDatos().remove(funiDato);
		funiDato.setFdatDato(null);

		return funiDato;
	}

}