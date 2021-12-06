package views;

public class ResultadoVerm extends Resultado{

	public ResultadoVerm(int resultado) {
        super(resultado);
	}
	
	public String exibeResultado() {
		if(this.deficiencia == 0) {
			return ("Você não aparenta ter protanopia");
		} else {
			return ("Você pode ter protanopia, por favor consulte um médico");
		}
	}

}
