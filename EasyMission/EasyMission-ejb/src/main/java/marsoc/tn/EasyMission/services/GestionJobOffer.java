package marsoc.tn.EasyMission.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import marsoc.tn.EasyMission.persistence.JobOffers;

@Stateless
public class GestionJobOffer implements IRemoteGetsionJobOffer {

	

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void ajouterJobOffer(JobOffers Jb) {

		em.persist(Jb);
	}

	@Override
	public void supprimerJobOffer(JobOffers Jb) {
		em.remove(em.merge(Jb));
	}

	@Override
	public void modifierJobOffer(JobOffers Jb) {

		em.merge(Jb);
	}

}
