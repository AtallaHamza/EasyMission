package marsoc.tn.EasyMission.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import marsoc.tn.EasyMission.persistence.Deal;

@Stateless
public class GestionDeal implements IRemoteGestionDeal {

	@PersistenceContext
	EntityManager em;
	@Override
	public void ajouterDeal(Deal deal) {
		em.persist(deal);
	}

	@Override
	public void supprimerDeal(Deal deal) {
		em.remove(em.merge(deal));
	}

	@Override
	public void modifierDeal(Deal deal) {
		em.merge(deal);
	}

}
