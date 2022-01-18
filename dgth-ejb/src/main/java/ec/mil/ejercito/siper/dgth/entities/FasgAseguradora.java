package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FASG_ASEGURADORAS database table.
 * 
 */
@Entity
@Table(name="FASG_ASEGURADORAS")
@NamedQuery(name="FasgAseguradora.findAll", query="SELECT f FROM FasgAseguradora f")
public class FasgAseguradora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ASG_SECASG")
	private long asgSecasg;

	@Column(name="ASG_NOMBRE")
	private String asgNombre;

	public FasgAseguradora() {
	}

	public long getAsgSecasg() {
		return this.asgSecasg;
	}

	public void setAsgSecasg(long asgSecasg) {
		this.asgSecasg = asgSecasg;
	}

	public String getAsgNombre() {
		return this.asgNombre;
	}

	public void setAsgNombre(String asgNombre) {
		this.asgNombre = asgNombre;
	}

}