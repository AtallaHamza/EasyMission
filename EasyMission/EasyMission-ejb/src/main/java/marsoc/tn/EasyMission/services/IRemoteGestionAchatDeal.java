package marsoc.tn.EasyMission.services;

import javax.ejb.Remote;

import marsoc.tn.EasyMission.persistence.AchatDeal;

@Remote
public interface IRemoteGestionAchatDeal {

	void AjouterAchatDeal ( AchatDeal AD);
	void SupprimerAchatDeal (AchatDeal AD);
	void ModiferAchatDeal (AchatDeal AD);
}
