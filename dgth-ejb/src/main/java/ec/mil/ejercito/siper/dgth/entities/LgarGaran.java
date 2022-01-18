package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the LGAR_GARAN database table.
 * 
 */
@Entity
@Table(name="LGAR_GARAN")
@NamedQuery(name="LgarGaran.findAll", query="SELECT l FROM LgarGaran l")
public class LgarGaran implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GAR_CODIGOGA")
	private long garCodigoga;

	@Column(name="GAR_ESTADO")
	private String garEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="GAR_FECINI")
	private Date garFecini;

	@Temporal(TemporalType.DATE)
	@Column(name="GAR_FECREC")
	private Date garFecrec;

	@Temporal(TemporalType.DATE)
	@Column(name="GAR_FECVEN")
	private Date garFecven;

	@Column(name="GAR_MONTO")
	private BigDecimal garMonto;

	@Column(name="GAR_NUMERO")
	private String garNumero;

	@Column(name="GAR_OBSERV")
	private String garObserv;

	@Column(name="GAR_PRIMA")
	private BigDecimal garPrima;

	@Column(name="GAR_TIPO")
	private String garTipo;

	//bi-directional many-to-one association to FsegSeguro
	@ManyToOne
	@JoinColumn(name="SEG_SECUEN")
	private FsegSeguro fsegSeguro;

	//bi-directional many-to-one association to FtdcTipdoc
	@ManyToOne
	@JoinColumn(name="TDC_SECUEN")
	private FtdcTipdoc ftdcTipdoc;

	//bi-directional many-to-one association to FtgrGarantia
	@ManyToOne
	@JoinColumn(name="TGR_CODIGO")
	private FtgrGarantia ftgrGarantia;

	//bi-directional many-to-one association to LconCtrto
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private LconCtrto lconCtrto;

	public LgarGaran() {
	}

	public long getGarCodigoga() {
		return this.garCodigoga;
	}

	public void setGarCodigoga(long garCodigoga) {
		this.garCodigoga = garCodigoga;
	}

	public String getGarEstado() {
		return this.garEstado;
	}

	public void setGarEstado(String garEstado) {
		this.garEstado = garEstado;
	}

	public Date getGarFecini() {
		return this.garFecini;
	}

	public void setGarFecini(Date garFecini) {
		this.garFecini = garFecini;
	}

	public Date getGarFecrec() {
		return this.garFecrec;
	}

	public void setGarFecrec(Date garFecrec) {
		this.garFecrec = garFecrec;
	}

	public Date getGarFecven() {
		return this.garFecven;
	}

	public void setGarFecven(Date garFecven) {
		this.garFecven = garFecven;
	}

	public BigDecimal getGarMonto() {
		return this.garMonto;
	}

	public void setGarMonto(BigDecimal garMonto) {
		this.garMonto = garMonto;
	}

	public String getGarNumero() {
		return this.garNumero;
	}

	public void setGarNumero(String garNumero) {
		this.garNumero = garNumero;
	}

	public String getGarObserv() {
		return this.garObserv;
	}

	public void setGarObserv(String garObserv) {
		this.garObserv = garObserv;
	}

	public BigDecimal getGarPrima() {
		return this.garPrima;
	}

	public void setGarPrima(BigDecimal garPrima) {
		this.garPrima = garPrima;
	}

	public String getGarTipo() {
		return this.garTipo;
	}

	public void setGarTipo(String garTipo) {
		this.garTipo = garTipo;
	}

	public FsegSeguro getFsegSeguro() {
		return this.fsegSeguro;
	}

	public void setFsegSeguro(FsegSeguro fsegSeguro) {
		this.fsegSeguro = fsegSeguro;
	}

	public FtdcTipdoc getFtdcTipdoc() {
		return this.ftdcTipdoc;
	}

	public void setFtdcTipdoc(FtdcTipdoc ftdcTipdoc) {
		this.ftdcTipdoc = ftdcTipdoc;
	}

	public FtgrGarantia getFtgrGarantia() {
		return this.ftgrGarantia;
	}

	public void setFtgrGarantia(FtgrGarantia ftgrGarantia) {
		this.ftgrGarantia = ftgrGarantia;
	}

	public LconCtrto getLconCtrto() {
		return this.lconCtrto;
	}

	public void setLconCtrto(LconCtrto lconCtrto) {
		this.lconCtrto = lconCtrto;
	}

}