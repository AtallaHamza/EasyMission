package marsoc.tn.EasyMission.presentation.mbeans;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import marsoc.tn.EasyMission.persistence.User;

@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView   implements Serializable{
	
	private List<User> cars;	
    
    @ManagedProperty("#{carService}")
    private UserService service;
 
    @PostConstruct
    public void init() {
       // cars = service.createCars(10);
    	cars=service.getUser();
    	//System.out.print("init");
    }
     
    public List<User> getCars() {
        return cars;
    }
 
    public void setService(UserService service) {
        this.service = service;
    }
}
