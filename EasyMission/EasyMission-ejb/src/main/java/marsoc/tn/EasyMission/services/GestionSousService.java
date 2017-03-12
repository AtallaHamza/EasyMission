package marsoc.tn.EasyMission.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import marsoc.tn.EasyMission.persistence.SousServices;

@Stateless
public class GestionSousService implements IRemoteGestionSousService {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void ajouterSousServce(SousServices SS) {
		em.persist(SS);
		
	}

	@Override
	public void supprimerSousServce(SousServices SS) {

		em.remove(em.merge(SS));
	}

	@Override
	public void modifierSousServce(SousServices SS) {
		em.merge(SS);
	}

}
