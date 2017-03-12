package marsoc.tn.EasyMission.services;

import javax.ejb.Remote;

import marsoc.tn.EasyMission.persistence.User;


@Remote
public interface IRemoteGestionUser {

	void ajouterUser(User user);

	void supprimerUser(User user);

	void modifierUser(User user);

}
