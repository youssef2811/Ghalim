package JEux;

public class Grille 
{  
	
	/**
    *Champ priv� de type Case[][] : matrice de dimention 10*10 repr�sente 100 objet Case d'un joueur
    */
	private Case[][] grille = new Case[10][10];
	
	/**
	 * Constructeur par d�faut : tous les element de grille sont instanci� par 
	 * le constructeur par d�faut de Case .
	 */
	public Grille()
	{
		for(int i = 0; i < 10; ++i)
		{
			for(int j = 0; j < 10; ++j)
			{
				this.grille[i][j] = new Case();
			}
		}
	}
	
	/**
	 * permet de tirer (changer l'�tat) d'une case d�termin�e par ses coordon�es
	 * @param x : type int, abscisse de la Case objectif.
	 * @param y : type int, ordonn�e de la Case objectif.
	 */
	public void tir(int x, int y)
	{
		if(this.grille[x][y].getEtat() == false)
			this.grille[x][y].setEtat(true);
	}
	
	/**
	 * permet d'afficher la grille de l'adversaire, � l'�tat actuel.
	 */
	public void afficheTirs()
	{
		for(Case[] x : this.grille)
		{
			for(Case y : x)
			{
				if(y.getEtat())
					System.out.print("o ");
				else
					System.out.print("x ");
			}
			System.out.println();
		}
	}
	
	/**
	 * permet de r�cup�rer la grille du joueur actuel
	 * @return : type : Case[][] tableu � deux dimenstion repr�sentant la grille .
	 */
	public Case[][] getGrille() {
		return grille;
	}
	public void setGrille(Case[][] grille) {
		this.grille = grille;
	}
	

}