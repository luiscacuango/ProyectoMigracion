package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FTDR_TIPDESREN database table.
 * 
 */
@Entity
@Table(name="FTDR_TIPDESREN")
@NamedQuery(name="FtdrTipdesren.findAll", query="SELECT f FROM FtdrTipdesren f")
public class FtdrTipdesren implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TDR_SECUENCIA")
	private long tdrSecuencia;

	@Column(name="TDR_DESCRIPCION")
	private String tdrDescripcion;

	//bi-directional many-to-one association to FpdrPordesren
	@OneToMany(mappedBy="ftdrTipdesren")
	private List<FpdrPordesren> fpdrPordesrens;

	public FtdrTipdesren() {
	}

	public long getTdrSecuencia() {
		return this.tdrSecuencia;
	}

	public void setTdrSecuencia(long tdrSecuencia) {
		this.tdrSecuencia = tdrSecuencia;
	}

	public String getTdrDescripcion() {
		return this.tdrDescripcion;
	}

	public void setTdrDescripcion(String tdrDescripcion) {
		this.tdrDescripcion = tdrDescripcion;
	}

	public List<FpdrPordesren> getFpdrPordesrens() {
		return this.fpdrPordesrens;
	}

	public void setFpdrPordesrens(List<FpdrPordesren> fpdrPordesrens) {
		this.fpdrPordesrens = fpdrPordesrens;
	}

	public FpdrPordesren addFpdrPordesren(FpdrPordesren fpdrPordesren) {
		getFpdrPordesrens().add(fpdrPordesren);
		fpdrPordesren.setFtdrTipdesren(this);

		return fpdrPordesren;
	}

	public FpdrPordesren removeFpdrPordesren(FpdrPordesren fpdrPordesren) {
		getFpdrPordesrens().remove(fpdrPordesren);
		fpdrPordesren.setFtdrTipdesren(null);

		return fpdrPordesren;
	}

}