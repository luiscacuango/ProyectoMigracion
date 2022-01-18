package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FSEG_SEGURO database table.
 * 
 */
@Entity
@Table(name="FSEG_SEGURO")
@NamedQuery(name="FsegSeguro.findAll", query="SELECT f FROM FsegSeguro f")
public class FsegSeguro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SEG_SECUEN")
	private long segSecuen;

	@Column(name="SEG_SEGURO")
	private String segSeguro;

	//bi-directional many-to-one association to LgarGaran
	@OneToMany(mappedBy="fsegSeguro")
	private List<LgarGaran> lgarGarans;

	public FsegSeguro() {
	}

	public long getSegSecuen() {
		return this.segSecuen;
	}

	public void setSegSecuen(long segSecuen) {
		this.segSecuen = segSecuen;
	}

	public String getSegSeguro() {
		return this.segSeguro;
	}

	public void setSegSeguro(String segSeguro) {
		this.segSeguro = segSeguro;
	}

	public List<LgarGaran> getLgarGarans() {
		return this.lgarGarans;
	}

	public void setLgarGarans(List<LgarGaran> lgarGarans) {
		this.lgarGarans = lgarGarans;
	}

	public LgarGaran addLgarGaran(LgarGaran lgarGaran) {
		getLgarGarans().add(lgarGaran);
		lgarGaran.setFsegSeguro(this);

		return lgarGaran;
	}

	public LgarGaran removeLgarGaran(LgarGaran lgarGaran) {
		getLgarGarans().remove(lgarGaran);
		lgarGaran.setFsegSeguro(null);

		return lgarGaran;
	}

}