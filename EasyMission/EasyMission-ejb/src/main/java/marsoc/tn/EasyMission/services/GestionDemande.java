package marsoc.tn.EasyMission.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import marsoc.tn.EasyMission.persistence.Demande;

@Stateless
public class GestionDemande implements IRemoteGestionDemande {

	@PersistenceContext
	EntityManager em;
	@Override
	public void ajouterDemande(Demande D) {

		em.persist(D);
	}

	@Override
	public void supprimerDemande(Demande D) {
		em.remove(em.merge(D));
	}

	@Override
	public void modifierDemande(Demande D) {
		em.merge(D);
	}
	

}
