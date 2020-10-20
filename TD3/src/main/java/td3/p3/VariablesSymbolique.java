package td3.p3;

public  class VariablesSymbolique implements ExpressionSymbolique {
	protected String value ;
	
	public VariablesSymbolique(String value) {
		super();
		this.value = value;
	}
	
	@Override
	public ExpressionSymbolique simplifier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String afficher() {
		return this.value;
	}

	@Override
	public double calculer() {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
