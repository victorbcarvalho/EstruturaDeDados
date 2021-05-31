package listaDeNodos.implementacao;

/* Exce��o lan�ada se for feita uma tentativa de acessar um elemento cuja
* posi��o est� fora do intervalo de posi��es da lista (por exemplo, chamando-se
* o m�todo next sobre a �ltima posi��o da sequ�ncia). */

@SuppressWarnings("serial")
public class BoundaryViolationException extends RuntimeException {
	public BoundaryViolationException(String err) { super(err); }
}