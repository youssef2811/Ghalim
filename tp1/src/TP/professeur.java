package TP;

public class professeur {

	private String nom;
	private Integer nummerSomme;
	private String email;
	private String garde;
	
	public professeur(String nom, Integer nummerSomme, String email,
			String garde) {
		super();
		this.nom = nom;
		this.nummerSomme = nummerSomme;
		this.email = email;
		this.garde = garde;
	}

	public professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNummerSomme() {
		return nummerSomme;
	}

	public void setNummerSomme(Integer nummerSomme) {
		this.nummerSomme = nummerSomme;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGarde() {
		return garde;
	}

	public void setGarde(String garde) {
		this.garde = garde;
	}

	@Override
	public String toString() {
		return "professeur [nom=" + nom + ", nummerSomme=" + nummerSomme
				+ ", email=" + email + ", garde=" + garde + "]";
	}

	public static void main(String[] args) {
		professeur p = new professeur("q",4,"c","d");
		System.out.println(p.toString());

}}
