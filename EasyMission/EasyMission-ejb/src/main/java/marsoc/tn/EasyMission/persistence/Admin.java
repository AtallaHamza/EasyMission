package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Admin")
public class Admin extends User implements Serializable {

	private String AdminEmail;
	private static final long serialVersionUID = 1L;
	
	public String getAdminEmail() {
		return AdminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		AdminEmail = adminEmail;
	}

}
