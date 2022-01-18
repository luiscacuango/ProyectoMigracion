package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FDAA_AUXILIAR database table.
 * 
 */
@Entity
@Table(name="FDAA_AUXILIAR")
@NamedQuery(name="FdaaAuxiliar.findAll", query="SELECT f FROM FdaaAuxiliar f")
public class FdaaAuxiliar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DAA_SECUEN")
	private long daaSecuen;

	@Column(name="DAA_DETALLE")
	private String daaDetalle;

	@Temporal(TemporalType.DATE)
	@Column(name="DAA_FECVEN")
	private Date daaFecven;

	@Column(name="DAA_MONTO")
	private BigDecimal daaMonto;

	//bi-directional many-to-one association to FdacAstCont
	@ManyToOne
	@JoinColumn(name="FDA_DAC_SECUEN")
	private FdacAstCont fdacAstCont;

	//bi-directional many-to-one association to FdciDetciu
	@ManyToOne
	@JoinColumn(name="DCI_CODIGO")
	private FdciDetciu fdciDetciu;

	//bi-directional many-to-one association to FtdcDocumento
	@ManyToOne
	@JoinColumn(name="FTD_TDC_SECUEN")
	private FtdcDocumento ftdcDocumento;

	public FdaaAuxiliar() {
	}

	public long getDaaSecuen() {
		return this.daaSecuen;
	}

	public void setDaaSecuen(long daaSecuen) {
		this.daaSecuen = daaSecuen;
	}

	public String getDaaDetalle() {
		return this.daaDetalle;
	}

	public void setDaaDetalle(String daaDetalle) {
		this.daaDetalle = daaDetalle;
	}

	public Date getDaaFecven() {
		return this.daaFecven;
	}

	public void setDaaFecven(Date daaFecven) {
		this.daaFecven = daaFecven;
	}

	public BigDecimal getDaaMonto() {
		return this.daaMonto;
	}

	public void setDaaMonto(BigDecimal daaMonto) {
		this.daaMonto = daaMonto;
	}

	public FdacAstCont getFdacAstCont() {
		return this.fdacAstCont;
	}

	public void setFdacAstCont(FdacAstCont fdacAstCont) {
		this.fdacAstCont = fdacAstCont;
	}

	public FdciDetciu getFdciDetciu() {
		return this.fdciDetciu;
	}

	public void setFdciDetciu(FdciDetciu fdciDetciu) {
		this.fdciDetciu = fdciDetciu;
	}

	public FtdcDocumento getFtdcDocumento() {
		return this.ftdcDocumento;
	}

	public void setFtdcDocumento(FtdcDocumento ftdcDocumento) {
		this.ftdcDocumento = ftdcDocumento;
	}

}