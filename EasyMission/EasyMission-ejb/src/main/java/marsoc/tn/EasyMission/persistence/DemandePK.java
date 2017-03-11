package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DemandeFK
 *
 */
@Embeddable

public class DemandePK implements Serializable {

	
	
	private int AgentFK;
	private JobOffersPK jobOfferPK;
	private static final long serialVersionUID = 1L;


	public int getAgentFK() {
		return this.AgentFK;
	}

	public void setAgentFK(int AgentFK) {
		this.AgentFK = AgentFK;
	}   
  



	public JobOffersPK getJobOfferPK() {
		return jobOfferPK;
	}

	public void setJobOfferPK(JobOffersPK jobOfferPK) {
		this.jobOfferPK = jobOfferPK;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + AgentFK;
		result = prime * result + ((jobOfferPK == null) ? 0 : jobOfferPK.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemandePK other = (DemandePK) obj;
		if (AgentFK != other.AgentFK)
			return false;
		if (jobOfferPK == null) {
			if (other.jobOfferPK != null)
				return false;
		} else if (!jobOfferPK.equals(other.jobOfferPK))
			return false;
		return true;
	}

	
   
}
