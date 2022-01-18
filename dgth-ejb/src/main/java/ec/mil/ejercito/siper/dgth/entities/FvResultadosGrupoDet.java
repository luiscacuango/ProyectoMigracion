package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FV_RESULTADOS_GRUPO_DET database table.
 * 
 */
@Entity
@Table(name="FV_RESULTADOS_GRUPO_DET")
@NamedQuery(name="FvResultadosGrupoDet.findAll", query="SELECT f FROM FvResultadosGrupoDet f")
public class FvResultadosGrupoDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CTC_SECUEN")
	private String ctcSecuen;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	@Column(name="DAT_DESCRI")
	private String datDescri;

	@Column(name="DAT_NIVEL")
	private BigDecimal datNivel;

	@Column(name="FDA_DAT_CODIGO")
	private String fdaDatCodigo;

	private String grupo;

	private BigDecimal orden;

	private String subgrupo;

	public FvResultadosGrupoDet() {
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

	public String getDatDescri() {
		return this.datDescri;
	}

	public void setDatDescri(String datDescri) {
		this.datDescri = datDescri;
	}

	public BigDecimal getDatNivel() {
		return this.datNivel;
	}

	public void setDatNivel(BigDecimal datNivel) {
		this.datNivel = datNivel;
	}

	public String getFdaDatCodigo() {
		return this.fdaDatCodigo;
	}

	public void setFdaDatCodigo(String fdaDatCodigo) {
		this.fdaDatCodigo = fdaDatCodigo;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public BigDecimal getOrden() {
		return this.orden;
	}

	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}

	public String getSubgrupo() {
		return this.subgrupo;
	}

	public void setSubgrupo(String subgrupo) {
		this.subgrupo = subgrupo;
	}

}