package postfixcalc;

import java.io.File;
import java.util.Scanner;


public class Main{
	public static void main(String[] args) throws Exception{
		File postfix=new File("C:\\Users\\Windows 10\\Documents\\UVG\\CODING\\Algoritmos y estructuras de datos\\HDT\\HDT 2\\datos.txt");
		Scanner sc = new Scanner(postfix);
		StackNodes vector=new StackNodes();
		
		while (sc.hasNext()) {
			String val=sc.next();
			try {
				int valueint=Integer.valueOf(val);
				vector.push(valueint);
			}
			catch (Exception e) {
				switch (val) {
				  case "/":
				    System.out.println("Today is Div");
				    if (vector.count()>2) {
				    	int valor1= (int) vector.getHead().getValue();
				    	vector.pull();
				    	int valor2= (int) vector.getHead().getValue();
				    	vector.pull();
				    	PostfixCalc operation=new PostfixCalc();
				    	vector.push(operation.Evaluate(valor1, valor2, val));
				    	System.out.print(vector.getHead().getValue());
				    	
				    }
				    else {
				    	System.out.println("No es v�lida la operaci�n dado que faltan valores para operar.");
				    }
				    break;
				  case "+":
				    System.out.println("Today is Sum");
				    if (vector.count()>2) {
				    	int valor1= (int) vector.getHead().getValue();
				    	vector.pull();
				    	int valor2= (int) vector.getHead().getValue();
				    	vector.pull();
				    	PostfixCalc operation=new PostfixCalc();
				    	vector.push(operation.Evaluate(valor1, valor2, val));
				    	System.out.print(vector.getHead().getValue());
				    }
				    else {
				    	System.out.println("No es v�lida la operaci�n dado que faltan valores para operar.");
				    }
				    
				    break;
				  case "*":
					System.out.println("Today is multi");
					if (vector.count()>2) {
						int valor1= (int) vector.getHead().getValue();
				    	vector.pull();
				    	int valor2= (int) vector.getHead().getValue();
				    	vector.pull();
				    	PostfixCalc operation=new PostfixCalc();
				    	vector.push(operation.Evaluate(valor1, valor2, val));
				    	System.out.print(vector.getHead().getValue());
				    }
				    else {
				    	System.out.println("No es v�lida la operaci�n dado que faltan valores para operar.");
				    }
				    break;
				  case "-":
					System.out.println("Today is Subs");
					if (vector.count()>2) {
						int valor1= (int) vector.getHead().getValue();
				    	vector.pull();
				    	int valor2= (int) vector.getHead().getValue();
				    	vector.pull();
				    	PostfixCalc operation=new PostfixCalc();
				    	vector.push(operation.Evaluate(valor1, valor2, val));
				    	System.out.print(vector.getHead().getValue());
				    }
				    else {
				    	System.out.println("No es v�lida la operaci�n dado que faltan valores para operar.");
				    }
				    break;
				  default:
				    System.out.println("No es operador v�lido" + val);
					
				}
			}
				
		}
	if (vector.isEmpty()) {
		System.out.print("La cuenta era correcta,  no hubo errores por malas pr�cticas");
	}else {
		System.out.print("Nefasta cuenta");
	}
		}
	}


