package td3.p3;

public class FonctionPuissance implements ExpressionSymbolique{

	private VariablesSymbolique x;
	private VariablesSymbolique n ;
	
	public FonctionPuissance(VariablesSymbolique x,  VariablesSymbolique n ) {
		this.x = x ;
		this.n = n;
	}

	@Override
	public ExpressionSymbolique simplifier() {
		
		return null;
	}

	
	@Override
	public String afficher() {
		
		return this.x.afficher()+"^"+this.n.afficher();
	}

		
	@Override
	public double calculer() {
		return Math.pow(this.x.calculer(),this.n.calculer());
	}

	

}
