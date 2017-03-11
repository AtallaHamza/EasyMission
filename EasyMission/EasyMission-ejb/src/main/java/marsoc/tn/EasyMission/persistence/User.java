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
	



	@Id
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
   
}
