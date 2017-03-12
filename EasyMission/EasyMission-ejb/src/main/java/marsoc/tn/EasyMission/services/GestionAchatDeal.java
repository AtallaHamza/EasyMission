package marsoc.tn.EasyMission.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import marsoc.tn.EasyMission.persistence.AchatDeal;

@Stateless
public class GestionAchatDeal implements IRemoteGestionAchatDeal{

	@PersistenceContext
	EntityManager em;
	@Override
	public void AjouterAchatDeal(AchatDeal AD) {

		em.persist(AD);
	}

	@Override
	public void SupprimerAchatDeal(AchatDeal AD) {

		em.remove(em.merge(AD));
	}

	@Override
	public void ModiferAchatDeal(AchatDeal AD) {
		em.merge(AD);
	}

}
