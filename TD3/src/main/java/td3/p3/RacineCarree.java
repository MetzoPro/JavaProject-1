package td3.p3;

public class RacineCarree implements ExpressionSymbolique {

	private VariablesSymbolique x; 
	
	public RacineCarree(VariablesSymbolique x) {
		super();
		this.x = x;
	}

	
	@Override
	public ExpressionSymbolique simplifie() {
		
		return null;
	}

	@Override
	public String afficher() {
		
		return "Rc("+this.x.afficher()+")";
	}

	@Override
	public String calculer1() {
			
		double tt=  Math.sqrt(Double.parseDouble(this.x.calculer1()));
		return  Double.toString(tt) ;
		
	}


	@Override
	public double calculer() {
		// TODO Auto-generated method stub
		return 0;
	}




}
