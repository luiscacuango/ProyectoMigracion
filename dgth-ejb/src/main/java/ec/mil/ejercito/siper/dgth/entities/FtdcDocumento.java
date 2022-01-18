package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FTDC_DOCUMENTO database table.
 * 
 */
@Entity
@Table(name="FTDC_DOCUMENTO")
@NamedQuery(name="FtdcDocumento.findAll", query="SELECT f FROM FtdcDocumento f")
public class FtdcDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TDC_SECUEN")
	private long tdcSecuen;

	@Column(name="TDC_ABREVI")
	private String tdcAbrevi;

	@Column(name="TDC_MODULO")
	private String tdcModulo;

	@Column(name="TDC_NOMDOC")
	private String tdcNomdoc;

	@Column(name="TDC_TIPO")
	private String tdcTipo;

	//bi-directional many-to-one association to FdaaAuxiliar
	@OneToMany(mappedBy="ftdcDocumento")
	private List<FdaaAuxiliar> fdaaAuxiliars;

	public FtdcDocumento() {
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

	public String getTdcModulo() {
		return this.tdcModulo;
	}

	public void setTdcModulo(String tdcModulo) {
		this.tdcModulo = tdcModulo;
	}

	public String getTdcNomdoc() {
		return this.tdcNomdoc;
	}

	public void setTdcNomdoc(String tdcNomdoc) {
		this.tdcNomdoc = tdcNomdoc;
	}

	public String getTdcTipo() {
		return this.tdcTipo;
	}

	public void setTdcTipo(String tdcTipo) {
		this.tdcTipo = tdcTipo;
	}

	public List<FdaaAuxiliar> getFdaaAuxiliars() {
		return this.fdaaAuxiliars;
	}

	public void setFdaaAuxiliars(List<FdaaAuxiliar> fdaaAuxiliars) {
		this.fdaaAuxiliars = fdaaAuxiliars;
	}

	public FdaaAuxiliar addFdaaAuxiliar(FdaaAuxiliar fdaaAuxiliar) {
		getFdaaAuxiliars().add(fdaaAuxiliar);
		fdaaAuxiliar.setFtdcDocumento(this);

		return fdaaAuxiliar;
	}

	public FdaaAuxiliar removeFdaaAuxiliar(FdaaAuxiliar fdaaAuxiliar) {
		getFdaaAuxiliars().remove(fdaaAuxiliar);
		fdaaAuxiliar.setFtdcDocumento(null);

		return fdaaAuxiliar;
	}

}