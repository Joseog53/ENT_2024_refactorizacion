package ejercicio_3;

public class CalcularISR extends Impuesto {

	
	public double calcular(double ingresos) {

		double impuesto;

		if (ingresos < 50000) {

			impuesto = ingresos * 0.20;
		}

		else {
			impuesto = ingresos * 0.30;
		}

		return impuesto;
	}

	
	
}
