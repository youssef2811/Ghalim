package JEux;




/**
 * @author ghalim
 
 */
public class Case 
{  
        /**
         *champ priv� etat : boolean, si vaut true la case est touch� ou non touch� s'il vaut false
         */
	private boolean etat;
	
	/**
	 * Constructeur par d�faut
	 */
	public Case()
	{
		etat = false;
	}
	
	/**
	 * getter du champ etat
	 * @return boolean : etat de la case
	 */
	public boolean getEtat() 
	{
		return etat;
	}
	
	/**
	 * setter du champ etat
	 * @param etat : boolean qui indique l'etat affact� � la case
	 */
	public void setEtat(boolean etat) 
	{
		this.etat = etat;
	}
	
	

}

