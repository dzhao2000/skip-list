package app;


public class Entry<K extends Comparable<K>,V>{
	private K key;
	private V value;
	
	public Entry(K newKey, V newValue) {
		this.key = newKey;
		this.value = newValue;
	}
	
	public K returnKey() {
		return this.key;
	}
	
	public V returnValue() {
		return this.value;
	}
	@Override
	public String toString() {
		return String.valueOf(this.key);
	}

}
