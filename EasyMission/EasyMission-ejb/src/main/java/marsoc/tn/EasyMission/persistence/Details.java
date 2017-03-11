package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Details
 *
 */
@Entity

public class Details implements Serializable {

	private DetailsPK detailsPK;
	private Agent agent;
	private SousServices sous_service;
	private static final long serialVersionUID = 1L;
	
	
	@EmbeddedId
	public DetailsPK getDetailsPK() {
		return detailsPK;
	}
	public void setDetailsPK(DetailsPK detailsPK) {
		this.detailsPK = detailsPK;
	}
	@ManyToOne
	@JoinColumn(name="FK_Agent", insertable=false , updatable=false )
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	@ManyToOne
	@JoinColumn(name="FK_SServices", insertable=false , updatable=false )
	public SousServices getSous_service() {
		return sous_service;
	}
	public void setSous_service(SousServices sous_service) {
		this.sous_service = sous_service;
	}


   
}
