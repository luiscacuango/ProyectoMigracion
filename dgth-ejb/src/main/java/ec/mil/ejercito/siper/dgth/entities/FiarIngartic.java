package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FIAR_INGARTIC database table.
 * 
 */
@Entity
@Table(name="FIAR_INGARTIC")
@NamedQuery(name="FiarIngartic.findAll", query="SELECT f FROM FiarIngartic f")
public class FiarIngartic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IAR_SECUEN")
	private long iarSecuen;

	@Column(name="ART_CODIGO")
	private double artCodigo;

	@Column(name="FAC_CODIGOFAC")
	private BigDecimal facCodigofac;

	@Column(name="IAR_CANTID")
	private BigDecimal iarCantid;

	@Column(name="IAR_COMENTARIO")
	private String iarComentario;

	@Temporal(TemporalType.DATE)
	@Column(name="IAR_FECADQ")
	private Date iarFecadq;

	@Temporal(TemporalType.DATE)
	@Column(name="IAR_FECFAC")
	private Date iarFecfac;

	@Temporal(TemporalType.DATE)
	@Column(name="IAR_FECREC")
	private Date iarFecrec;

	@Temporal(TemporalType.DATE)
	@Column(name="IAR_FECSIS")
	private Date iarFecsis;

	@Column(name="IAR_INGRES")
	private BigDecimal iarIngres;

	@Column(name="IAR_OBSERV")
	private String iarObserv;

	@Column(name="IAR_ORDGAS")
	private BigDecimal iarOrdgas;

	@Column(name="IAR_VALUNI")
	private BigDecimal iarValuni;

	@Column(name="IAR_VIDUTIL")
	private BigDecimal iarVidutil;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	//bi-directional many-to-one association to FfinFormaing
	@ManyToOne
	@JoinColumn(name="FFI_FIN_SECUEN")
	private FfinFormaing ffinFormaing;

	//bi-directional many-to-one association to FinvInven
	@OneToMany(mappedBy="fiarIngartic")
	private List<FinvInven> finvInvens;

	public FiarIngartic() {
	}

	public long getIarSecuen() {
		return this.iarSecuen;
	}

	public void setIarSecuen(long iarSecuen) {
		this.iarSecuen = iarSecuen;
	}

	public double getArtCodigo() {
		return this.artCodigo;
	}

	public void setArtCodigo(double artCodigo) {
		this.artCodigo = artCodigo;
	}

	public BigDecimal getFacCodigofac() {
		return this.facCodigofac;
	}

	public void setFacCodigofac(BigDecimal facCodigofac) {
		this.facCodigofac = facCodigofac;
	}

	public BigDecimal getIarCantid() {
		return this.iarCantid;
	}

	public void setIarCantid(BigDecimal iarCantid) {
		this.iarCantid = iarCantid;
	}

	public String getIarComentario() {
		return this.iarComentario;
	}

	public void setIarComentario(String iarComentario) {
		this.iarComentario = iarComentario;
	}

	public Date getIarFecadq() {
		return this.iarFecadq;
	}

	public void setIarFecadq(Date iarFecadq) {
		this.iarFecadq = iarFecadq;
	}

	public Date getIarFecfac() {
		return this.iarFecfac;
	}

	public void setIarFecfac(Date iarFecfac) {
		this.iarFecfac = iarFecfac;
	}

	public Date getIarFecrec() {
		return this.iarFecrec;
	}

	public void setIarFecrec(Date iarFecrec) {
		this.iarFecrec = iarFecrec;
	}

	public Date getIarFecsis() {
		return this.iarFecsis;
	}

	public void setIarFecsis(Date iarFecsis) {
		this.iarFecsis = iarFecsis;
	}

	public BigDecimal getIarIngres() {
		return this.iarIngres;
	}

	public void setIarIngres(BigDecimal iarIngres) {
		this.iarIngres = iarIngres;
	}

	public String getIarObserv() {
		return this.iarObserv;
	}

	public void setIarObserv(String iarObserv) {
		this.iarObserv = iarObserv;
	}

	public BigDecimal getIarOrdgas() {
		return this.iarOrdgas;
	}

	public void setIarOrdgas(BigDecimal iarOrdgas) {
		this.iarOrdgas = iarOrdgas;
	}

	public BigDecimal getIarValuni() {
		return this.iarValuni;
	}

	public void setIarValuni(BigDecimal iarValuni) {
		this.iarValuni = iarValuni;
	}

	public BigDecimal getIarVidutil() {
		return this.iarVidutil;
	}

	public void setIarVidutil(BigDecimal iarVidutil) {
		this.iarVidutil = iarVidutil;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public FfinFormaing getFfinFormaing() {
		return this.ffinFormaing;
	}

	public void setFfinFormaing(FfinFormaing ffinFormaing) {
		this.ffinFormaing = ffinFormaing;
	}

	public List<FinvInven> getFinvInvens() {
		return this.finvInvens;
	}

	public void setFinvInvens(List<FinvInven> finvInvens) {
		this.finvInvens = finvInvens;
	}

	public FinvInven addFinvInven(FinvInven finvInven) {
		getFinvInvens().add(finvInven);
		finvInven.setFiarIngartic(this);

		return finvInven;
	}

	public FinvInven removeFinvInven(FinvInven finvInven) {
		getFinvInvens().remove(finvInven);
		finvInven.setFiarIngartic(null);

		return finvInven;
	}

}