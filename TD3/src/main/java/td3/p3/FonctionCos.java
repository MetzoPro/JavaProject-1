package td3.p3;

public class FonctionCos implements ExpressionSymbolique{
	
	
	private VariablesSymbolique x;
	private ConstanteSymbolique i ;
	
	public FonctionCos (VariablesSymbolique x) {
		this.x=x;
	}
	public FonctionCos (ConstanteSymbolique i) {
		this.i=i;
	}
	
	
	@Override
	public ExpressionSymbolique simplifie() {
		return this;
	}

	@Override
	public String afficher() {
		// TODO Auto-generated method stub
		return "Cos("+this.x.afficher()+")"+ this.i.afficher();
	}

	@Override
	
	public String calculer1() {
		double tt= Math.cos(Double.parseDouble(this.x.calculer1()));
		return  Double.toString(tt) ;
	}
	@Override
	public double calculer() {
		// TODO Auto-generated method stub
		return 0;
	}



}
