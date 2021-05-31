package pilha.implementacao;

public class Node<E> {
	// Vari�veis de inst�ncia
	private E element;
	private Node<E> next;
	
	// Cria um nodo com refer�ncias nulas para os seus elementos e o pr�ximo nodo
	public Node() { this(null, null); }
	
	// Cria um nodo com um dado elemento e o pr�ximo nodo
	public Node(E e, Node<E> n) {
	element = e;
	next = n;
	}
	
	// M�todos de acesso:
	public E getElement() { return element; }
	public Node<E> getNext() { return next; }
	
	// M�todos modificadores:
	public void setElement(E newElem) { element = newElem; }
	public void setNext(Node<E> newNext) { next = newNext; }
}

