/**
 * 
 */
package ec.mil.ejercito.siper.dgth.controllers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.mil.ejercito.siper.dgth.entities.FasiModelo;

/**
 * @author luigi
 *
 */
@Stateless
public class ModelosController extends AbstractController<FasiModelo> {

	@PersistenceContext(unitName = "finanzasPU")
	private EntityManager em;
	
	public ModelosController(FasiModelo entidad) {
		super(entidad);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
