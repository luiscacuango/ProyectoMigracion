package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FTIN_TIPOING database table.
 * 
 */
@Entity
@Table(name="FTIN_TIPOING")
@NamedQuery(name="FtinTipoing.findAll", query="SELECT f FROM FtinTipoing f")
public class FtinTipoing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TIN_SECUEN")
	private long tinSecuen;

	@Column(name="TIN_BENEFICIARIO")
	private String tinBeneficiario;

	@Column(name="TIN_BOSCUL")
	private String tinBoscul;

	@Column(name="TIN_COMODATO")
	private String tinComodato;

	@Column(name="TIN_CONFCOMANDANTE")
	private String tinConfcomandante;

	@Column(name="TIN_CONSTR")
	private String tinConstr;

	@Column(name="TIN_CONTABILIZA")
	private String tinContabiliza;

	@Column(name="TIN_DESCRI")
	private String tinDescri;

	@Column(name="TIN_DONADO")
	private String tinDonado;

	@Column(name="TIN_FACTURA")
	private String tinFactura;

	@Column(name="TIN_INCREMENTO")
	private String tinIncremento;

	@Column(name="TIN_INFSUM")
	private String tinInfsum;

	@Column(name="TIN_INGERR")
	private String tinIngerr;

	@Column(name="TIN_INSTIT")
	private String tinInstit;

	@Column(name="TIN_IOE")
	private String tinIoe;

	@Column(name="TIN_MINAMBIENTE")
	private String tinMinambiente;

	@Column(name="TIN_MOBILI")
	private String tinMobili;

	@Column(name="TIN_OFIDFFT")
	private String tinOfidfft;

	@Column(name="TIN_OFIMDN")
	private String tinOfimdn;

	@Column(name="TIN_PERMUTANTES")
	private String tinPermutantes;

	@Column(name="TIN_PERTRANSFIRIO")
	private String tinPertransfirio;

	@Column(name="TIN_RESJUZGADO")
	private String tinResjuzgado;

	@Column(name="TIN_SEMOVI")
	private String tinSemovi;

	@Column(name="TIN_TERREN")
	private String tinTerren;

	@Column(name="TIN_TRANSF")
	private String tinTransf;

	@Column(name="TIN_TRASPER")
	private String tinTrasper;

	@Column(name="TIN_VEHICU")
	private String tinVehicu;

	//bi-directional many-to-one association to FmovArticulo
	@OneToMany(mappedBy="ftinTipoing")
	private List<FmovArticulo> fmovArticulos;

	public FtinTipoing() {
	}

	public long getTinSecuen() {
		return this.tinSecuen;
	}

	public void setTinSecuen(long tinSecuen) {
		this.tinSecuen = tinSecuen;
	}

	public String getTinBeneficiario() {
		return this.tinBeneficiario;
	}

	public void setTinBeneficiario(String tinBeneficiario) {
		this.tinBeneficiario = tinBeneficiario;
	}

	public String getTinBoscul() {
		return this.tinBoscul;
	}

	public void setTinBoscul(String tinBoscul) {
		this.tinBoscul = tinBoscul;
	}

	public String getTinComodato() {
		return this.tinComodato;
	}

	public void setTinComodato(String tinComodato) {
		this.tinComodato = tinComodato;
	}

	public String getTinConfcomandante() {
		return this.tinConfcomandante;
	}

	public void setTinConfcomandante(String tinConfcomandante) {
		this.tinConfcomandante = tinConfcomandante;
	}

	public String getTinConstr() {
		return this.tinConstr;
	}

	public void setTinConstr(String tinConstr) {
		this.tinConstr = tinConstr;
	}

	public String getTinContabiliza() {
		return this.tinContabiliza;
	}

	public void setTinContabiliza(String tinContabiliza) {
		this.tinContabiliza = tinContabiliza;
	}

	public String getTinDescri() {
		return this.tinDescri;
	}

	public void setTinDescri(String tinDescri) {
		this.tinDescri = tinDescri;
	}

	public String getTinDonado() {
		return this.tinDonado;
	}

	public void setTinDonado(String tinDonado) {
		this.tinDonado = tinDonado;
	}

	public String getTinFactura() {
		return this.tinFactura;
	}

	public void setTinFactura(String tinFactura) {
		this.tinFactura = tinFactura;
	}

	public String getTinIncremento() {
		return this.tinIncremento;
	}

	public void setTinIncremento(String tinIncremento) {
		this.tinIncremento = tinIncremento;
	}

	public String getTinInfsum() {
		return this.tinInfsum;
	}

	public void setTinInfsum(String tinInfsum) {
		this.tinInfsum = tinInfsum;
	}

	public String getTinIngerr() {
		return this.tinIngerr;
	}

	public void setTinIngerr(String tinIngerr) {
		this.tinIngerr = tinIngerr;
	}

	public String getTinInstit() {
		return this.tinInstit;
	}

	public void setTinInstit(String tinInstit) {
		this.tinInstit = tinInstit;
	}

	public String getTinIoe() {
		return this.tinIoe;
	}

	public void setTinIoe(String tinIoe) {
		this.tinIoe = tinIoe;
	}

	public String getTinMinambiente() {
		return this.tinMinambiente;
	}

	public void setTinMinambiente(String tinMinambiente) {
		this.tinMinambiente = tinMinambiente;
	}

	public String getTinMobili() {
		return this.tinMobili;
	}

	public void setTinMobili(String tinMobili) {
		this.tinMobili = tinMobili;
	}

	public String getTinOfidfft() {
		return this.tinOfidfft;
	}

	public void setTinOfidfft(String tinOfidfft) {
		this.tinOfidfft = tinOfidfft;
	}

	public String getTinOfimdn() {
		return this.tinOfimdn;
	}

	public void setTinOfimdn(String tinOfimdn) {
		this.tinOfimdn = tinOfimdn;
	}

	public String getTinPermutantes() {
		return this.tinPermutantes;
	}

	public void setTinPermutantes(String tinPermutantes) {
		this.tinPermutantes = tinPermutantes;
	}

	public String getTinPertransfirio() {
		return this.tinPertransfirio;
	}

	public void setTinPertransfirio(String tinPertransfirio) {
		this.tinPertransfirio = tinPertransfirio;
	}

	public String getTinResjuzgado() {
		return this.tinResjuzgado;
	}

	public void setTinResjuzgado(String tinResjuzgado) {
		this.tinResjuzgado = tinResjuzgado;
	}

	public String getTinSemovi() {
		return this.tinSemovi;
	}

	public void setTinSemovi(String tinSemovi) {
		this.tinSemovi = tinSemovi;
	}

	public String getTinTerren() {
		return this.tinTerren;
	}

	public void setTinTerren(String tinTerren) {
		this.tinTerren = tinTerren;
	}

	public String getTinTransf() {
		return this.tinTransf;
	}

	public void setTinTransf(String tinTransf) {
		this.tinTransf = tinTransf;
	}

	public String getTinTrasper() {
		return this.tinTrasper;
	}

	public void setTinTrasper(String tinTrasper) {
		this.tinTrasper = tinTrasper;
	}

	public String getTinVehicu() {
		return this.tinVehicu;
	}

	public void setTinVehicu(String tinVehicu) {
		this.tinVehicu = tinVehicu;
	}

	public List<FmovArticulo> getFmovArticulos() {
		return this.fmovArticulos;
	}

	public void setFmovArticulos(List<FmovArticulo> fmovArticulos) {
		this.fmovArticulos = fmovArticulos;
	}

	public FmovArticulo addFmovArticulo(FmovArticulo fmovArticulo) {
		getFmovArticulos().add(fmovArticulo);
		fmovArticulo.setFtinTipoing(this);

		return fmovArticulo;
	}

	public FmovArticulo removeFmovArticulo(FmovArticulo fmovArticulo) {
		getFmovArticulos().remove(fmovArticulo);
		fmovArticulo.setFtinTipoing(null);

		return fmovArticulo;
	}

}