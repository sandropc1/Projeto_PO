package views;

public class ResultadoVerde extends Resultado {

	public ResultadoVerde(int resultado) {
		super(resultado);
	}
	
	public String exibeResultado() {
		if(this.deficiencia == 0) {
			return ("Você não aparenta ter deuteranopia");
		} else {
			return ("Você pode ter deuteranopia, por favor consulte um médico");
		}
	}

}
