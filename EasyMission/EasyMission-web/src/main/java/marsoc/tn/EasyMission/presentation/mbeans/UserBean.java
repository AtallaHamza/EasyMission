package marsoc.tn.EasyMission.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;
import javax.faces.application.FacesMessage;
import marsoc.tn.EasyMission.persistence.User;
import marsoc.tn.EasyMission.services.IRemoteGestionUser;

@ManagedBean(name="userWizard")
@SessionScoped
public class UserBean {

	private User user = new User();
	private String password5;
	
	@EJB
	IRemoteGestionUser GUser ;
	
	private boolean skip;
	
	
	public User getUser() {
        return user;
    }
 
    public void setUser(User user) {
        this.user = user;
    }
    
    public void save() {        
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + user.getPrenom());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        GUser.ajouterUser(user);
    }
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }

	public String getPassword5() {
		return password5;
	}

	public void setPassword5(String password5) {
		this.password5 = password5;
	}
    
    
    
}
