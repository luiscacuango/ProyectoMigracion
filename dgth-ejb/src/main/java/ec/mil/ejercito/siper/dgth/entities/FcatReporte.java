package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FCAT_REPORTE database table.
 * 
 */
@Entity
@Table(name="FCAT_REPORTE")
@NamedQuery(name="FcatReporte.findAll", query="SELECT f FROM FcatReporte f")
public class FcatReporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CAT_SECUENCIA")
	private long catSecuencia;

	@Column(name="CAT_AGRUPACION")
	private String catAgrupacion;

	@Column(name="CAT_DESCRIPCION")
	private String catDescripcion;

	@Column(name="CAT_NIVEL")
	private BigDecimal catNivel;

	@Column(name="CAT_TIPO")
	private String catTipo;

	@Column(name="CTC_SECUEN")
	private String ctcSecuen;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	public FcatReporte() {
	}

	public long getCatSecuencia() {
		return this.catSecuencia;
	}

	public void setCatSecuencia(long catSecuencia) {
		this.catSecuencia = catSecuencia;
	}

	public String getCatAgrupacion() {
		return this.catAgrupacion;
	}

	public void setCatAgrupacion(String catAgrupacion) {
		this.catAgrupacion = catAgrupacion;
	}

	public String getCatDescripcion() {
		return this.catDescripcion;
	}

	public void setCatDescripcion(String catDescripcion) {
		this.catDescripcion = catDescripcion;
	}

	public BigDecimal getCatNivel() {
		return this.catNivel;
	}

	public void setCatNivel(BigDecimal catNivel) {
		this.catNivel = catNivel;
	}

	public String getCatTipo() {
		return this.catTipo;
	}

	public void setCatTipo(String catTipo) {
		this.catTipo = catTipo;
	}

	public String getCtcSecuen() {
		return this.ctcSecuen;
	}

	public void setCtcSecuen(String ctcSecuen) {
		this.ctcSecuen = ctcSecuen;
	}

	public String getDatCodigo() {
		return this.datCodigo;
	}

	public void setDatCodigo(String datCodigo) {
		this.datCodigo = datCodigo;
	}

}