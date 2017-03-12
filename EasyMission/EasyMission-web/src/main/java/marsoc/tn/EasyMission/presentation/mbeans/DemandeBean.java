package marsoc.tn.EasyMission.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import marsoc.tn.EasyMission.persistence.Demande;
import marsoc.tn.EasyMission.services.IRemoteGestionDemande;

@ManagedBean
@SessionScoped

public class DemandeBean {

	private Demande Dem = new Demande();
	@EJB
	IRemoteGestionDemande GD ;
	
	public String CreateUser() {
		  GD.ajouterDemande(Dem);
		  return("Demande/Home?faces-redirect=true");
		}
}
