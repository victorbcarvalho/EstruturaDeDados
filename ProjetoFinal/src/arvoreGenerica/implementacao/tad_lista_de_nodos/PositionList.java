package arvoreGenerica.implementacao.tad_lista_de_nodos;

import java.util.Iterator;

import arvoreGenerica.implementacao.interfaces.*;
import arvoreGenerica.implementacao.exception.*;


public interface PositionList<E> extends Iterable<E> {

	// Retorna o número de elementos desta lista.
	public int size();
	
	// Retorna quando a lista está vazia.
	public boolean isEmpty();
	
	// Retorna o primeiro nodo da lista.
	public Position<E> first();
	
	// Retorna o último nodo da lista.
	public Position<E> last();
	
	// Retorna o nodo que segue um dado nodo da lista.
	public Position<E> next(Position<E> p) throws InvalidPositionException, BoundaryViolationException;
	
	// Retorna o nodo que antecede um dado nodo da lista.
	public Position<E> prev(Position<E> p) throws InvalidPositionException, BoundaryViolationException;
	
	// Insere um elemento no início da lista, retornando uma posição nova.
	public void addFirst(E e);
	
	// Insere um elemento na última posição, retornando uma posição nova.
	public void addLast(E e);
	
	// Insere um elemento após um dado elemento da lista.
	public void addAfter(Position<E> p, E e) throws InvalidPositionException;
	
	// Insere um elemento antes de um dado elemento da lista.
	public void addBefore(Position<E> p, E e) throws InvalidPositionException;
	
	// Remove um nodo da lista, retornando o elemento lá armazenado.
	public E remove(Position<E> p) throws InvalidPositionException;
	
	// Substitui o elemento armazenado em um determinado nodo, retornando o elemento que estava lá armazenado.
	public E set(Position<E> p, E e) throws InvalidPositionException;
	
	//public <E> String InveterListaNodos(PositionList<E> l);
	
	// Retorna um iterador sobre todos os elementos da lista.
	public Iterator<E> iterator();

}
