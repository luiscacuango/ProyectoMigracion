package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FV_PARAM_MATRIZ database table.
 * 
 */
@Entity
@Table(name="FV_PARAM_MATRIZ")
@NamedQuery(name="FvParamMatriz.findAll", query="SELECT f FROM FvParamMatriz f")
public class FvParamMatriz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CTC_SECUEN")
	private String ctcSecuen;

	@Column(name="DAT_ABREV")
	private String datAbrev;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	@Column(name="DAT_DESCRI")
	private String datDescri;

	@Column(name="DESC_GRUPO")
	private String descGrupo;

	private BigDecimal grupo;

	public FvParamMatriz() {
	}

	public String getCtcSecuen() {
		return this.ctcSecuen;
	}

	public void setCtcSecuen(String ctcSecuen) {
		this.ctcSecuen = ctcSecuen;
	}

	public String getDatAbrev() {
		return this.datAbrev;
	}

	public void setDatAbrev(String datAbrev) {
		this.datAbrev = datAbrev;
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

	public String getDescGrupo() {
		return this.descGrupo;
	}

	public void setDescGrupo(String descGrupo) {
		this.descGrupo = descGrupo;
	}

	public BigDecimal getGrupo() {
		return this.grupo;
	}

	public void setGrupo(BigDecimal grupo) {
		this.grupo = grupo;
	}

}