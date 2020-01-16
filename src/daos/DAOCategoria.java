package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.Conexion;
import model.Categoria;

public class DAOCategoria {
	// select
	public ArrayList<Categoria> getCategorias() {
		ResultSet rs;
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();

		Connection con = Conexion.conecta();
		Statement st;
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * FROM CATEGORIA";
			rs = st.executeQuery(ordenSql);

			while (rs.next()) {
				Categoria categoria = new Categoria();
				categoria.setId(rs.getInt("id"));
				categoria.setNombre(rs.getString("nombre"));
				categorias.add(categoria);
			}
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			System.out
					.println("Error al acceder a la BDs: " + e.getMessage());
		}
		return categorias;
	}

}
