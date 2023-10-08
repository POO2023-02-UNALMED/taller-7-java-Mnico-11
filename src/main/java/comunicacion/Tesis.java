package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String idea, String[] argumentos, String conclusion, String referencias, String interpretacion, String origen, String autor, String titulo, int paginas) {
		super(origen, autor, titulo, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;	
		
	}
	
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String[] getArgumentos() {
		return argumentos;
	}
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getRefencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int parametro) {
		return getPaginas() * parametro *5;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String N = this.getOrigen() + "\n";
		N += this.getTitulo() + "\n";
		N += this.getAutor() + "\n";
		N += this.getPaginas() + "\n";
		N += this.idea + "\n";
		N += this.referencias + "\n";
		N += this.conclusion + "\n";
		N += this.argumentos.length + "\n";
		return N;
	}
	
	

}
