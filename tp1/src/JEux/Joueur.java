package JEux;

public class Joueur 
{  
	/**
    *
    *champ priv� nom : objet String repr�sentant le nom du joueur
    */
	private String nom;
	/**
	 * 
	 */
	private Grille grille;
	
	/**
	 * constructeur par d�faut
	 */
	public Joueur()
	{
		this.nom = null;
		this.grille = null;
		
	}
	
	/**
	 * constructeur surcharg�
	 * @param nom : objet String qui repr�sente le nom du Joueur
	 */
	public Joueur(String nom)
	{
		this.nom = nom;
		this.grille = new Grille();
	}

	/**
	 * r�cup�rer l'objet Grille du joueur
	 * @return : objet Grille repr�sentant la grille du joueur
	 */
	public Grille getGrille() {
		return grille;
	}

	/**
	 * r�cup�rer le nom
	 * @return : Objet String qui repr�sente le nom du Joueur
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * modifier le nom du Joueur
	 * @param nom : Objet String qui repr�sente le nom du Joueur
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	

	

}