package td3.p3;

public class FonctionCos implements ExpressionSymbolique{
	
	private VariablesSymbolique x;
	
	public FonctionCos (VariablesSymbolique x) {
		this.x=x;
	}
	@Override
	public ExpressionSymbolique simplifier() {
		return this;
	}

	@Override
	public String afficher() {
		// TODO Auto-generated method stub
		return "Cos("+this.x.afficher()+")";
	}

	@Override
	public double calculer() {
		return Math.cos(this.x.calculer());
	}




}
