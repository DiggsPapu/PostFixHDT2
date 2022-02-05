package postfixcalc;
/***
 * Creación del main para ejecutar el postfix.
 */
import java.io.File;
import java.util.Scanner;

/**
 * Es la main.
 * @author diego alonzo
 *
 */
public class Main{
	public static void main(String[] args) throws Exception{
		/**
		 * Se crea un almacenamiento del archivo de texto datos.txt
		 */
		File postfix=new File("C:\\Users\\Windows 10\\Documents\\UVG\\CODING\\Algoritmos y estructuras de datos\\HDT\\HDT 2\\datos.txt");
		/**
		 * Se utiliza el paquete para scannear y poder manejarlo.
		 */
		Scanner sc = new Scanner(postfix);
		StackNodes vector=new StackNodes();
		/**
		 * Se crea un ciclo while para mantenerlo en marcha siempre y cuando haya un valor extra dentro del dato.
		 */
		while (sc.hasNext()) {
			String val=sc.next();
			/**
			 * El try es para probar si es un entero el valor extraído del file
			 */
			try {
				int valueint=Integer.valueOf(val);
				vector.push(valueint);
			}
			/**
			 * el catch es en caso de que de error y en el caso de que sea un operador
			 */
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
				    	System.out.println("No es válida la operación dado que faltan valores para operar.");
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
				    	System.out.println("No es válida la operación dado que faltan valores para operar.");
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
				    	System.out.println("No es válida la operación dado que faltan valores para operar.");
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
				    	System.out.println("No es válida la operación dado que faltan valores para operar.");
				    }
				    break;
				  default:
				    System.out.println("No es operador válido" + val);
					
				}
			}
				
		}
	if (vector.isEmpty()) {
		System.out.print("La cuenta era correcta,  no hubo errores por malas prácticas");
	}else {
		System.out.print("Nefasta cuenta");
	}
		}
	}


