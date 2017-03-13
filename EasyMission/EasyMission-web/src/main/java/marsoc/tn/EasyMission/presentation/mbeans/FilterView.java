package marsoc.tn.EasyMission.presentation.mbeans;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import marsoc.tn.EasyMission.persistence.User;

@ManagedBean(name="dtFilterView")
@ViewScoped
public class FilterView {

	 private List<User> cars;
     
	    private List<User> filteredCars;
	     
	    @ManagedProperty("#{carService}")
	    private UserService service;
	 
	    @PostConstruct
	    public void init() {
	       // cars = service.createCars(10);
	    	cars=service.getUser();
	    	//System.out.print("init");
	    }
	    public boolean filterByPrice(Object value, Object filter, Locale locale) {
	        String filterText = (filter == null) ? null : filter.toString().trim();
	        boolean a=true;
	        if(filterText == null||filterText.equals("")) {
	        	a=true;
	            return a;
	        }
	         
	        if(value == null) {
	        	
	            return !a;
	        }
	         
	        return a;
	    }

		public List<User> getCars() {
			return cars;
		}

		public void setCars(List<User> cars) {
			this.cars = cars;
		}

		public List<User> getFilteredCars() {
			return filteredCars;
		}

		public void setFilteredCars(List<User> filteredCars) {
			this.filteredCars = filteredCars;
		}

	    public void setService(UserService service) {
	        this.service = service;
	    } 
}
