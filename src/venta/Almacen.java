package venta;

import java.util.ArrayList;

public class Almacen {
	private ArrayList<Producto> productos;
	public Almacen() {
		productos = new ArrayList<>();
	}
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	public void listarProductos() {
		for (int i = 0; i < productos.size(); i++) {
			System.out.println("Prodcuto " + productos.get(i).getIdentificador() + " nombre" + productos.get(i).getNombre());
		}
	}
	public Producto buscarProducto(String identificadorProducto) {
		// Se debe implementar esta función 
		// se debe pasar el identificador del producto para poder buscarlo.
		// de la lista productos
		// y se debe pasar el objeto producto como resultado
		return null;
	}
	
}
