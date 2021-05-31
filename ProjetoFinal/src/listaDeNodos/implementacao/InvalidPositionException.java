package listaDeNodos.implementacao;

/* Exce��o lan�ada se a posi��o fornecida como argumento n�o � v�lida (por
* exemplo, se � uma refer�ncia nula ou n�o tem lista associada). */

@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {
	public InvalidPositionException(String err) { super(err); }
}