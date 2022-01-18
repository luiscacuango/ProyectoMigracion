package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FTGR_GARANTIAS database table.
 * 
 */
@Entity
@Table(name="FTGR_GARANTIAS")
@NamedQuery(name="FtgrGarantia.findAll", query="SELECT f FROM FtgrGarantia f")
public class FtgrGarantia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TGR_CODIGO")
	private long tgrCodigo;

	@Column(name="TGR_ABREVI")
	private String tgrAbrevi;

	@Column(name="TGR_DESCRI")
	private String tgrDescri;

	@Column(name="TGR_PORCEN")
	private BigDecimal tgrPorcen;

	@Column(name="TGR_TIPO")
	private String tgrTipo;

	//bi-directional many-to-one association to LgarGaran
	@OneToMany(mappedBy="ftgrGarantia")
	private List<LgarGaran> lgarGarans;

	public FtgrGarantia() {
	}

	public long getTgrCodigo() {
		return this.tgrCodigo;
	}

	public void setTgrCodigo(long tgrCodigo) {
		this.tgrCodigo = tgrCodigo;
	}

	public String getTgrAbrevi() {
		return this.tgrAbrevi;
	}

	public void setTgrAbrevi(String tgrAbrevi) {
		this.tgrAbrevi = tgrAbrevi;
	}

	public String getTgrDescri() {
		return this.tgrDescri;
	}

	public void setTgrDescri(String tgrDescri) {
		this.tgrDescri = tgrDescri;
	}

	public BigDecimal getTgrPorcen() {
		return this.tgrPorcen;
	}

	public void setTgrPorcen(BigDecimal tgrPorcen) {
		this.tgrPorcen = tgrPorcen;
	}

	public String getTgrTipo() {
		return this.tgrTipo;
	}

	public void setTgrTipo(String tgrTipo) {
		this.tgrTipo = tgrTipo;
	}

	public List<LgarGaran> getLgarGarans() {
		return this.lgarGarans;
	}

	public void setLgarGarans(List<LgarGaran> lgarGarans) {
		this.lgarGarans = lgarGarans;
	}

	public LgarGaran addLgarGaran(LgarGaran lgarGaran) {
		getLgarGarans().add(lgarGaran);
		lgarGaran.setFtgrGarantia(this);

		return lgarGaran;
	}

	public LgarGaran removeLgarGaran(LgarGaran lgarGaran) {
		getLgarGarans().remove(lgarGaran);
		lgarGaran.setFtgrGarantia(null);

		return lgarGaran;
	}

}