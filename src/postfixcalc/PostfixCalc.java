package postfixcalc;

public class PostfixCalc implements IPostfixCalc{

	@Override
	public double Evaluate(int val1, int val2, String operador) {
		// TODO Auto-generated method stub
//		if (operador=="-") {
//			System.out.print("LLL");  
//			int resultado=val2-val1;
//			  return resultado;
//			  
//		  }else {
//			  return 0;
//		  }
		switch(operador) {
		  case "-":
		    double resultadoresta= -val1+val2;
		    return resultadoresta;
		  
		  case "+":
			  double resultadosuma= val1+val2;
			  return resultadosuma;
			    
		  case "/":
			  if (val1!=0) {
				  double resultadodivision= val2/val1;
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

