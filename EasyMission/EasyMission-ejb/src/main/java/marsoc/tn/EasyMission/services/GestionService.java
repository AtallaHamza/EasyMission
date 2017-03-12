package marsoc.tn.EasyMission.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import marsoc.tn.EasyMission.persistence.Service;

@Stateless
public class GestionService implements IRemoteGestionService {

	@PersistenceContext
	EntityManager em ;
	
	@Override
	public void ajouterService(Service service) {
		em.persist(service);
	}

	@Override
	public void supprimerService(Service service) {
		em.remove(em.merge(service));
	}

	@Override
	public void modifierService(Service service) {

		em.merge(service);
	}

}
