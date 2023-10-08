package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String fecha, String primicia, String interpretacion,String origen, String autor, String titulo, int paginas) {
		super(origen, autor, titulo, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrimicia() {
		return primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int parametro) {
		return getPaginas() * parametro *10;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String N = this.getOrigen() + "\n";
		N += this.getTitulo() + "\n";
		N += this.getAutor() + "\n";
		N += this.getPaginas() + "\n";
		N += this.fecha + "\n";
		N += this.primicia;
		return N;
	}

}
