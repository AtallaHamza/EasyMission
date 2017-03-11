package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Demande
 *
 */
@Entity
@Table(name="Demande")
public class Demande implements Serializable {
	
	private DemandePK demandePK;
	private boolean etatPayment;
	private boolean etatReservation;
	private boolean etatJobDone;
	private JobOffers job_offers;
	private Agent agent;
	private static final long serialVersionUID = 1L;

	
	@EmbeddedId
	public DemandePK getDemandeFK() {
		return demandePK;
	}

	public void setDemandeFK(DemandePK demandePK) {
		this.demandePK = demandePK;
	}

	@ManyToOne
	@JoinColumns({
	        @JoinColumn(name="ClientFK", referencedColumnName="ClientFK", insertable=false , updatable=false),
	        @JoinColumn(name="SServiceFK", referencedColumnName="SServiceFK" , insertable=false , updatable=false),
	        @JoinColumn(name="DateOffer", referencedColumnName="DateOffer", insertable=false , updatable=false)
	    })	
	public JobOffers getJob_offers() {
		return job_offers;
	}

	public void setJob_offers(JobOffers job_offers) {
		this.job_offers = job_offers;
	}

	@ManyToOne
	@JoinColumn(name="FK_Agent", insertable=false , updatable=false )
	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public boolean isEtatPayment() {
		return etatPayment;
	}

	public void setEtatPayment(boolean etatPayment) {
		this.etatPayment = etatPayment;
	}

	public boolean isEtatJobDone() {
		return etatJobDone;
	}

	public void setEtatJobDone(boolean etatJobDone) {
		this.etatJobDone = etatJobDone;
	}

	public boolean isEtatReservation() {
		return etatReservation;
	}

	public void setEtatReservation(boolean etatReservation) {
		this.etatReservation = etatReservation;
	}

	
   
}
