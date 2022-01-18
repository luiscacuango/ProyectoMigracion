package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FSUB_SISTEMAS database table.
 * 
 */
@Entity
@Table(name="FSUB_SISTEMAS")
@NamedQuery(name="FsubSistema.findAll", query="SELECT f FROM FsubSistema f")
public class FsubSistema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SUB_CODIGO")
	private long subCodigo;

	@Column(name="SUB_NOMBRE")
	private String subNombre;

	//bi-directional many-to-one association to FasiModelo
	@OneToMany(mappedBy="fsubSistema")
	private List<FasiModelo> fasiModelos;

	public FsubSistema() {
	}

	public long getSubCodigo() {
		return this.subCodigo;
	}

	public void setSubCodigo(long subCodigo) {
		this.subCodigo = subCodigo;
	}

	public String getSubNombre() {
		return this.subNombre;
	}

	public void setSubNombre(String subNombre) {
		this.subNombre = subNombre;
	}

	public List<FasiModelo> getFasiModelos() {
		return this.fasiModelos;
	}

	public void setFasiModelos(List<FasiModelo> fasiModelos) {
		this.fasiModelos = fasiModelos;
	}

	public FasiModelo addFasiModelo(FasiModelo fasiModelo) {
		getFasiModelos().add(fasiModelo);
		fasiModelo.setFsubSistema(this);

		return fasiModelo;
	}

	public FasiModelo removeFasiModelo(FasiModelo fasiModelo) {
		getFasiModelos().remove(fasiModelo);
		fasiModelo.setFsubSistema(null);

		return fasiModelo;
	}

}