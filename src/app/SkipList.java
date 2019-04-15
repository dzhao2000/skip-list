package app;

import app.Entry;

public interface SkipList<V> {
	/**
	 * Returns the size of the SkipList.
	 */
	public int size();
	
	/**
	 * @return whether the key is contained in the SkipList.
	 */
	public Entry<Integer, V> get(Integer obj);
	
	/**
	 * Returns and removes the key if it exists.
	 */
	public Integer deleteKey(Integer toDelete);
	/**
	 * Insert the given element into the SkipList. The element cannot be null.
	 * @param elem The element to insert.
	 */
	void insert(Integer key, V val);



}
