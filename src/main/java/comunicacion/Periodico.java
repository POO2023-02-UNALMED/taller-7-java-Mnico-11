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
	@Override
	public int palabrasTotales(int parametro) {
		return super.getPaginas() * parametro *10;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		return super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+this.fecha+"\n"+this.primicia;
	}

}
