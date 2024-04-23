package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class GestorAlmacen {

	public static final int ADD = 1000;
	public static final int REMOVE = 2000;

	private List<String> productos = new ArrayList<>();

	public void manejarProducto(String producto, int operacion) throws Exception {

		if (!productos.contains(producto) && operacion == REMOVE) {

			productos.remove(producto);
		} else if (!productos.contains(producto) && operacion == ADD) {
			productos.add(producto);
		}

		/*
		 * bloque de posibles errores
		 */
		else if (operacion == ADD) {

			throw new Exception("Imposible añadir, el producto ya estaba");
		}

		else if (operacion == REMOVE) {

			throw new Exception("Imposible borrar, el producto no está");
		}

		else
			throw new Exception("Operación no soportada");
	}
}
