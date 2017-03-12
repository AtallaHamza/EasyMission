package marsoc.tn.EasyMission.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import marsoc.tn.EasyMission.persistence.SousServices;
import marsoc.tn.EasyMission.services.IRemoteGestionSousService;

@ManagedBean
@SessionScoped

public class SousServiceBean {

	private SousServices SS = new SousServices();
	@EJB
	IRemoteGestionSousService GSService ;
	
	public String CreateUser() {
		  GSService.ajouterSousServce(SS);
		  return("SousService/Home?faces-redirect=true");
		}
}
