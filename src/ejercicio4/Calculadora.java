package ejercicio4;

public class Calculadora {

	

	public int operacion(int a, int b, String operacion) throws Exception {
       
		switch (operacion) {
		
		case "+": return a + b;
          
       
		case "-": return a - b;
            
          
		default: throw new Exception("Operación errónea: " + operacion);
        }
    }

	} 

