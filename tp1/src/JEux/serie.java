package JEux;

import java.util.Scanner;

public class serie {

	public static void main(String[] args) {

		float som=0;
		Scanner sc = new Scanner(System.in);
	     System.out.print("donner la valeur de n :");
	     int n = sc.nextInt();
	     for(int i=1;i<=n;i++)
	     {
	    	 som= som+1/(float)i;
	     }
	     System.out.print("La somme est :"+som);
sc.close();
	}

}
