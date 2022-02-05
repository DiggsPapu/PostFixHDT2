package postfixcalc;

public class PostfixCalc implements IPostfixCalc{

	@Override
	public int Evaluate(int val1, int val2, String operador) {
		// TODO Auto-generated method stub

		switch(operador) {
		  case "-":
		    int resultadoresta= -val1+val2;
		    return resultadoresta;
		  
		  case "+":
			  int resultadosuma= val1+val2;
			  return resultadosuma;
			  
		  case "*":
			  int resultadomultiplication= val1*val2;
			  return resultadomultiplication;
			    
		  case "/":
			  if (val1!=0) {
				  int resultadodivision= val2/val1;
				  return resultadodivision;				  
			  }
			  else {
				  System.out.print("Es infinito, es indefinido");
			  }
			  
			default:
		    	return 0;
		
	}
	}
}

