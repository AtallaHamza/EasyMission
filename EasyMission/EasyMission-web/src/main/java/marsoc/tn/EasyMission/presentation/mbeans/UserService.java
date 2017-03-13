package marsoc.tn.EasyMission.presentation.mbeans;

import java.util.List;


import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import marsoc.tn.EasyMission.persistence.User;
import marsoc.tn.EasyMission.services.IRemoteGestionUser;


@ManagedBean(name = "carService")
@ApplicationScoped
public class UserService {
	
	@EJB
	IRemoteGestionUser GUser ;
	
public List<User> getUser()   {
	return GUser.afficherUser();
			
}
	
	
	
}
