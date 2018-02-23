package TP;

public class random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=2;
		float som=0;
		float Q=0;
		for(int i=0;i<n;i++)
		{
		float	nb = (float) Math.random();
		som = som+nb;
		Q=Q+nb*nb;	
		}
		float moy=som/n;
		float V = (Q / n)-(moy*moy); 
		float s=(float) Math.pow(0.5,V);
		System.out.println("La moyenne est m ="+moy);
		System.out.println("L’écart-type  est s ="+s);
		 
	}

}
