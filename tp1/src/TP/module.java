package TP;

public class module {
	private String libelle;
	private Integer coefficient;
	private Integer nbrheure;
	private professeur enseignat= new professeur();
	
	

	public module(String libelle, Integer coefficient, Integer nbrheure,
			professeur enseignat) {
		super();
		this.libelle = libelle;
		this.coefficient = coefficient;
		this.nbrheure = nbrheure;
		this.enseignat = enseignat;
	}

	public module() {
		super();
		
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}

	public Integer getNbrheure() {
		return nbrheure;
	}

	public void setNbrheure(Integer nbrheure) {
		this.nbrheure = nbrheure;
	}

	public professeur getEnseignat() {
		return enseignat;
	}

	public void setEnseignat(professeur enseignat) {
		this.enseignat = enseignat;
	}

	
	public String affiche() {
		return "module [libelle=" + libelle + ", coefficient=" + coefficient
				+ ", nbrheure=" + nbrheure + ", enseignat=" + enseignat + "]";
	}
public static void main(String[] args) {
	module a = new module();
	System.out.println(a.toString());

	}
}
