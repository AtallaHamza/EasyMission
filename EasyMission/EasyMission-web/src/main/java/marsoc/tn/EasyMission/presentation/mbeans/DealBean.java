package marsoc.tn.EasyMission.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import marsoc.tn.EasyMission.persistence.Deal;
import marsoc.tn.EasyMission.services.IRemoteGestionDeal;

@ManagedBean
@SessionScoped

public class DealBean {

	private Deal deal = new Deal();
	@EJB
	IRemoteGestionDeal GDeal ;
	
	public String CreateUser() {
		  GDeal.ajouterDeal(deal);
		  return("Deal/Home?faces-redirect=true");
		}
}
