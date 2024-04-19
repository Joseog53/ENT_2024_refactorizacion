package ejercicio_3;

public class CalculadoraImpuestos {


    public static final int IVA = 1;
    public static final int ISR = 2;
    public static final int IEPS = 3;
	
	public double calcularImpuestoTotal(double ingresos, int tipoImpuesto) throws Exception {

		double impuesto = 0;

		if (tipoImpuesto==IVA) {

			impuesto = CalcularIVA(ingresos);
		}
		
		else if (tipoImpuesto==ISR) {

			impuesto = CalcularISR(ingresos);
		} 
		
		else if (tipoImpuesto==IEPS) {
			
			impuesto =ingresos*0.05;
		}

		else {
			
			    throw new Exception("Tipo de impuesto no válido");
			
			    
				
			
		}
		return impuesto;
	}

	

	private double CalcularISR(double ingresos) {
		double impuesto;
		if (ingresos < 50000) {
			impuesto = ingresos * 0.20;
		}

		else {
			impuesto = ingresos * 0.30;
		}
		return impuesto;
	}

	private double CalcularIVA(double ingresos) {
		double impuesto;
		if (ingresos < 10000) {
			impuesto = ingresos * 0.10;
		}

		else if (ingresos >= 10000 && ingresos < 50000) {
			impuesto = ingresos * 0.15;
		}

		else {
			impuesto = ingresos * 0.20;
		}
		return impuesto;
	}
}
