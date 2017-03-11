package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
@DiscriminatorValue(value="Client")
public class Client extends User implements Serializable {

	private List<JobOffers>job_offers;
	private List<AchatDeal>Achat_Deal;
	private static final long serialVersionUID = 1L;

	@OneToMany
	public List<JobOffers> getJob_offers() {
		return job_offers;
	}

	public void setJob_offers(List<JobOffers> job_offers) {
		this.job_offers = job_offers;
	}

	@OneToMany
	public List<AchatDeal> getAchat_Deal() {
		return Achat_Deal;
	}

	public void setAchat_Deal(List<AchatDeal> achat_Deal) {
		Achat_Deal = achat_Deal;
	}





	
   
}
