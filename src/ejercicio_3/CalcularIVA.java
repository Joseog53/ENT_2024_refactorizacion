package ejercicio_3;

public class CalcularIVA {

	public double calcularImpuestoTotal(double ingresos, String tipoImpuesto) {

		double impuesto = 0;

		if (ingresos < 10000) {
			impuesto = ingresos * 0.10;
		}

		else if (ingresos >= 10000 && ingresos < 50000) {
			impuesto = ingresos * 0.15;
		}
		
		return impuesto;
	}
}
