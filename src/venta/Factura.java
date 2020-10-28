package venta;

import java.util.ArrayList;

import entidades.Cliente;

public class Factura {
	private ArrayList<Producto> listadelproductos;
	private Cliente client;
	public Factura(Cliente cliente) {
		listadelproductos = new ArrayList<>();
		client = cliente;
		
	}
	public void addProducto(Producto producto) {
		listadelproductos.add(producto);
	}
	public void quitarProducto(Producto producto) {
		listadelproductos.remove(producto);
	}
	public void imprimirFactura() {
		//Se debe implementar  y mostrar la cantidad de productos
		//que 1 cliente compra, eso debe mostrar por la consola.
	}
}
