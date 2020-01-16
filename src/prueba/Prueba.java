package prueba;

import java.util.ArrayList;

import daos.DAOCategoria;
import daos.DAOProducto;
import model.Categoria;
import model.Producto;

public class Prueba {

	public static void main(String[] args) {
		/**
		 * @author tusof
		 * Prueba de las categorias -- Todos los datos llegan correctamente
		 */
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();
		DAOCategoria daoc = new DAOCategoria();
		categorias = daoc.getCategorias();
		for (Categoria categoria : categorias) {
			System.out.println(categoria.getNombre());
			System.out.println(categoria.getId());
		}
		
		/**
		 *@author tusof
		 *Prueba de los productos -- Todos datos llegan correctamente
		 */
		ArrayList<Producto> productos = new ArrayList<Producto>();
		DAOProducto daop = new DAOProducto();
		productos = daop.getProductos(34);
		for (Producto producto : productos) {
			System.out.println(producto.getId());
			System.out.println(producto.getTitulo());
			System.out.println(producto.getBody());
			System.out.println(producto.getCategoriaId());
			System.out.println(producto.getImg());
		}
	}

}
