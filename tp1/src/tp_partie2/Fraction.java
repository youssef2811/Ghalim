package tp_partie2;

import java.math.BigInteger;

public class Fraction {

	private BigInteger num;
	private BigInteger den;
	
	
	public BigInteger getNum() {
		return num;
	}


	public BigInteger getDen() {
		return den;
	}


	public Fraction(BigInteger num, BigInteger den) {
		this.num = num;
		this.den = den;
	}
	
	
	public Fraction(int a, int b) {
		BigInteger i = BigInteger.valueOf(a);
		BigInteger j = BigInteger.valueOf(b);
		this.num = i;
		this.den = j;
	}


	public Fraction(BigInteger num) {
		super();
		this.num = num;
		this.den = BigInteger.valueOf(1);
	}
		
	
	
	public Fraction add(Fraction f) 
	{
Fraction r = new Fraction((this.num.multiply(f.den)).add((f.num.multiply(den)))
		,this.den.multiply(f.den));
		return r;
	}
	
	public Fraction sub(Fraction f) 
	{
		Fraction r = new Fraction((this.num.multiply(f.den)).subtract((f.num.multiply(den)))
				,this.den.multiply(f.den));
				return r;
			}
	public Fraction mult(Fraction f) 
	{
		Fraction r = new Fraction((this.num.multiply(f.num))
				,this.den.multiply(f.den));
				return r;
			}
	public Fraction div(Fraction f) 
	{
		Fraction r = new Fraction((this.num.multiply(f.den))
				,this.den.multiply(f.num));
				return r;
	}
	public String toString(Fraction f) {
		String mes = String.valueOf(f);
		return mes;
	}
	
	public double doubleValue()
	{
		BigInteger res=this.num.divide(this.den);
		float f = res.floatValue();
		return f;
	}
	
	public void afficher()
	{
		System.out.println("le numérateur =>"+num+"; dénominateur =>"+den);
	}
	
	
}
