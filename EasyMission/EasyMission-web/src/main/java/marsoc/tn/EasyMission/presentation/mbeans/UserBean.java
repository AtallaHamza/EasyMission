package marsoc.tn.EasyMission.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import marsoc.tn.EasyMission.persistence.User;
import marsoc.tn.EasyMission.services.IRemoteGestionUser;

@ManagedBean
@SessionScoped
public class UserBean {

	private User user = new User();
	@EJB
	IRemoteGestionUser GUser ;
	
	public String CreateUser() {
		  GUser.ajouterUser(user);
		  return("User/Home?faces-redirect=true");
		}
}
