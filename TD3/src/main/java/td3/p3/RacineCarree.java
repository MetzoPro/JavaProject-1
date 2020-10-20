package td3.p3;

public class RacineCarree implements ExpressionSymbolique {

	private VariablesSymbolique x; 
	
	public RacineCarree(VariablesSymbolique x) {
		super();
		this.x = x;
	}

	
	@Override
	public ExpressionSymbolique simplifier() {
		
		return null;
	}

	@Override
	public String afficher() {
		
		return "Rc("+this.x.afficher()+")";
	}

	@Override
	public double calculer() {
		
		return Math.sqrt(this.x.calculer());
		
		
	}


}
