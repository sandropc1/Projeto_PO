package views;

public class ResultadoAmar extends Resultado {

	public ResultadoAmar(int resultado) {
		super(resultado);
	}

	public String exibeResultado() {
		if(this.deficiencia == 0) {
			return ("Você não aparenta ter trinatopia");
		} else {
			return ("Você pode ter trinatopia, por favor consulte um médico");
		}
	}
	
}
