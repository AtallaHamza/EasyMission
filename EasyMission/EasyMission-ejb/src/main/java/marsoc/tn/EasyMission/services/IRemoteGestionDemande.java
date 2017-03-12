package marsoc.tn.EasyMission.services;

import javax.ejb.Remote;

import marsoc.tn.EasyMission.persistence.Demande;

@Remote
public interface IRemoteGestionDemande {

	void ajouterDemande(Demande D);

	void supprimerDemande(Demande D);

	void modifierDemande(Demande D);
}
