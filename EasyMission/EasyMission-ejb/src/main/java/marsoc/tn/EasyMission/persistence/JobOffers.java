package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Job_Offers
 *
 */
@Entity

public class JobOffers implements Serializable {
	private JobOffersPK Job_OffersPK;
	private int Duree;
	private Client client;
	private SousServices sous_service;
	private List<Demande> demandes;
	private static final long serialVersionUID = 1L;
	
	
	@ManyToOne
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	@ManyToOne
	public SousServices getSous_service() {
		return sous_service;
	}
	public void setSous_service(SousServices sous_service) {
		this.sous_service = sous_service;
	}
	@EmbeddedId
	public JobOffersPK getJob_OffersPK() {
		return Job_OffersPK;
	}
	public void setJob_OffersPK(JobOffersPK job_OffersPK) {
		Job_OffersPK = job_OffersPK;
	}
	@OneToMany
	public List<Demande> getDemandes() {
		return demandes;
	}
	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}
	
	public int getDuree() {
		return Duree;
	}
	public void setDuree(int duree) {
		Duree = duree;
	}


   
}
