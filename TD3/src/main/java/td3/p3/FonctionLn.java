package td3.p3;

public class FonctionLn implements ExpressionSymbolique{
	
	private VariablesSymbolique x;
	
	public FonctionLn( VariablesSymbolique x ) {
		this.x = x ;
		
	}
	@Override
	public double calculer() {

		return Math.log(this.x.calculer());
	}

	@Override
	public ExpressionSymbolique simplifier() {
		return null;
	}

	@Override
	public String afficher() {
		
		 return "Cos("+this.x.afficher()+")";
	}


}
