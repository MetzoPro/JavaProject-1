package td3.p3;

public class FonctionLn implements ExpressionSymbolique{
	
	private VariablesSymbolique x;
	
	public FonctionLn( VariablesSymbolique x ) {
		this.x = x ;	
	}
	@Override
	public String calculer1() {
       
		double tt=  Math.log(Double.parseDouble(this.x.calculer1()));
		return  Double.toString(tt) ;
		
	}

	@Override
	public ExpressionSymbolique simplifie() {
		return null;
	}

	@Override
	public String afficher() {
		
		 return "Cos("+this.x.afficher()+")";
	}
	@Override
	public double calculer() {
		// TODO Auto-generated method stub
		return 0;
	}


}
