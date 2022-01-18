package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FTDC_TIPDOC database table.
 * 
 */
@Entity
@Table(name="FTDC_TIPDOC")
@NamedQuery(name="FtdcTipdoc.findAll", query="SELECT f FROM FtdcTipdoc f")
public class FtdcTipdoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TDC_SECUEN")
	private long tdcSecuen;

	@Column(name="TDC_ABREVI")
	private String tdcAbrevi;

	@Column(name="TDC_DOCUME")
	private String tdcDocume;

	//bi-directional many-to-one association to LgarGaran
	@OneToMany(mappedBy="ftdcTipdoc")
	private List<LgarGaran> lgarGarans;

	public FtdcTipdoc() {
	}

	public long getTdcSecuen() {
		return this.tdcSecuen;
	}

	public void setTdcSecuen(long tdcSecuen) {
		this.tdcSecuen = tdcSecuen;
	}

	public String getTdcAbrevi() {
		return this.tdcAbrevi;
	}

	public void setTdcAbrevi(String tdcAbrevi) {
		this.tdcAbrevi = tdcAbrevi;
	}

	public String getTdcDocume() {
		return this.tdcDocume;
	}

	public void setTdcDocume(String tdcDocume) {
		this.tdcDocume = tdcDocume;
	}

	public List<LgarGaran> getLgarGarans() {
		return this.lgarGarans;
	}

	public void setLgarGarans(List<LgarGaran> lgarGarans) {
		this.lgarGarans = lgarGarans;
	}

	public LgarGaran addLgarGaran(LgarGaran lgarGaran) {
		getLgarGarans().add(lgarGaran);
		lgarGaran.setFtdcTipdoc(this);

		return lgarGaran;
	}

	public LgarGaran removeLgarGaran(LgarGaran lgarGaran) {
		getLgarGarans().remove(lgarGaran);
		lgarGaran.setFtdcTipdoc(null);

		return lgarGaran;
	}

}