package td3;

import td3.p3.ConstanteSymbolique;
import td3.p3.ExpressionSymbolique;
import td3.p3.VariablesSymbolique;

public abstract class OperationBinaire implements ExpressionArithmetique , ExpressionSymbolique {
	protected ExpressionArithmetique eaLeft;
	protected  ExpressionArithmetique eaRight;

	public OperationBinaire(ExpressionArithmetique eaLeft, ExpressionArithmetique eaRight) {
		this.eaLeft = eaLeft;
		this.eaRight = eaRight;
	}
	
	protected ExpressionArithmetique simplifie(ConstRationnelle gauche,ExpressionSymbolique droite) {
		return this;
	}
	protected ExpressionArithmetique simplifie(ExpressionArithmetique gauche, ExpressionArithmetique droite) {
		return this;
	}

	protected ExpressionArithmetique simplifie(ConstRationnelle gauche, ConstEntiere droite) {
		return this;
	}

	protected ExpressionArithmetique simplifie(ConstRationnelle gauche, ConstRationnelle droite) {
		return this;
	}

	protected ExpressionArithmetique simplifie(ConstEntiere gauche, ConstEntiere droite) {
		return this;
	}

	protected ExpressionArithmetique simplifie(ConstEntiere gauche, ConstRationnelle droite) {
		return this;
	}
	
	

	@Override
	public ExpressionSymbolique simplifie() {

		ExpressionArithmetique res;
	
		this.eaLeft = this.eaLeft.simplifie();
		this.eaRight = this.eaRight.simplifie();

		if (this.eaLeft instanceof ConstEntiere && this.eaRight instanceof ConstEntiere) {
			ConstEntiere gauche = (ConstEntiere) this.eaLeft;
			ConstEntiere droite = (ConstEntiere) this.eaRight;
			
			res = simplifie(gauche, droite);
			
		} else if (this.eaLeft instanceof ConstRationnelle && this.eaRight instanceof ConstRationnelle) {
			ConstRationnelle gauche = (ConstRationnelle) this.eaLeft;
			ConstRationnelle droite = (ConstRationnelle) this.eaRight;

			res = simplifie(gauche, droite);

		} else if (this.eaLeft instanceof ConstRationnelle && this.eaRight instanceof ConstEntiere)

		{
			ConstRationnelle gauche = (ConstRationnelle) this.eaLeft;
			ConstEntiere droite = (ConstEntiere) this.eaRight;

			res = simplifie(gauche, droite);

		} else if (this.eaLeft instanceof ConstEntiere && this.eaRight instanceof ConstRationnelle) {
			ConstEntiere gauche = (ConstEntiere) this.eaLeft;
			ConstRationnelle droite = (ConstRationnelle) this.eaRight;

			res = simplifie(gauche, droite);

		} else if (this.eaLeft instanceof ConstEntiere && this.eaRight instanceof VariablesSymbolique) {
			ConstEntiere gauche = (ConstEntiere) this.eaLeft;
			VariablesSymbolique droite = (VariablesSymbolique) this.eaRight;
			
			res =  simplifie(gauche,droite);
		
		}else if (this.eaLeft instanceof ConstEntiere && this.eaRight instanceof ConstanteSymbolique) {
			ConstEntiere gauche = (ConstEntiere) this.eaLeft;
			ConstanteSymbolique droite = (ConstanteSymbolique) this.eaRight;
			
			res = (ExpressionSymbolique) simplifie(gauche,droite);
			
		}else if (this.eaLeft instanceof ConstRationnelle && this.eaRight instanceof VariablesSymbolique) {
			ConstRationnelle gauche =  (ConstRationnelle) this.eaLeft;
			VariablesSymbolique droite = (VariablesSymbolique) this.eaRight;
			
			res =  (ExpressionSymbolique) simplifie(gauche,droite);
		}
		
		 
		else if (this.eaLeft instanceof ExpressionArithmetique && this.eaRight instanceof VariablesSymbolique) {
			ConstEntiere gauche = new ConstEntiere(Integer.parseInt(String.valueOf(this.eaLeft.calculer())));
			res = (ExpressionSymbolique) this.simplifie(gauche, this.eaRight);

		}
		

		else {
			res = this;
			
		}

		return  (ExpressionSymbolique) res;

	}

}
