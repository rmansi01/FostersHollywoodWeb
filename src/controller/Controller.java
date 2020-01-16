package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import daos.DAOCategoria;
import daos.DAOProducto;
import model.Categoria;
import model.Producto;


/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String op = request.getParameter("op");
		RequestDispatcher dispatcher;
		ArrayList<Categoria> categorias;
		ArrayList<Producto> productos;
		if (op.equals("inicio")) {
			categorias = new DAOCategoria().getCategorias();
			session.setAttribute("categorias", categorias);
			dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);

		} else if (op.equals("dameplatos")) {
			String categoriaId = request.getParameter("idcategoria");
			int idCategoria = Integer.parseInt(categoriaId);
			ArrayList<Producto> platos =new  DAOProducto().getProductos(idCategoria);
			session.setAttribute("platos", platos);
			dispatcher = request.getRequestDispatcher("platos.jsp");
			dispatcher.forward(request, response);
		} else if(op.equals("damedescripcion")) {
			String productoId = request.getParameter("idproducto");
			int idProducto = Integer.parseInt(productoId);
			Producto producto = new DAOProducto().getProducto(idProducto);
			session.setAttribute("producto", producto);
			dispatcher = request.getRequestDispatcher("plato.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
