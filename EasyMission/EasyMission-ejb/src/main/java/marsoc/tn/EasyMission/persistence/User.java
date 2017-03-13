package marsoc.tn.EasyMission.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role")
public class User implements Serializable {

	   
	
	private int idUser;
	private String Nom;
	private String Prenom;
	private String Telephone;
	private String login;
	private String password;
	private String email;

	private Integer age;
    
    private String street;
     
    private String city;
     
    private String postalCode;
     
    private String info;
 

	



	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private static final long serialVersionUID = 1L;

	
	public String getNom() {
		return this.Nom;
	}

	public void setNom(String Nom) {
		this.Nom = Nom;
	}   
	public String getPrenom() {
		return this.Prenom;
	}

	public void setPrenom(String Prenom) {
		this.Prenom = Prenom;
	}   
	public String getTelephone() {
		return this.Telephone;
	}

	public void setTelephone(String Telephone) {
		this.Telephone = Telephone;
	}
	   
		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}
   
}
