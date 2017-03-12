package marsoc.tn.EasyMission.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import marsoc.tn.EasyMission.persistence.AchatDeal;
import marsoc.tn.EasyMission.services.IRemoteGestionAchatDeal;

@ManagedBean
@SessionScoped

public class AchatDealBean {

	private AchatDeal AD = new AchatDeal();
	@EJB
	IRemoteGestionAchatDeal GAD ;
	
	public String CreateUser() {
		  GAD.AjouterAchatDeal(AD);
		  return("AchatDeal/Home?faces-redirect=true");
		}
	
}
