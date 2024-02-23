public class Cola {
	private int data;
	private Cola next;

	public Cola() {
		this.next = null;
	}

	public Cola(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Cola getNext() {
		return next;
	}

	public void setNext(Cola next) {
		this.next = next;
	}

	public boolean isColaEmpty() {
		return next == null;
	}

	public void push(int data) {
		Cola node = new Cola(data);

		if (isColaEmpty())
			next = node;
		else {
			Cola aux = next;
			while (aux.getNext() != null)
				aux = aux.getNext();
			aux.setNext(node);
		}
	}

	public void pop() {
		if (isColaEmpty())
			System.out.println("\n\tThe queue is empty");
		else {
			if (next.getNext() == null)
				next = null;
			else
				next = next.getNext();
			System.out.println("\n\t" + next.data + "was deleted");
		}
	}

	public void show() {
		if (isColaEmpty())
			System.out.println("\n\tThe queue is empty");
		else {
			Cola aux = next;
			System.out.println();
			while (aux != null) {
				System.out.println(aux.getData());
				aux = aux.getNext();
			}
		}
	}
}
