package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPDF_FIRMAS database table.
 * 
 */
@Entity
@Table(name="FPDF_FIRMAS")
@NamedQuery(name="FpdfFirma.findAll", query="SELECT f FROM FpdfFirma f")
public class FpdfFirma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="FPDF_CARGO")
	private String fpdfCargo;

	@Column(name="FPDF_NOMBRE")
	private String fpdfNombre;

	@Column(name="FPDF_ORDEN")
	private BigDecimal fpdfOrden;

	@Column(name="FPDF_PUESTO")
	private String fpdfPuesto;

	//bi-directional many-to-one association to FpfpFirmasReporte
	@ManyToOne
	@JoinColumn(name="FPDF_REPORTE")
	private FpfpFirmasReporte fpfpFirmasReporte;

	public FpdfFirma() {
	}

	public String getFpdfCargo() {
		return this.fpdfCargo;
	}

	public void setFpdfCargo(String fpdfCargo) {
		this.fpdfCargo = fpdfCargo;
	}

	public String getFpdfNombre() {
		return this.fpdfNombre;
	}

	public void setFpdfNombre(String fpdfNombre) {
		this.fpdfNombre = fpdfNombre;
	}

	public BigDecimal getFpdfOrden() {
		return this.fpdfOrden;
	}

	public void setFpdfOrden(BigDecimal fpdfOrden) {
		this.fpdfOrden = fpdfOrden;
	}

	public String getFpdfPuesto() {
		return this.fpdfPuesto;
	}

	public void setFpdfPuesto(String fpdfPuesto) {
		this.fpdfPuesto = fpdfPuesto;
	}

	public FpfpFirmasReporte getFpfpFirmasReporte() {
		return this.fpfpFirmasReporte;
	}

	public void setFpfpFirmasReporte(FpfpFirmasReporte fpfpFirmasReporte) {
		this.fpfpFirmasReporte = fpfpFirmasReporte;
	}

}