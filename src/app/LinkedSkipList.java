package app;

public class LinkedSkipList<V> implements SkipList<V>{
	private QuadNode<Entry<Integer,V>> startPosition;
	private int skipHeight;
	/**
	 * Constructs a LinkedSkipList instance.
	 */
	public LinkedSkipList() {
		QuadNode<Entry<Integer,V>> end = new QuadNode<>(new Entry<Integer,V>(Integer.MAX_VALUE, null), this.startPosition, null);
		this.startPosition = new QuadNode<>(new Entry<Integer, V>(Integer.MIN_VALUE, null), null, end);
		this.skipHeight = 0; 
	}
	@Override
	public int size() {
		int count = 0;
		QuadNode<Entry<Integer,V>> node = this.startPosition;
		while (node != null) {
			count++;
			node = node.getNext();
		}
		return count;
	}
	@Override
	public void insert(Integer key, V val) {
		if (val == null) {
			throw new AssertionError("Cannot insert null");
		}
		QuadNode<Entry<Integer,V>> pos = skipSearch(key);
		QuadNode<Entry<Integer,V>> above = null;
		while (generateBool()) {
			
		}
	}
	@Override
	public Entry<Integer,V> get(Integer obj) {
		return skipSearch(obj).getEntry();
	}
	@Override
	public Integer deleteKey(Integer toDelete) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Pseudo-random generation of boolean values.
	 */
	private static boolean generateBool() {
		return Math.random() > 0.5;
	}
	private QuadNode<Entry<Integer,V>> skipSearch(Integer obj) {
		QuadNode<Entry<Integer,V>> pos = this.startPosition;
		while (pos.getBelow() != null) {
			pos = pos.getBelow();
			while (obj.compareTo(pos.getEntry().returnKey()) >= 0) {
				pos = pos.getNext();
			}
		}
		return pos;
	}
}
