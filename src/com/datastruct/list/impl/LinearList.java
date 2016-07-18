package com.datastruct.list.impl;

import com.datastruct.list.List;

public class LinearList<T> implements List {

	private Object[] data;
	private int size;

	public LinearList() {
		data = new Object[0];
	}

	@Override
	public void clear() {
		for(int i = 0; i < size; i++){
			data[i] = null;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T get(int i) {
		return (T)data[i];
	}

	@Override
	public void set(int i, Object value) {
		data[i] = value;
	}

	@Override
	public boolean insertEnd(Object value) {
		data[size++] = value;
		return true;
	}

	@Override
	public boolean insertFront(Object value) {
		System.arraycopy(data, 0, data, 1, size++);;
		data[0] = value;
		return true;
	}

	@Override
	public boolean deleteFront() {
		System.arraycopy(data, 1, data, 0, size--);
		return true;
	}

	@Override
	public boolean delete(Object value) {
		
		for(int i = 0; i < size; i++){
			if(data[i] == value){
				System.arraycopy(data, i + 1, data, 1, size--);
				return true;
			}
		}
		
		return false;
	}

	public void sort(){
		
	}

}
