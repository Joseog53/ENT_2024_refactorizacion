package ejercicio8;

public class Calculadora {

	public int sumar(int operador1, int operador2) {

		return operador1 + operador2;

	}

	public int restar(int minuendo, int sustraendo) {

		return minuendo - sustraendo;

	}

	public int multiplicar(int factor1, int factor2) {

		return factor1 * factor2;

	}

	public int dividir(int dividendo, int divisor) throws Exception {

		if (divisor == 0) {

			throw new Exception("Error: No se pued dividir por 0");

		}

		

		return dividendo / divisor;

	}

	public double calcularAreaCirculo(double radio) {

		return Math.PI * radio * radio;

	}

	public double calcularVolumenCilindro(double radio, double altura) {

		return calcularAreaCirculo(radio) * altura;

	}

}
