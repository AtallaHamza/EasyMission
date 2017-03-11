package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class AchatDeal implements Serializable {

	
	private AchatDealPK achatDealPK;
	private boolean etatPayment;	
	private boolean etatJobDone;
	private Deal deal;
	private Client client;
	private static final long serialVersionUID = 1L;
    
	
	

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
	
	
	@ManyToOne
	@JoinColumns({
        @JoinColumn(name="FK_Agent", referencedColumnName="FK_Agent", insertable=false , updatable=false),
        @JoinColumn(name="FK_SService", referencedColumnName="FK_SService" , insertable=false , updatable=false),
        @JoinColumn(name="FK_DateDeal", referencedColumnName="FK_DateDeal", insertable=false , updatable=false)
    })
	public Deal getDeal() {
		return deal;
	}
	public void setDeal(Deal deal) {
		this.deal = deal;
	}
	
	
	@ManyToOne
	@JoinColumn(name="ClientFk",insertable=false,updatable=false)
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@EmbeddedId
	public AchatDealPK getAchatDealPK() {
		return achatDealPK;
	}
	public void setAchatDealPK(AchatDealPK achatDealPK) {
		this.achatDealPK = achatDealPK;
	}
}
