package td3.p3;

public class FonctionPuissance implements ExpressionSymbolique{

	private VariablesSymbolique x;
	private VariablesSymbolique n ;
	
	public FonctionPuissance(VariablesSymbolique x,  VariablesSymbolique n ) {
		this.x = x ;
		this.n = n;
	}

	@Override
	public ExpressionSymbolique simplifie() {
		
		return null;
	}

	
	@Override
	public String afficher() {
		
		return this.x.afficher()+"^"+this.n.afficher();
	}

		
	@Override
	public String calculer1() {
	
		
		double tt=  Math.pow(Double.parseDouble(this.x.calculer1()),Double.parseDouble(this.n.calculer1()));
		return  Double.toString(tt) ;
	
	}

	@Override
	public double calculer() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
