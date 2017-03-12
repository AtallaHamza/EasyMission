package marsoc.tn.EasyMission.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import marsoc.tn.EasyMission.persistence.Details;
import marsoc.tn.EasyMission.services.IRemoteGestionDetails;

@ManagedBean
@SessionScoped

public class DeatailsBean {

	private Details Dt = new Details();
	@EJB
	IRemoteGestionDetails GD ;
	
	public String CreateUser() {
		  GD.ajouterDetails(Dt);
		  return("Details/Home?faces-redirect=true");
		}
}
