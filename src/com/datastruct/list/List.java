package com.datastruct.list;

/**
 * 线性结构
 * @author qiuwanchi<br/>
 * @date: 2016年5月30日 <br/>
 */
public interface List<T> {
	
	public void clear();
	
	public int size();
	
	public boolean isEmpty();
	
	public T get(int i);
	
	public void set(int i, T value);
	
	public boolean insertEnd(T value);
	
	public boolean insertFront(T value);
	
	public boolean deleteFront();
	
	public boolean delete(T value);
	
	public void sort();
	
}
