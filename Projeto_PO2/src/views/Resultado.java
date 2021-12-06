package views;

public abstract class Resultado {
	protected int deficiencia;

	public Resultado(int resultado) {
		// se tem dficiencia = 1, se não = 0
		this.deficiencia = resultado;
	}
	
	public abstract String exibeResultado();

}
