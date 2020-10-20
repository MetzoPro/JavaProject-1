package td3.p3;

public class FonctionSin implements ExpressionSymbolique{

	
	private VariablesSymbolique x;
	
	public FonctionSin(VariablesSymbolique x) {
		
		this.x= x ;
	}
	@Override
	public double calculer() {
		
		return Math.sin(this.x.calculer());
	}

	@Override
	public ExpressionSymbolique simplifier() {
		
		return null;
	}

	@Override
	public String afficher() {
		
		return "sin("+this.x.afficher()+")";
	}

}
