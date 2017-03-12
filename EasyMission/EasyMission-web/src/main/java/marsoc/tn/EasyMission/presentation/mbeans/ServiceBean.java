package marsoc.tn.EasyMission.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import marsoc.tn.EasyMission.persistence.Service;
import marsoc.tn.EasyMission.services.IRemoteGestionService;

@ManagedBean
@SessionScoped
public class ServiceBean {

	private Service service = new Service();
	@EJB
	IRemoteGestionService GService ;
	
	public String CreateUser() {
		  GService.ajouterService(service);
		  return("Service/Home?faces-redirect=true");
		}
}
