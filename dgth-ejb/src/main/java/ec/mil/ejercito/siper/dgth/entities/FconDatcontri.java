package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FCON_DATCONTRI database table.
 * 
 */
@Entity
@Table(name="FCON_DATCONTRI")
@NamedQuery(name="FconDatcontri.findAll", query="SELECT f FROM FconDatcontri f")
public class FconDatcontri implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CON_SECUENCIA")
	private long conSecuencia;

	@Column(name="CON_CONASUMXEMP")
	private BigDecimal conConasumxemp;

	@Column(name="CON_CONASUXESEM")
	private BigDecimal conConasuxesem;

	@Column(name="CON_CONRETXOTRE")
	private BigDecimal conConretxotre;

	@Column(name="CON_CRETRDONOTE")
	private BigDecimal conCretrdonote;

	@Column(name="CON_CRETRDOXEMP")
	private BigDecimal conCretrdoxemp;

	@Column(name="CON_CRETRUTIDON")
	private BigDecimal conCretrutidon;

	@Column(name="CON_CRETRXDONAC")
	private BigDecimal conCretrxdonac;

	@Column(name="CON_EXONERAC")
	private BigDecimal conExonerac;

	@Column(name="CON_INGOTREM")
	private BigDecimal conIngotrem;

	@Column(name="CON_INGPROMED")
	private BigDecimal conIngpromed;

	@Column(name="CON_INGRESO")
	private BigDecimal conIngreso;

	@Column(name="CON_NMESCOTEM")
	private BigDecimal conNmescotem;

	@Column(name="CON_NUMDESMES")
	private BigDecimal conNumdesmes;

	@Column(name="CON_NUMESTRAB")
	private BigDecimal conNumestrab;

	@Column(name="CON_NUMMESOTRE")
	private BigDecimal conNummesotre;

	@Column(name="CON_TOTCOTRETN")
	private BigDecimal conTotcotretn;

	@Column(name="CON_TOTDESCUEN")
	private BigDecimal conTotdescuen;

	@Column(name="CON_TOTDESTCON")
	private BigDecimal conTotdestcon;

	@Column(name="CON_TOTINGRE")
	private BigDecimal conTotingre;

	@Column(name="CON_TOTNUMDES")
	private BigDecimal conTotnumdes;

	@Column(name="CON_TOTNUMES")
	private BigDecimal conTotnumes;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	public FconDatcontri() {
	}

	public long getConSecuencia() {
		return this.conSecuencia;
	}

	public void setConSecuencia(long conSecuencia) {
		this.conSecuencia = conSecuencia;
	}

	public BigDecimal getConConasumxemp() {
		return this.conConasumxemp;
	}

	public void setConConasumxemp(BigDecimal conConasumxemp) {
		this.conConasumxemp = conConasumxemp;
	}

	public BigDecimal getConConasuxesem() {
		return this.conConasuxesem;
	}

	public void setConConasuxesem(BigDecimal conConasuxesem) {
		this.conConasuxesem = conConasuxesem;
	}

	public BigDecimal getConConretxotre() {
		return this.conConretxotre;
	}

	public void setConConretxotre(BigDecimal conConretxotre) {
		this.conConretxotre = conConretxotre;
	}

	public BigDecimal getConCretrdonote() {
		return this.conCretrdonote;
	}

	public void setConCretrdonote(BigDecimal conCretrdonote) {
		this.conCretrdonote = conCretrdonote;
	}

	public BigDecimal getConCretrdoxemp() {
		return this.conCretrdoxemp;
	}

	public void setConCretrdoxemp(BigDecimal conCretrdoxemp) {
		this.conCretrdoxemp = conCretrdoxemp;
	}

	public BigDecimal getConCretrutidon() {
		return this.conCretrutidon;
	}

	public void setConCretrutidon(BigDecimal conCretrutidon) {
		this.conCretrutidon = conCretrutidon;
	}

	public BigDecimal getConCretrxdonac() {
		return this.conCretrxdonac;
	}

	public void setConCretrxdonac(BigDecimal conCretrxdonac) {
		this.conCretrxdonac = conCretrxdonac;
	}

	public BigDecimal getConExonerac() {
		return this.conExonerac;
	}

	public void setConExonerac(BigDecimal conExonerac) {
		this.conExonerac = conExonerac;
	}

	public BigDecimal getConIngotrem() {
		return this.conIngotrem;
	}

	public void setConIngotrem(BigDecimal conIngotrem) {
		this.conIngotrem = conIngotrem;
	}

	public BigDecimal getConIngpromed() {
		return this.conIngpromed;
	}

	public void setConIngpromed(BigDecimal conIngpromed) {
		this.conIngpromed = conIngpromed;
	}

	public BigDecimal getConIngreso() {
		return this.conIngreso;
	}

	public void setConIngreso(BigDecimal conIngreso) {
		this.conIngreso = conIngreso;
	}

	public BigDecimal getConNmescotem() {
		return this.conNmescotem;
	}

	public void setConNmescotem(BigDecimal conNmescotem) {
		this.conNmescotem = conNmescotem;
	}

	public BigDecimal getConNumdesmes() {
		return this.conNumdesmes;
	}

	public void setConNumdesmes(BigDecimal conNumdesmes) {
		this.conNumdesmes = conNumdesmes;
	}

	public BigDecimal getConNumestrab() {
		return this.conNumestrab;
	}

	public void setConNumestrab(BigDecimal conNumestrab) {
		this.conNumestrab = conNumestrab;
	}

	public BigDecimal getConNummesotre() {
		return this.conNummesotre;
	}

	public void setConNummesotre(BigDecimal conNummesotre) {
		this.conNummesotre = conNummesotre;
	}

	public BigDecimal getConTotcotretn() {
		return this.conTotcotretn;
	}

	public void setConTotcotretn(BigDecimal conTotcotretn) {
		this.conTotcotretn = conTotcotretn;
	}

	public BigDecimal getConTotdescuen() {
		return this.conTotdescuen;
	}

	public void setConTotdescuen(BigDecimal conTotdescuen) {
		this.conTotdescuen = conTotdescuen;
	}

	public BigDecimal getConTotdestcon() {
		return this.conTotdestcon;
	}

	public void setConTotdestcon(BigDecimal conTotdestcon) {
		this.conTotdestcon = conTotdestcon;
	}

	public BigDecimal getConTotingre() {
		return this.conTotingre;
	}

	public void setConTotingre(BigDecimal conTotingre) {
		this.conTotingre = conTotingre;
	}

	public BigDecimal getConTotnumdes() {
		return this.conTotnumdes;
	}

	public void setConTotnumdes(BigDecimal conTotnumdes) {
		this.conTotnumdes = conTotnumdes;
	}

	public BigDecimal getConTotnumes() {
		return this.conTotnumes;
	}

	public void setConTotnumes(BigDecimal conTotnumes) {
		this.conTotnumes = conTotnumes;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

}