package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FFIN_FORMAING database table.
 * 
 */
@Entity
@Table(name="FFIN_FORMAING")
@NamedQuery(name="FfinFormaing.findAll", query="SELECT f FROM FfinFormaing f")
public class FfinFormaing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FIN_SECUEN")
	private long finSecuen;

	@Column(name="FIN_DESCRI")
	private String finDescri;

	//bi-directional many-to-one association to FiarIngartic
	@OneToMany(mappedBy="ffinFormaing")
	private List<FiarIngartic> fiarIngartics;

	public FfinFormaing() {
	}

	public long getFinSecuen() {
		return this.finSecuen;
	}

	public void setFinSecuen(long finSecuen) {
		this.finSecuen = finSecuen;
	}

	public String getFinDescri() {
		return this.finDescri;
	}

	public void setFinDescri(String finDescri) {
		this.finDescri = finDescri;
	}

	public List<FiarIngartic> getFiarIngartics() {
		return this.fiarIngartics;
	}

	public void setFiarIngartics(List<FiarIngartic> fiarIngartics) {
		this.fiarIngartics = fiarIngartics;
	}

	public FiarIngartic addFiarIngartic(FiarIngartic fiarIngartic) {
		getFiarIngartics().add(fiarIngartic);
		fiarIngartic.setFfinFormaing(this);

		return fiarIngartic;
	}

	public FiarIngartic removeFiarIngartic(FiarIngartic fiarIngartic) {
		getFiarIngartics().remove(fiarIngartic);
		fiarIngartic.setFfinFormaing(null);

		return fiarIngartic;
	}

}