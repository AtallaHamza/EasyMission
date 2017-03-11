package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Agent
 *
 */
@Entity
@DiscriminatorValue(value="Agent")
public class Agent extends User implements Serializable {

	private List<Details> details;
	private List<Deal> deals;
	private List<Demande> demandes;
	private static final long serialVersionUID = 1L;
	@OneToMany
	public List<Details> getDetails() {
		return details;
	}
	public void setDetails(List<Details> details) {
		this.details = details;
	}
	@OneToMany
	public List<Demande> getDemandes() {
		return demandes;
	}
	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}
	@OneToMany
	public List<Deal> getDeals() {
		return deals;
	}
	public void setDeals(List<Deal> deals) {
		this.deals = deals;
	}


   
}
