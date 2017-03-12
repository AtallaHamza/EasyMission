package marsoc.tn.EasyMission.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import marsoc.tn.EasyMission.persistence.JobOffers;
import marsoc.tn.EasyMission.services.IRemoteGetsionJobOffer;

@ManagedBean
@SessionScoped

public class JobOfferBean {

	private JobOffers JO = new JobOffers();
	@EJB
	IRemoteGetsionJobOffer GJO ;
	
	public String CreateUser() {
		  GJO.ajouterJobOffer(JO);
		  return("JobOffer/Home?faces-redirect=true");
		}
}
