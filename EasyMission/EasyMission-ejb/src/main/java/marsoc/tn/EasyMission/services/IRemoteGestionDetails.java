package marsoc.tn.EasyMission.services;

import javax.ejb.Remote;

import marsoc.tn.EasyMission.persistence.Details;

@Remote
public interface IRemoteGestionDetails {
	
	void ajouterDetails(Details D);
	void supprimerDetails( Details D);
	void modiferDetails (Details D);
}
