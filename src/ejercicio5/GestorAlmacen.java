package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class GestorAlmacen {
	
	public static final boolean AÑADIR = true;
	public static final boolean ELIMINAR = false;

	private List<String> productos = new ArrayList<>();

	public void manejarProducto(String producto, boolean agregar) throws Exception {

		if (AÑADIR) {

			if (!productos.contains(producto)) {

				productos.add(producto);

				System.out.println("Producto '" + producto + "' agregado al almacén.");
			}

			else {

				System.out.println("El producto '" + producto + "' ya existe en el almacén.");
			}
		}

		else {

			if (productos.contains(producto)) {

				productos.remove(producto);

				System.out.println("Producto '" + producto + "' eliminado del almacén.");
			}

			else {

				throw new Exception("El producto '" + producto + "' no existe en el almacén.");
			}
		}
	}
}
