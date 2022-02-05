package postfixcalc;
/***
 * Clase de los nodos para moverse dentro del stack
 * @author diego alonzo
 *
 * @param <T> Generics
 */
public class Node<T> {
	/**
	 * Creación del nodo, con su valor y su apuntador.
	 */
	private T Value;
	Node<T> next;
	/**
	 * Creación del nodo inicial, cuando no tiene a quién apuntar.
	 */
	public Node() {
		next = null;
	}
	/**
	 * Creación del parámetro de los nodos cuando tiene al menos a un nodo a quién apuntar. Es un valor genérico
	 * @param Value
	 */
	public Node(T Value) {
		this.Value = Value;
		next = null;
	}
	/**
	 * Métodos de getter y setters de value y next
	 * @return
	 */
	public T getValue() {
		return Value;
	}
	
	public void setValue(T value) {
		Value = value;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}

}
