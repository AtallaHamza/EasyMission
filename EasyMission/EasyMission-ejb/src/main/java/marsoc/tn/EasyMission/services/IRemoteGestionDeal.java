package marsoc.tn.EasyMission.services;

import javax.ejb.Remote;

import marsoc.tn.EasyMission.persistence.Deal;


@Remote
public interface IRemoteGestionDeal {
	
	void ajouterDeal(Deal deal);

	void supprimerDeal(Deal deal);

	void modifierDeal(Deal deal);
}
