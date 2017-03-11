package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Deal
 *
 */
@Entity

public class Deal implements Serializable {

	
	private DealPK dealPK;
	private Agent agent;
	private SousServices sous_service;
	private float Prix;
	private int nbr_disponible;
	private List<AchatDeal>Achat_Deal;
	private static final long serialVersionUID = 1L;

	 
	public float getPrix() {
		return this.Prix;
	}

	public void setPrix(float Prix) {
		this.Prix = Prix;
	}   
	public int getNbr_disponible() {
		return this.nbr_disponible;
	}

	public void setNbr_disponible(int nbr_disponible) {
		this.nbr_disponible = nbr_disponible;
	}

	@EmbeddedId
	public DealPK getDealPK() {
		return dealPK;
	}

	public void setDealPK(DealPK dealPK) {
		this.dealPK = dealPK;
	}

	@ManyToOne
	@JoinColumn(name="FK_Agent" , insertable=false , updatable=false)
	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	@ManyToOne
	@JoinColumn(name="FK_SService" , insertable=false , updatable=false)
	public SousServices getSous_service() {
		return sous_service;
	}

	public void setSous_service(SousServices sous_service) {
		this.sous_service = sous_service;
	}

	@OneToMany
	public List<AchatDeal> getAchat_Deal() {
		return Achat_Deal;
	}

	public void setAchat_Deal(List<AchatDeal> achat_Deal) {
		Achat_Deal = achat_Deal;
	}
   
}
