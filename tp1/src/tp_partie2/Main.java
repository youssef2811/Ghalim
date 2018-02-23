package tp_partie2;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(17);
		//System.out.println(a);
		
   Fraction f1 = new Fraction(4,2);
   Fraction f2 = new Fraction(a);
   Fraction f3=f1.add(f2);
   Fraction f4=f1.div(f2);
   Fraction f5=f1.sub(f2);
   Fraction f6=f1.mult(f2);
   f3.afficher();
   f4.afficher();
   f5.afficher();
   f6.afficher();
   System.out.println(f1.doubleValue());

	}

}
