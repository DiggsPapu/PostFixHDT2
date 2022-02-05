package postfixcalc;
/***
 * Clase de los nodos para moverse dentro del stack
 * @author diego alonzo
 *
 * @param <T> Generics
 */
public class Node<T> {
	/**
	 * Creaci�n del nodo, con su valor y su apuntador.
	 */
	private T Value;
	Node<T> next;
	/**
	 * Creaci�n del nodo inicial, cuando no tiene a qui�n apuntar.
	 */
	public Node() {
		next = null;
	}
	/**
	 * Creaci�n del par�metro de los nodos cuando tiene al menos a un nodo a qui�n apuntar. Es un valor gen�rico
	 * @param Value
	 */
	public Node(T Value) {
		this.Value = Value;
		next = null;
	}
	/**
	 * M�todos de getter y setters de value y next
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
