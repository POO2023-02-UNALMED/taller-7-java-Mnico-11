package comunicacion;

public abstract class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion = interpretacion;
	}
	
	//métodos get y set
	
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
		
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public int cantidadLetras() {
		return letras.length;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String parrafo = "";
		for (String letra: letras) {
			if (parrafo.equals("")){
				parrafo = parrafo + letra;
			}
			else {
				parrafo = parrafo + ", " + letra;
			}
		}
		return parrafo;
	}

}
