package td3.p3;

import td3.ExpressionArithmetique;

public class ConstanteSymbolique implements ExpressionSymbolique{
	
	protected String value ;



	public ConstanteSymbolique(String value) {
		super();
		this.value = value;
	}
	
	


	@Override
	public String afficher() {
		return this.value;
	}

	@Override
	public ExpressionSymbolique simplifie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calculer1() {
		// TODO Auto-generated method stub
		return this.value;
	}




	@Override
	public double calculer() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
