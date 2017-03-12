package marsoc.tn.EasyMission.services;

import javax.ejb.Remote;

import marsoc.tn.EasyMission.persistence.SousServices;


@Remote
public interface IRemoteGestionSousService {

	void ajouterSousServce(SousServices SS);

	void supprimerSousServce(SousServices SS);

	void modifierSousServce(SousServices SS);

}
