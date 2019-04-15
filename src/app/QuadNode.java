package app;

public class QuadNode<K extends Entry<?,?>> {
	private K entry;
	private QuadNode<K> next;
	private QuadNode<K> prev;
	private QuadNode<K> up;
	private QuadNode<K> below;
	
	public QuadNode() {
	}
	
	public QuadNode(K newEntry) {
		this.entry = newEntry;
	}
	public QuadNode(K newEntry, QuadNode<K> newPrev, QuadNode<K> newNext) {
		this(newEntry);
		this.entry = newEntry;
		this.prev = newPrev;
	}
	public void setTop(QuadNode<K> newUp) {
		this.up = newUp;
	}
	public void setBottom(QuadNode<K> newButtom) {
		this.below = newButtom;
	}

	public K getEntry() {
		return this.entry;
	}

	public QuadNode<K> getNext() {
		return this.next;
	}

	public QuadNode<K> getPrev() {
		return this.prev;
	}

	public QuadNode<K> getUp() {
		return this.up;
	}

	public QuadNode<K> getBelow() {
		return this.below;
	}
	
}
