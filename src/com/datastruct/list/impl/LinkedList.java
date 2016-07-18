package com.datastruct.list.impl;

import com.datastruct.list.List;

public class LinkedList<T> implements List{

	private Node<T> node;
	private int size;
	
	private static class Node<T>{
		
		private Node<T> prve;
		private T current;
		private Node<T> next;
		
		public Node(Node<T> prve,T current,Node<T> next){
			this.prve = prve;
			this.current = current;
			this.next = next;
		}
		
	}
	
	@Override
	public void clear() {
		Node<T> tempNode = node;
		while(tempNode != null){
			node.current = null;
			tempNode = node.next;
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
		Node<T> tempNode = node;
		while(tempNode.next != null && i >=0){
			
		}
		
		return null;
	}

	@Override
	public void set(int i, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertEnd(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertFront(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFront() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

}
