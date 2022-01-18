package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FUSU_DATOS database table.
 * 
 */
@Entity
@Table(name="FUSU_DATOS")
@NamedQuery(name="FusuDato.findAll", query="SELECT f FROM FusuDato f")
public class FusuDato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USU_SECUEN")
	private long usuSecuen;

	@Column(name="USU_ESTADO")
	private String usuEstado;

	@Column(name="USU_USUARIO")
	private String usuUsuario;

	//bi-directional many-to-one association to FuniDato
	@OneToMany(mappedBy="fusuDato")
	private List<FuniDato> funiDatos;

	public FusuDato() {
	}

	public long getUsuSecuen() {
		return this.usuSecuen;
	}

	public void setUsuSecuen(long usuSecuen) {
		this.usuSecuen = usuSecuen;
	}

	public String getUsuEstado() {
		return this.usuEstado;
	}

	public void setUsuEstado(String usuEstado) {
		this.usuEstado = usuEstado;
	}

	public String getUsuUsuario() {
		return this.usuUsuario;
	}

	public void setUsuUsuario(String usuUsuario) {
		this.usuUsuario = usuUsuario;
	}

	public List<FuniDato> getFuniDatos() {
		return this.funiDatos;
	}

	public void setFuniDatos(List<FuniDato> funiDatos) {
		this.funiDatos = funiDatos;
	}

	public FuniDato addFuniDato(FuniDato funiDato) {
		getFuniDatos().add(funiDato);
		funiDato.setFusuDato(this);

		return funiDato;
	}

	public FuniDato removeFuniDato(FuniDato funiDato) {
		getFuniDatos().remove(funiDato);
		funiDato.setFusuDato(null);

		return funiDato;
	}

}