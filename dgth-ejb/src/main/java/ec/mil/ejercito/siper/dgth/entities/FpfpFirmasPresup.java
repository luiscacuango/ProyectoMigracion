package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPFP_FIRMAS_PRESUP database table.
 * 
 */
@Entity
@Table(name="FPFP_FIRMAS_PRESUP")
@NamedQuery(name="FpfpFirmasPresup.findAll", query="SELECT f FROM FpfpFirmasPresup f")
public class FpfpFirmasPresup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PFP_FIRMA1")
	private String pfpFirma1;

	@Column(name="PFP_FIRMA2")
	private String pfpFirma2;

	@Column(name="PFP_FIRMA3")
	private String pfpFirma3;

	@Column(name="PFP_FIRMA4")
	private String pfpFirma4;

	@Column(name="PFP_FIRMA5")
	private String pfpFirma5;

	@Column(name="PFP_TIPO_REGISTRO")
	private BigDecimal pfpTipoRegistro;

	@Column(name="PFP_TIPO_REPORTE")
	private BigDecimal pfpTipoReporte;

	public FpfpFirmasPresup() {
	}

	public String getPfpFirma1() {
		return this.pfpFirma1;
	}

	public void setPfpFirma1(String pfpFirma1) {
		this.pfpFirma1 = pfpFirma1;
	}

	public String getPfpFirma2() {
		return this.pfpFirma2;
	}

	public void setPfpFirma2(String pfpFirma2) {
		this.pfpFirma2 = pfpFirma2;
	}

	public String getPfpFirma3() {
		return this.pfpFirma3;
	}

	public void setPfpFirma3(String pfpFirma3) {
		this.pfpFirma3 = pfpFirma3;
	}

	public String getPfpFirma4() {
		return this.pfpFirma4;
	}

	public void setPfpFirma4(String pfpFirma4) {
		this.pfpFirma4 = pfpFirma4;
	}

	public String getPfpFirma5() {
		return this.pfpFirma5;
	}

	public void setPfpFirma5(String pfpFirma5) {
		this.pfpFirma5 = pfpFirma5;
	}

	public BigDecimal getPfpTipoRegistro() {
		return this.pfpTipoRegistro;
	}

	public void setPfpTipoRegistro(BigDecimal pfpTipoRegistro) {
		this.pfpTipoRegistro = pfpTipoRegistro;
	}

	public BigDecimal getPfpTipoReporte() {
		return this.pfpTipoReporte;
	}

	public void setPfpTipoReporte(BigDecimal pfpTipoReporte) {
		this.pfpTipoReporte = pfpTipoReporte;
	}

}