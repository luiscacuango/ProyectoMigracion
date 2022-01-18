package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FPFP_FIRMAS_REPORTE database table.
 * 
 */
@Entity
@Table(name="FPFP_FIRMAS_REPORTE")
@NamedQuery(name="FpfpFirmasReporte.findAll", query="SELECT f FROM FpfpFirmasReporte f")
public class FpfpFirmasReporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long codigo;

	private String nombre;

	@Column(name="SIS_CODIGOSISSUB")
	private String sisCodigosissub;

	//bi-directional many-to-one association to FpdfFirma
	@OneToMany(mappedBy="fpfpFirmasReporte")
	private List<FpdfFirma> fpdfFirmas;

	public FpfpFirmasReporte() {
	}

	public long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSisCodigosissub() {
		return this.sisCodigosissub;
	}

	public void setSisCodigosissub(String sisCodigosissub) {
		this.sisCodigosissub = sisCodigosissub;
	}

	public List<FpdfFirma> getFpdfFirmas() {
		return this.fpdfFirmas;
	}

	public void setFpdfFirmas(List<FpdfFirma> fpdfFirmas) {
		this.fpdfFirmas = fpdfFirmas;
	}

	public FpdfFirma addFpdfFirma(FpdfFirma fpdfFirma) {
		getFpdfFirmas().add(fpdfFirma);
		fpdfFirma.setFpfpFirmasReporte(this);

		return fpdfFirma;
	}

	public FpdfFirma removeFpdfFirma(FpdfFirma fpdfFirma) {
		getFpdfFirmas().remove(fpdfFirma);
		fpdfFirma.setFpfpFirmasReporte(null);

		return fpdfFirma;
	}

}