package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FNOM_NOMINASPRYN database table.
 * 
 */
@Entity
@Table(name="FNOM_NOMINASPRYN")
@NamedQuery(name="FnomNominaspryn.findAll", query="SELECT f FROM FnomNominaspryn f")
public class FnomNominaspryn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NOM_CODIGO")
	private long nomCodigo;

	@Column(name="NOM_APOIND")
	private String nomApoind;

	@Column(name="NOM_APOPAT")
	private String nomApopat;

	@Column(name="NOM_CANTON")
	private String nomCanton;

	@Column(name="NOM_CODCAN")
	private String nomCodcan;

	@Column(name="NOM_CODDENPUE")
	private String nomCoddenpue;

	@Column(name="NOM_CODENLPRE")
	private String nomCodenlpre;

	@Column(name="NOM_CODESCOCU")
	private String nomCodescocu;

	@Column(name="NOM_CODMODLAB")
	private String nomCodmodlab;

	@Column(name="NOM_CODNIVOCU")
	private String nomCodnivocu;

	@Column(name="NOM_CODPUEADI")
	private String nomCodpueadi;

	@Column(name="NOM_CODREGLAB")
	private String nomCodreglab;

	@Column(name="NOM_CODSUC")
	private String nomCodsuc;

	@Column(name="NOM_CODUNIORG")
	private String nomCoduniorg;

	@Column(name="NOM_DENPUE")
	private String nomDenpue;

	@Column(name="NOM_ESCOCU")
	private String nomEscocu;

	@Column(name="NOM_ESTPRO")
	private String nomEstpro;

	@Column(name="NOM_ESTPUE")
	private String nomEstpue;

	@Column(name="NOM_FECFIN")
	private String nomFecfin;

	@Column(name="NOM_FECINI")
	private String nomFecini;

	@Column(name="NOM_GRADO")
	private String nomGrado;

	@Column(name="NOM_MODLAB")
	private String nomModlab;

	@Column(name="NOM_NIVOCU")
	private String nomNivocu;

	@Column(name="NOM_NOMBRES")
	private String nomNombres;

	@Column(name="NOM_NUMIDE")
	private String nomNumide;

	@Column(name="NOM_PARIND")
	private String nomParind;

	@Column(name="NOM_PROVINCIA")
	private String nomProvincia;

	@Column(name="NOM_PUEADI")
	private String nomPueadi;

	@Column(name="NOM_REGLAB")
	private String nomReglab;

	@Column(name="NOM_RMUESC")
	private String nomRmuesc;

	@Column(name="NOM_RMUPUE")
	private String nomRmupue;

	@Column(name="NOM_RMUSOB")
	private String nomRmusob;

	@Column(name="NOM_RUCPAT")
	private String nomRucpat;

	@Column(name="NOM_TIPIDE")
	private String nomTipide;

	@Column(name="NOM_UNIORG")
	private String nomUniorg;

	public FnomNominaspryn() {
	}

	public long getNomCodigo() {
		return this.nomCodigo;
	}

	public void setNomCodigo(long nomCodigo) {
		this.nomCodigo = nomCodigo;
	}

	public String getNomApoind() {
		return this.nomApoind;
	}

	public void setNomApoind(String nomApoind) {
		this.nomApoind = nomApoind;
	}

	public String getNomApopat() {
		return this.nomApopat;
	}

	public void setNomApopat(String nomApopat) {
		this.nomApopat = nomApopat;
	}

	public String getNomCanton() {
		return this.nomCanton;
	}

	public void setNomCanton(String nomCanton) {
		this.nomCanton = nomCanton;
	}

	public String getNomCodcan() {
		return this.nomCodcan;
	}

	public void setNomCodcan(String nomCodcan) {
		this.nomCodcan = nomCodcan;
	}

	public String getNomCoddenpue() {
		return this.nomCoddenpue;
	}

	public void setNomCoddenpue(String nomCoddenpue) {
		this.nomCoddenpue = nomCoddenpue;
	}

	public String getNomCodenlpre() {
		return this.nomCodenlpre;
	}

	public void setNomCodenlpre(String nomCodenlpre) {
		this.nomCodenlpre = nomCodenlpre;
	}

	public String getNomCodescocu() {
		return this.nomCodescocu;
	}

	public void setNomCodescocu(String nomCodescocu) {
		this.nomCodescocu = nomCodescocu;
	}

	public String getNomCodmodlab() {
		return this.nomCodmodlab;
	}

	public void setNomCodmodlab(String nomCodmodlab) {
		this.nomCodmodlab = nomCodmodlab;
	}

	public String getNomCodnivocu() {
		return this.nomCodnivocu;
	}

	public void setNomCodnivocu(String nomCodnivocu) {
		this.nomCodnivocu = nomCodnivocu;
	}

	public String getNomCodpueadi() {
		return this.nomCodpueadi;
	}

	public void setNomCodpueadi(String nomCodpueadi) {
		this.nomCodpueadi = nomCodpueadi;
	}

	public String getNomCodreglab() {
		return this.nomCodreglab;
	}

	public void setNomCodreglab(String nomCodreglab) {
		this.nomCodreglab = nomCodreglab;
	}

	public String getNomCodsuc() {
		return this.nomCodsuc;
	}

	public void setNomCodsuc(String nomCodsuc) {
		this.nomCodsuc = nomCodsuc;
	}

	public String getNomCoduniorg() {
		return this.nomCoduniorg;
	}

	public void setNomCoduniorg(String nomCoduniorg) {
		this.nomCoduniorg = nomCoduniorg;
	}

	public String getNomDenpue() {
		return this.nomDenpue;
	}

	public void setNomDenpue(String nomDenpue) {
		this.nomDenpue = nomDenpue;
	}

	public String getNomEscocu() {
		return this.nomEscocu;
	}

	public void setNomEscocu(String nomEscocu) {
		this.nomEscocu = nomEscocu;
	}

	public String getNomEstpro() {
		return this.nomEstpro;
	}

	public void setNomEstpro(String nomEstpro) {
		this.nomEstpro = nomEstpro;
	}

	public String getNomEstpue() {
		return this.nomEstpue;
	}

	public void setNomEstpue(String nomEstpue) {
		this.nomEstpue = nomEstpue;
	}

	public String getNomFecfin() {
		return this.nomFecfin;
	}

	public void setNomFecfin(String nomFecfin) {
		this.nomFecfin = nomFecfin;
	}

	public String getNomFecini() {
		return this.nomFecini;
	}

	public void setNomFecini(String nomFecini) {
		this.nomFecini = nomFecini;
	}

	public String getNomGrado() {
		return this.nomGrado;
	}

	public void setNomGrado(String nomGrado) {
		this.nomGrado = nomGrado;
	}

	public String getNomModlab() {
		return this.nomModlab;
	}

	public void setNomModlab(String nomModlab) {
		this.nomModlab = nomModlab;
	}

	public String getNomNivocu() {
		return this.nomNivocu;
	}

	public void setNomNivocu(String nomNivocu) {
		this.nomNivocu = nomNivocu;
	}

	public String getNomNombres() {
		return this.nomNombres;
	}

	public void setNomNombres(String nomNombres) {
		this.nomNombres = nomNombres;
	}

	public String getNomNumide() {
		return this.nomNumide;
	}

	public void setNomNumide(String nomNumide) {
		this.nomNumide = nomNumide;
	}

	public String getNomParind() {
		return this.nomParind;
	}

	public void setNomParind(String nomParind) {
		this.nomParind = nomParind;
	}

	public String getNomProvincia() {
		return this.nomProvincia;
	}

	public void setNomProvincia(String nomProvincia) {
		this.nomProvincia = nomProvincia;
	}

	public String getNomPueadi() {
		return this.nomPueadi;
	}

	public void setNomPueadi(String nomPueadi) {
		this.nomPueadi = nomPueadi;
	}

	public String getNomReglab() {
		return this.nomReglab;
	}

	public void setNomReglab(String nomReglab) {
		this.nomReglab = nomReglab;
	}

	public String getNomRmuesc() {
		return this.nomRmuesc;
	}

	public void setNomRmuesc(String nomRmuesc) {
		this.nomRmuesc = nomRmuesc;
	}

	public String getNomRmupue() {
		return this.nomRmupue;
	}

	public void setNomRmupue(String nomRmupue) {
		this.nomRmupue = nomRmupue;
	}

	public String getNomRmusob() {
		return this.nomRmusob;
	}

	public void setNomRmusob(String nomRmusob) {
		this.nomRmusob = nomRmusob;
	}

	public String getNomRucpat() {
		return this.nomRucpat;
	}

	public void setNomRucpat(String nomRucpat) {
		this.nomRucpat = nomRucpat;
	}

	public String getNomTipide() {
		return this.nomTipide;
	}

	public void setNomTipide(String nomTipide) {
		this.nomTipide = nomTipide;
	}

	public String getNomUniorg() {
		return this.nomUniorg;
	}

	public void setNomUniorg(String nomUniorg) {
		this.nomUniorg = nomUniorg;
	}

}