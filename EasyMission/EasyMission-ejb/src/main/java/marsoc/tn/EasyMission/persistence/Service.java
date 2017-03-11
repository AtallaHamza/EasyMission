package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Service
 *
 */
@Entity

public class Service implements Serializable {

	   
	
	private int id;
	private String Description;
	private float taux;
	private List<SousServices> sous_service;
	private static final long serialVersionUID = 1L;

	  
	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	@OneToMany(mappedBy="service")
	public List<SousServices> getSous_service() {
		return sous_service;
	}

	public void setSous_service(List<SousServices> sous_service) {
		this.sous_service = sous_service;
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	
   
}
