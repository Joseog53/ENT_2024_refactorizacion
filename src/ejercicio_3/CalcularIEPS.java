package ejercicio_3;

public class CalcularIEPS extends Impuesto {

	@Override
	public double calcular(double ingresos) {
		
		double impuesto;

		return ingresos * 0.05;
	}
}
