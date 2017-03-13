package marsoc.tn.EasyMission.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import marsoc.tn.EasyMission.persistence.Service;
import marsoc.tn.EasyMission.persistence.User;

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

	@Override
	public List<Service> recupereService() {
		TypedQuery<Service> query =  em.createQuery("select h from Service h", Service.class);
		return query.getResultList();
	}
	

}
