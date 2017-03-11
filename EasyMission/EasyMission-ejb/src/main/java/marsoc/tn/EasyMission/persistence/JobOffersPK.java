package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: JobOffersPK
 *
 */
@Embeddable

public class JobOffersPK implements Serializable {

	
	private int ClientFK;
	private int SServiceFK;
	private Date Date_Offer;

	private static final long serialVersionUID = 1L;

 
	@Column(name="ClientFK")	
	public int getClientFK() {
		return this.ClientFK;
	}

	
	public void setClientFK(int ClientFK) {
		this.ClientFK = ClientFK;
	}   
	@Column(name="SServiceFK")
	public int getSServiceFK() {
		return this.SServiceFK;
	}

	public void setSServiceFK(int SServiceFK) {
		this.SServiceFK = SServiceFK;
	}   

	@Column(name="DateOffer")
	public Date getDate_Offer() {
		return Date_Offer;
	}

	public void setDate_Offer(Date date_Offer) {
		Date_Offer = date_Offer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ClientFK;
		result = prime * result + ((Date_Offer == null) ? 0 : Date_Offer.hashCode());
		result = prime * result + SServiceFK;
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
		JobOffersPK other = (JobOffersPK) obj;
		if (ClientFK != other.ClientFK)
			return false;
		if (Date_Offer == null) {
			if (other.Date_Offer != null)
				return false;
		} else if (!Date_Offer.equals(other.Date_Offer))
			return false;
		if (SServiceFK != other.SServiceFK)
			return false;
		return true;
	}
	
	
	
   
}
