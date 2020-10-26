package td3;

import td3.p3.ConstanteSymbolique;
import td3.p3.ExpressionSymbolique;
import td3.p3.FonctionCos;
import td3.p3.VariablesSymbolique;

public class Multiplication extends OperationBinaire {

	public Multiplication(ExpressionArithmetique eaLeft, ExpressionArithmetique eaRight) {
		super(eaLeft, eaRight);

	}

	public Multiplication(ExpressionSymbolique eaLeft, ExpressionArithmetique eaRight) {
		super(eaLeft, eaRight);

	}


	@Override
	protected ExpressionArithmetique simplifie(ConstRationnelle gauche, ConstEntiere droite) {
		return new ConstRationnelle(droite.getEntier() * gauche.getNumerateur(), gauche.getDenominateur()).simplifie();
	}

	@Override
	protected ExpressionArithmetique simplifie(ConstRationnelle gauche, ConstRationnelle droite) {
		return new ConstRationnelle(gauche.getNumerateur() * droite.getNumerateur(),
				droite.getDenominateur() * gauche.getDenominateur()).simplifie();
	}

	@Override
	protected ExpressionArithmetique simplifie(ConstEntiere gauche, ConstEntiere droite) {
		return new ConstEntiere(gauche.getEntier() * droite.getEntier()).simplifie();
	}

	

	@Override
	protected ExpressionArithmetique simplifie(ConstEntiere gauche, ConstRationnelle droite) {
		return this.simplifie(droite, gauche).simplifie();
	}
	
	protected ExpressionSymbolique simplifie(ConstEntiere gauche, VariablesSymbolique droite) {
		return  this.simplifie(gauche,droite);
	}
	protected ExpressionSymbolique simplifie(ConstEntiere gauche, ConstanteSymbolique droite) {
		return  this.simplifie(gauche,droite);
	}

	
	protected ExpressionSymbolique simplifie(ConstRationnelle gauche, ConstanteSymbolique droite) {
		
		return  this.simplifie(gauche,droite);
	}
	
	
	protected ExpressionSymbolique simplifie(ConstRationnelle gauche, VariablesSymbolique droite) {
		
		return  this.simplifie(gauche,droite);
	}
	
	@Override
	public double calculer() {
		
	
		return this.eaLeft.calculer() * this.eaRight.calculer();
	}

	public String afficher() {
		
		return ( this.eaLeft.simplifie().afficher()+this.eaRight.afficher());
		
	}

	@Override
	public String calculer1() {
		
		String tt= String.valueOf(this.eaLeft.calculer() ) +  String.valueOf(this.eaRight.afficher());
		return  String.valueOf(tt) ;
	}

	
}
