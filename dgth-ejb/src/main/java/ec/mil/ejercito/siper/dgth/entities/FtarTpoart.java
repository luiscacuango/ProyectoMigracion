package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FTAR_TPOART database table.
 * 
 */
@Entity
@Table(name="FTAR_TPOART")
@NamedQuery(name="FtarTpoart.findAll", query="SELECT f FROM FtarTpoart f")
public class FtarTpoart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FTA_CODIGO")
	private String ftaCodigo;

	//bi-directional many-to-one association to FcarActivo
	@OneToMany(mappedBy="ftarTpoart")
	private List<FcarActivo> fcarActivos;

	public FtarTpoart() {
	}

	public String getFtaCodigo() {
		return this.ftaCodigo;
	}

	public void setFtaCodigo(String ftaCodigo) {
		this.ftaCodigo = ftaCodigo;
	}

	public List<FcarActivo> getFcarActivos() {
		return this.fcarActivos;
	}

	public void setFcarActivos(List<FcarActivo> fcarActivos) {
		this.fcarActivos = fcarActivos;
	}

	public FcarActivo addFcarActivo(FcarActivo fcarActivo) {
		getFcarActivos().add(fcarActivo);
		fcarActivo.setFtarTpoart(this);

		return fcarActivo;
	}

	public FcarActivo removeFcarActivo(FcarActivo fcarActivo) {
		getFcarActivos().remove(fcarActivo);
		fcarActivo.setFtarTpoart(null);

		return fcarActivo;
	}

}