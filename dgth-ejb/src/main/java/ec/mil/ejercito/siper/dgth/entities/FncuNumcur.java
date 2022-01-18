package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FNCU_NUMCUR database table.
 * 
 */
@Entity
@Table(name="FNCU_NUMCUR")
@NamedQuery(name="FncuNumcur.findAll", query="SELECT f FROM FncuNumcur f")
public class FncuNumcur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NCU_SECUEN")
	private long ncuSecuen;

	@Column(name="NCU_DESCRI")
	private String ncuDescri;

	@Temporal(TemporalType.DATE)
	@Column(name="NCU_FECHA")
	private Date ncuFecha;

	@Column(name="NCU_NUMCUR")
	private String ncuNumcur;

	//bi-directional many-to-one association to LconCtrto
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private LconCtrto lconCtrto;

	public FncuNumcur() {
	}

	public long getNcuSecuen() {
		return this.ncuSecuen;
	}

	public void setNcuSecuen(long ncuSecuen) {
		this.ncuSecuen = ncuSecuen;
	}

	public String getNcuDescri() {
		return this.ncuDescri;
	}

	public void setNcuDescri(String ncuDescri) {
		this.ncuDescri = ncuDescri;
	}

	public Date getNcuFecha() {
		return this.ncuFecha;
	}

	public void setNcuFecha(Date ncuFecha) {
		this.ncuFecha = ncuFecha;
	}

	public String getNcuNumcur() {
		return this.ncuNumcur;
	}

	public void setNcuNumcur(String ncuNumcur) {
		this.ncuNumcur = ncuNumcur;
	}

	public LconCtrto getLconCtrto() {
		return this.lconCtrto;
	}

	public void setLconCtrto(LconCtrto lconCtrto) {
		this.lconCtrto = lconCtrto;
	}

}