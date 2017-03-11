package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AchatDealPK
 *
 */
@Embeddable

public class AchatDealPK implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private DealPK dealPK;
	private int ClientFK;
	
	
	
	public DealPK getDealPK() {
		return dealPK;
	}
	public void setDealPK(DealPK dealPK) {
		this.dealPK = dealPK;
	}
	public int getClientFK() {
		return ClientFK;
	}
	public void setClientFK(int clientFK) {
		ClientFK = clientFK;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ClientFK;
		result = prime * result + ((dealPK == null) ? 0 : dealPK.hashCode());
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
		AchatDealPK other = (AchatDealPK) obj;
		if (ClientFK != other.ClientFK)
			return false;
		if (dealPK == null) {
			if (other.dealPK != null)
				return false;
		} else if (!dealPK.equals(other.dealPK))
			return false;
		return true;
	}
	
   
}
