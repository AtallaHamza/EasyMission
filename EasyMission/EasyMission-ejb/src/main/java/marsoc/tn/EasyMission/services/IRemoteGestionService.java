package marsoc.tn.EasyMission.services;

import javax.ejb.Remote;

import marsoc.tn.EasyMission.persistence.Service;


@Remote
public interface IRemoteGestionService {

	void ajouterService(Service service);

	void supprimerService(Service service);

	void modifierService(Service service);

}
