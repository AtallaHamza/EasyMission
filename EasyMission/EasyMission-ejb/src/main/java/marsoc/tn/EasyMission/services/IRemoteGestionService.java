package marsoc.tn.EasyMission.services;

import java.util.List;

import javax.ejb.Remote;

import marsoc.tn.EasyMission.persistence.Service;
import marsoc.tn.EasyMission.persistence.User;


@Remote
public interface IRemoteGestionService {

	void ajouterService(Service service);

	void supprimerService(Service service);

	void modifierService(Service service);
	List<Service> recupereService();
}
