package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FMAT_MATRIZ_CONTABLE database table.
 * 
 */
@Entity
@Table(name="FMAT_MATRIZ_CONTABLE")
@NamedQuery(name="FmatMatrizContable.findAll", query="SELECT f FROM FmatMatrizContable f")
public class FmatMatrizContable implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FmatMatrizContablePK id;

	@Column(name="MAT_TIPO_MOV")
	private String matTipoMov;

	public FmatMatrizContable() {
	}

	public FmatMatrizContablePK getId() {
		return this.id;
	}

	public void setId(FmatMatrizContablePK id) {
		this.id = id;
	}

	public String getMatTipoMov() {
		return this.matTipoMov;
	}

	public void setMatTipoMov(String matTipoMov) {
		this.matTipoMov = matTipoMov;
	}

}