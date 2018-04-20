package com.sachin.algorithms.linkedList;

public class RunningLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.insert(3);
		ll.insert(13);
		ll.insert(23);
		ll.insert(33);
		ll.insert(43);

		// insert at index
		ll.insert(4, 14);
		
		// insert at end
		ll.insertAtEnd(20);
		
		System.out.println("Before Delete: ");
		for(int i=0; i<ll.size(); i++){			
			System.out.println("Index: " + i + "-> " + ll.get(i));
		}
		
		// delete any element
		ll.delete(1);
		ll.delete(5);
		ll.delete(4);
		
		// delete at index
		//ll.show();
		
		// get at index
		System.out.println("After delete:");
		for(int i=0; i<ll.size(); i++){			
			System.out.println(ll.get(i));
		}
		

		
		
		// doubly linked list
		// questions on linked list
		System.out.println("size is: " + ll.size());
	}

}
