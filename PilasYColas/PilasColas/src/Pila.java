public class Pila {
	private int data;
	private Pila next;

	public Pila() {
		this.next = null;
	}

	public Pila(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Pila getNext() {
		return next;
	}

	public void setNext(Pila next) {
		this.next = next;
	}

	public boolean isPilaEmpty() {
		return next == null;
	}

	public void push(int data) {
		Pila node = new Pila(data);

		if (isPilaEmpty())
			next = node;
		else {
			Pila aux = next;
			next = node;
			node.setNext(aux);
		}
	}

	public void pop() {
		if (isPilaEmpty())
			System.out.println("\n\tThe stack is empty");
		else {
			if (next.getNext() == null)
				next = null;
			else
				next = next.getNext();
			System.out.println("\n\t" + next.data + "was deleted");
		}
	}

	public void show() {
		if (isPilaEmpty())
			System.out.println("\n\tThe stack is empty");
		else {
			Pila aux = next;
			System.out.println();
			while (aux != null) {
				System.out.println(aux.getData());
				aux = aux.getNext();
			}
		}
	}
}
