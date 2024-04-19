package ejercicio_3;

public class CalcularISR {

	public double calcularImpuestoTotal(double ingresos, String tipoImpuesto) {

	double impuesto=0;

		if (ingresos < 50000) {
			impuesto = ingresos * 0.20;
		}

		else {
			impuesto = ingresos * 0.30;
		}
		return impuesto;
	} 
	}

