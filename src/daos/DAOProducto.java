package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.Conexion;
import model.Producto;

public class DAOProducto {
	// select
	public ArrayList<Producto> getProductos(int idCategoria) {
		ResultSet rs;
		ArrayList<Producto> lista = new ArrayList<Producto>();

		Connection con = Conexion.conecta();
		Statement st;
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from producto where categoriaid = " + idCategoria;
			rs = st.executeQuery(ordenSql);

			while (rs.next()) {
				Producto producto = new Producto();
				producto.setId(rs.getInt("id"));
				producto.setTitulo(rs.getString("titulo"));
				producto.setCategoriaId(rs.getInt("categoriaid"));
				producto.setBody(rs.getString("body"));
				producto.setImg(rs.getString("imagen"));
				producto.setBackground(rs.getString("fondo"));
				
				lista.add(producto);
			}
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			System.out
					.println("Error al acceder a la BDs: " + e.getMessage());
		}
		return lista;
	}
		// select
		public Producto getProducto(int id) {
			ResultSet rs;
			

			Connection con = Conexion.conecta();
			Statement st;
			try {
				st = con.createStatement();
				String ordenSql = "SELECT * from producto where id = " + id;
				rs = st.executeQuery(ordenSql);
				Producto producto = new Producto();
				if (rs.next()) {
					
					producto.setId(rs.getInt("id"));
					producto.setTitulo(rs.getString("titulo"));
					producto.setCategoriaId(rs.getInt("categoriaid"));
					producto.setBody(rs.getString("body"));
					producto.setImg(rs.getString("imagen"));
					producto.setBackground(rs.getString("fondo"));
					
				}
				rs.close();
				st.close();
				con.close();
				return producto;
			} catch (SQLException e) {
				System.out.println("Error al acceder a la BDs: " + e.getMessage());
				return null;
			}
			
			
		}

}
