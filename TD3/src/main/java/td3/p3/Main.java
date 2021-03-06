package td3.p3;

import td3.Addition;
import td3.ConstEntiere;
import td3.ConstRationnelle;
import td3.ExpressionArithmetique;
import td3.Multiplication;

public class Main {

	public static void main(String[] args) {
		/**
		VariablesSymbolique x = new VariablesSymbolique("x");
		ExpressionSymbolique cos = new FonctionCos(x);
		System.out.println(cos.afficher());
		Addition ad1 = new Addition(new ConstEntiere(3), cos);
		
		Addition ad2 = new Addition(new ConstEntiere(3), new ConstEntiere(1));
		Multiplication ml = new Multiplication(ad2, x);
	
		System.out.println(ml.simplifier().afficher());
		*/
		
		VariablesSymbolique x = new VariablesSymbolique("y");

		System.out.println("variableSymbolique"  +"  "+ 	x.afficher());
		
		ConstRationnelle s = new ConstRationnelle(4, 3);
	 
		Multiplication mul = new Multiplication(s, x);
		

		
		System.out.println("le calcule de 4/3 + variablesymbolique nous donne  "+"  "+mul.calculer1());
		System.out.println("avec la methode afficher " +"  "+mul.afficher());
		
	}

}
