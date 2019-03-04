package sumador;

public class ASumar {
	
	String valorInicial;
	/**
	 * M�todo constructor para almacenar la variable
	 * @author Salvador Galindo Mart�nez
	 * @param string
	 * @version 1.0
	 */
	public ASumar(String string) {
		this.valorInicial = string;
	}
	
	/**
	 * M�todo que muestra una cadena de texto vac�a si el n�mero introducido
	 * es negativo.
	 * @author Salvador Galindo Mart�nez
	 * @version 1.0
	 * @return 
	 */
	public String total() {
		int suma = 0;
		String fin = "";
		for(int i = 0; i < valorInicial.length();i++) {
			String digito = valorInicial.substring(i, i+1);
			suma += Integer.parseInt(digito);
			if (i < 1) {
				fin += digito;
			}else {
				fin += " + " + digito;
			}
		}
		return (fin + " = " + suma);
	}
}
