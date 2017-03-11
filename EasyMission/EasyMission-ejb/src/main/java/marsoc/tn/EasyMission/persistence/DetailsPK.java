package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DetailsPK
 *
 */
@Embeddable

public class DetailsPK implements Serializable {

	
	private int FK_Agent;
	private int FK_SServices;
	private int experience;
	private static final long serialVersionUID = 1L;

 
	public int getFK_Agent() {
		return this.FK_Agent;
	}

	public void setFK_Agent(int FK_Agent) {
		this.FK_Agent = FK_Agent;
	}   
	public int getFK_SServices() {
		return this.FK_SServices;
	}

	public void setFK_SServices(int FK_SServices) {
		this.FK_SServices = FK_SServices;
	}   
	public int getExperience() {
		return this.experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + FK_Agent;
		result = prime * result + FK_SServices;
		result = prime * result + experience;
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
		DetailsPK other = (DetailsPK) obj;
		if (FK_Agent != other.FK_Agent)
			return false;
		if (FK_SServices != other.FK_SServices)
			return false;
		if (experience != other.experience)
			return false;
		return true;
	}
   
}
