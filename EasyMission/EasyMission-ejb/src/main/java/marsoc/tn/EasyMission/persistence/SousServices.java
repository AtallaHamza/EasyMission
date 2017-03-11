package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sous_Services
 *
 */
@Entity

public class SousServices implements Serializable {

	   
	
	private int id;
	private float prix;
	private String Nom;
	private String Description;
	private List<Deal> deals;
	private List<Details> details;
	private Service service;
	private List<JobOffers>job_offers;
	private static final long serialVersionUID = 1L;

	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom() {
		return this.Nom;
	}

	public void setNom(String Nom) {
		this.Nom = Nom;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	@OneToMany
	public List<Details> getDetails() {
		return details;
	}

	public void setDetails(List<Details> details) {
		this.details = details;
	}

	@ManyToOne
	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@OneToMany
	public List<JobOffers> getJob_offers() {
		return job_offers;
	}

	public void setJob_offers(List<JobOffers> job_offers) {
		this.job_offers = job_offers;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	@OneToMany
	public List<Deal> getDeals() {
		return deals;
	}

	public void setDeals(List<Deal> deals) {
		this.deals = deals;
	}
   
}
