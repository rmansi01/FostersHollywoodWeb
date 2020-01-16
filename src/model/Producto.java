package model;

public class Producto {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String titulo;
	private String body;
	private int categoriaId;
	private String img;
	private String background;
	public Producto(int id, String titulo, String body, int categoriaId, String img, String background) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.body = body;
		this.categoriaId = categoriaId;
		this.img = img;
		this.background = background;
	}
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", titulo=" + titulo + ", body=" + body + ", categoriaId=" + categoriaId
				+ ", img=" + img + ", background=" + background + "]";
	}
	
}
