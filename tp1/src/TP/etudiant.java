package TP;

public class etudiant {
private String nom;
private Integer nummerEtudiant;
private String email;

	
	

public etudiant() {
		super();
		
	}

public etudiant(String nom, Integer nummerEtudiant, String email) {
		super();
		this.nom = nom;
		this.nummerEtudiant = nummerEtudiant;
		this.email = email;
	}
public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public Integer getNummerEtudiant() {
	return nummerEtudiant;
}

public void setNummerEtudiant(Integer nummerEtudiant) {
	this.nummerEtudiant = nummerEtudiant;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


	

	

	@Override
public String toString() {
	return "etudiant [nom=" + nom + ", nummerEtudiant=" + nummerEtudiant
			+ ", email=" + email + "]";
}

	public static void main(String[] args) {
		
	}
 etudiant etudiant = new etudiant();
	}

