package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FPAI_PARTINGRESO database table.
 * 
 */
@Entity
@Table(name="FPAI_PARTINGRESO")
@NamedQuery(name="FpaiPartingreso.findAll", query="SELECT f FROM FpaiPartingreso f")
public class FpaiPartingreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAI_SECUENCIA")
	private long paiSecuencia;

	@Column(name="PAI_ANIO")
	private BigDecimal paiAnio;

	@Column(name="PAI_CODIGO")
	private String paiCodigo;

	@Column(name="PAI_NIVEL")
	private BigDecimal paiNivel;

	@Column(name="PAI_NOMBRE")
	private String paiNombre;

	//bi-directional many-to-one association to FconConcepto
	@OneToMany(mappedBy="fpaiPartingreso")
	private List<FconConcepto> fconConceptos;

	public FpaiPartingreso() {
	}

	public long getPaiSecuencia() {
		return this.paiSecuencia;
	}

	public void setPaiSecuencia(long paiSecuencia) {
		this.paiSecuencia = paiSecuencia;
	}

	public BigDecimal getPaiAnio() {
		return this.paiAnio;
	}

	public void setPaiAnio(BigDecimal paiAnio) {
		this.paiAnio = paiAnio;
	}

	public String getPaiCodigo() {
		return this.paiCodigo;
	}

	public void setPaiCodigo(String paiCodigo) {
		this.paiCodigo = paiCodigo;
	}

	public BigDecimal getPaiNivel() {
		return this.paiNivel;
	}

	public void setPaiNivel(BigDecimal paiNivel) {
		this.paiNivel = paiNivel;
	}

	public String getPaiNombre() {
		return this.paiNombre;
	}

	public void setPaiNombre(String paiNombre) {
		this.paiNombre = paiNombre;
	}

	public List<FconConcepto> getFconConceptos() {
		return this.fconConceptos;
	}

	public void setFconConceptos(List<FconConcepto> fconConceptos) {
		this.fconConceptos = fconConceptos;
	}

	public FconConcepto addFconConcepto(FconConcepto fconConcepto) {
		getFconConceptos().add(fconConcepto);
		fconConcepto.setFpaiPartingreso(this);

		return fconConcepto;
	}

	public FconConcepto removeFconConcepto(FconConcepto fconConcepto) {
		getFconConceptos().remove(fconConcepto);
		fconConcepto.setFpaiPartingreso(null);

		return fconConcepto;
	}

}