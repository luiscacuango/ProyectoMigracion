package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FDPN_DEPENDENCIA database table.
 * 
 */
@Entity
@Table(name="FDPN_DEPENDENCIA")
@NamedQuery(name="FdpnDependencia.findAll", query="SELECT f FROM FdpnDependencia f")
public class FdpnDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DPN_CODIGO")
	private String dpnCodigo;

	@Column(name="DPN_DESCRIPCION")
	private String dpnDescripcion;

	@Column(name="DPN_SIGLAS")
	private String dpnSiglas;

	//bi-directional many-to-one association to FencDependencia
	@OneToMany(mappedBy="fdpnDependencia")
	private List<FencDependencia> fencDependencias;

	public FdpnDependencia() {
	}

	public String getDpnCodigo() {
		return this.dpnCodigo;
	}

	public void setDpnCodigo(String dpnCodigo) {
		this.dpnCodigo = dpnCodigo;
	}

	public String getDpnDescripcion() {
		return this.dpnDescripcion;
	}

	public void setDpnDescripcion(String dpnDescripcion) {
		this.dpnDescripcion = dpnDescripcion;
	}

	public String getDpnSiglas() {
		return this.dpnSiglas;
	}

	public void setDpnSiglas(String dpnSiglas) {
		this.dpnSiglas = dpnSiglas;
	}

	public List<FencDependencia> getFencDependencias() {
		return this.fencDependencias;
	}

	public void setFencDependencias(List<FencDependencia> fencDependencias) {
		this.fencDependencias = fencDependencias;
	}

	public FencDependencia addFencDependencia(FencDependencia fencDependencia) {
		getFencDependencias().add(fencDependencia);
		fencDependencia.setFdpnDependencia(this);

		return fencDependencia;
	}

	public FencDependencia removeFencDependencia(FencDependencia fencDependencia) {
		getFencDependencias().remove(fencDependencia);
		fencDependencia.setFdpnDependencia(null);

		return fencDependencia;
	}

}