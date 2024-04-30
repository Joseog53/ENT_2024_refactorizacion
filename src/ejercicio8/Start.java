package ejercicio8;

public class Start {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 Calculadora calc = new Calculadora(); 

		 

	        System.out.println("Suma: " + calc.sumar(10, 5)); 

	        System.out.println("Resta: " + calc.restar(10, 5)); 

	        System.out.println("Multiplicación: " + calc.multiplicar(10, 5)); 

	        System.out.println("División: " + calc.dividir(10, 5)); 

	 

	        double radio = 5.0; 

	        double altura = 10.0; 

	        double area = calc.calcularAreaCirculo(radio);
	        
	        double volumen = calc.calcularVolumenCilindro(radio, altura);

	        System.out.println("Área del círculo: " + area); 

	        System.out.println("Volumen del cilindro: " + volumen); 
	}

}
