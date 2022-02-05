package postfixcalc;

public class StackNodes<T> implements IStack<T> {
	/**
	 * Es la clase de la pila de nodos que implementa el ADT IStack usando generics
	 */
	private Node<T> head;
	private int count;
	/**
	 * Constructor de la pila
	 */
	public StackNodes() {
		head = null;
	}
/**
 * push para ingresar nuevos nodes
 */
	@Override
	public void push(T value) {
		Node<T> newNode = new Node<T>(value);
		
		if (isEmpty()) {
			head = newNode;
			System.out.print(" Alright ");
		} else {
			newNode.setNext(head);
			head = newNode;
			System.out.print(" EOOOO ");
		}
		count++;
	}
/**
 * Getters y setters
 * @return
 */
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public T pull() {
		
		if (count() == 0) {
			return null;
		} else if(count() == 1) {
			Node<T> temp = head;
			head = null;
			count--;
			return temp.getValue();
		} else {
			Node<T> temp = head;
			head = temp.getNext();
			count--;
			return temp.getValue();
		}
		
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			return null;
		} else {
			return head.getValue();
		}
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return (head == null);
	}

	
}
