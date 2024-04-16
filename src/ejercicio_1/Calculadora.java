package ejercicio_1;

public class Calculadora {

	
	    public int sumar(int a, int b) { 

	        int resultado = a + b; 

	        return resultado; 

	    } 

	 

	    public int restar(int a, int b) { 

	        int resultado = a - b; 

	        return resultado; 

	    } 

	 

	    public int multiplicar(int a, int b) { 

	        int resultado = a * b; 

	        return resultado; 

	    } 

	 

	    public int dividir(int a, int b) { 
	    	try {
	        
	    		if (b == 0) {
	               
	            	throw new Exception_dividirPorCero("Error: No se puede dividir por cero.");
	            }
	    		
	    		else {
	               
	            	int resultado = a / b;
	                return resultado;
	            }
	       
	    	} catch (Exception_dividirPorCero e) {
	           
	    		System.out.println(e.getMessage());
	            
	    		return 0; 
	        }

	    } 

	 


	    } 

	

