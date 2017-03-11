package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DealPK
 *
 */
@Embeddable

public class DealPK implements Serializable {

	
	private int FK_Agent;
	private int FK_SService;
	private Date dateDeal;
	private static final long serialVersionUID = 1L;

	@Column(name="FK_Agent")
	public int getFK_Agent() {
		return this.FK_Agent;
	}

	public void setFK_Agent(int FK_Agent) {
		this.FK_Agent = FK_Agent;
	}   
	
	@Column(name="FK_SService")
	public int getFK_SService() {
		return this.FK_SService;
	}

	public void setFK_SService(int FK_SService) {
		this.FK_SService = FK_SService;
	}   
	
	@Column(name="FK_DateDeal")
	public Date getDateDeal() {
		return this.dateDeal;
	}

	public void setDateDeal(Date dateDeal) {
		this.dateDeal = dateDeal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + FK_Agent;
		result = prime * result + FK_SService;
		result = prime * result + ((dateDeal == null) ? 0 : dateDeal.hashCode());
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
		DealPK other = (DealPK) obj;
		if (FK_Agent != other.FK_Agent)
			return false;
		if (FK_SService != other.FK_SService)
			return false;
		if (dateDeal == null) {
			if (other.dateDeal != null)
				return false;
		} else if (!dateDeal.equals(other.dateDeal))
			return false;
		return true;
	}
   
	
}
