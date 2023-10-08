package comunicacion;

public class Fabula extends Escrito{
	private String enseñanza;
	private String interpretacion;
	
	public Fabula(String enseñanza, String interpretacion, String origen, String autor, String titulo, int paginas) {
		super(origen, titulo, autor, paginas);
		this.enseñanza = enseñanza;
		this.interpretacion = interpretacion;
	}
	
	public String getEnseñanza() {
		return enseñanza;
	}
	public void setEnseñanza(String enseñanza) {
		this.enseñanza = enseñanza;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int parametro) {
		return getPaginas() * parametro * 1;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String N = this.getOrigen() + "\n";
		N += this.getTitulo() + "\n";
		N += this.getAutor() + "\n";
		N += this.getPaginas() + "\n";
		N += this.enseñanza;
		return N;
	}
}
