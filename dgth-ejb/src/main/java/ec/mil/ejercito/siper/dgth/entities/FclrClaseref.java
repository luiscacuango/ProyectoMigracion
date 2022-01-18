package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FCLR_CLASEREF database table.
 * 
 */
@Entity
@Table(name="FCLR_CLASEREF")
@NamedQuery(name="FclrClaseref.findAll", query="SELECT f FROM FclrClaseref f")
public class FclrClaseref implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FCLR_CODIGO")
	private long fclrCodigo;

	@Column(name="FCLR_DESCRIPCION")
	private String fclrDescripcion;

	@Column(name="FCLR_SIGLAS")
	private String fclrSiglas;

	public FclrClaseref() {
	}

	public long getFclrCodigo() {
		return this.fclrCodigo;
	}

	public void setFclrCodigo(long fclrCodigo) {
		this.fclrCodigo = fclrCodigo;
	}

	public String getFclrDescripcion() {
		return this.fclrDescripcion;
	}

	public void setFclrDescripcion(String fclrDescripcion) {
		this.fclrDescripcion = fclrDescripcion;
	}

	public String getFclrSiglas() {
		return this.fclrSiglas;
	}

	public void setFclrSiglas(String fclrSiglas) {
		this.fclrSiglas = fclrSiglas;
	}

}