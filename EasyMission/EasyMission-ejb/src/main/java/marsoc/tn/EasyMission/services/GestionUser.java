package marsoc.tn.EasyMission.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.TypedQuery;
import marsoc.tn.EasyMission.persistence.User;

@Stateless
public class GestionUser implements IRemoteGestionUser {

	@PersistenceContext
	EntityManager em;

	@Override
	public void ajouterUser(User user) {

		em.persist(user);
		
	}

	@Override
	public void supprimerUser(User user) {
		em.remove(em.merge(user));
		
	}

	@Override
	public void modifierUser(User user) {
		em.merge(user);
	}

	@Override
	public List<User> afficherUser() {
		TypedQuery<User> query =  em.createQuery("select h from User h", User.class);
		return query.getResultList();
	}

	
}
