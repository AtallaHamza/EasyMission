package marsoc.tn.EasyMission.services;

import javax.ejb.Remote;

import marsoc.tn.EasyMission.persistence.JobOffers;

@Remote
public interface IRemoteGetsionJobOffer {


   	void ajouterJobOffer(JobOffers Jb);

	void supprimerJobOffer(JobOffers Jb);

	void modifierJobOffer(JobOffers Jb);


}
