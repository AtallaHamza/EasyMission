package marsoc.tn.EasyMission.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import marsoc.tn.EasyMission.persistence.Details;

@Stateless
public class GestionDetails implements IRemoteGestionDetails {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void ajouterDetails(Details D) {
	em.persist(D);	
	}

	@Override
	public void supprimerDetails(Details D) {
		em.remove(em.merge(D));
	}

	@Override
	public void modiferDetails(Details D) {
		em.merge(D);
	}

}
