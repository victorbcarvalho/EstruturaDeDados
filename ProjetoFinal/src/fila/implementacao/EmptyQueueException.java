package fila.implementacao;

@SuppressWarnings("serial")
public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException(String err) {
		super(err);
	}
}
