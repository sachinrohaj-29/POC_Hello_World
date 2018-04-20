package com.sachin.algorithms.linkedList;

public class LinkedList<T>{

	Node<T> start;
	
	public void insert(T data){
		Node<T> newNode = new Node<T>();
		newNode.data=data;
		
		Node<T> currentNode = start;		
		
		if(null == start){			
			start=newNode;
		}
		else{			
			while(null != currentNode.node){
				currentNode = currentNode.node;
			}
			currentNode.node = newNode;
		}
	}
	
	public void insert(int index, T data){
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		
		Node<T> currentNode = start;
		Node<T> previousNode;
		
		int counter=0;
		
		if(index < size() && index > -1){
			if(0 == index){
				newNode.node=start;
				start = newNode;
			}
			else{
				while(null != currentNode.node && counter < index){
					previousNode=currentNode;
					currentNode=currentNode.node;
					counter++;
					if(counter == index){
						newNode.node=currentNode;
						previousNode.node=newNode;						
					}
				}
			}
		}
		else{
			throw new IndexOutOfBoundsException();
		}						
	}
	
	public void insertAtEnd(T data){
		Node<T> newNode = new Node<T>();
		newNode.data=data;
		
		Node<T> currentNode = start;
		
		while(null != currentNode.node){
			currentNode = currentNode.node;			
		}
		
		newNode.node=currentNode.node;
		currentNode.node=newNode;
	}
	
	// This will delete based on the data present in the list.
	/*public void delete(T data){		
		Node<T> currentNode = start;
		Node<T> previousNode = null;
		
		// When there is only 1 node in the list
		if(start.data.equals(data) && null == start.node){
			start = null;
			return;
		}
		// When the data is present in the 1st node itself
		else if(start.data.equals(data) && null != start.node){
			start = start.node;
		}
		// When data is present someplace in the list
		else{			
			while(null != currentNode.node){				
				if(currentNode.data.equals(data)){					
					previousNode.node=currentNode.node;
					currentNode=currentNode.node;
					// Here we'll not break the loop as there can be multiple occurrences of this data.
				}
				else{
					previousNode=currentNode;
					currentNode=currentNode.node;
				}
			}
			if(currentNode.data.equals(data)){
				previousNode.node=currentNode.node;
			}
		}
	}*/
	
	public void delete(int index){
		Node<T> currentNode = start;
		Node<T> previousNode = null;
		int counter=0;		
		//System.out.println("in delete");
		
		if(index < size() && index > -1){
			if(index == 0){
				start = start.node;
			}			
			else{
				while(null != currentNode.node && counter < size()){
					//System.out.println("in loop: " + counter + " dat: " + currentNode.data);
					if(counter == index){
						//System.out.println("in if");
						previousNode.node = currentNode.node;
						currentNode = currentNode.node;
						//System.out.println("end if");
					}					
						previousNode = currentNode;
						currentNode = currentNode.node;
						counter++;									
				}
				if(counter == index){
					previousNode.node=currentNode.node;
					currentNode=currentNode.node;
				}
			}
		}
		else{
			throw new IndexOutOfBoundsException();
		}		
	}
	
	public T get(int index){
		Node<T> currentNode = start;
		int counter = 0;
		T data=null;
		
		if(index < size() && index > -1)
		{
			while(null != currentNode && index<size()){
				if(counter==index){
					data=currentNode.data;
					break;
				}
				currentNode=currentNode.node;
				counter++;
			}
			return data;
		}
		else{
			throw new IndexOutOfBoundsException();
		}		
	}
	
	public int size(){
		int size=0;
		Node<T> node = start;
		if(null != node){
			size++;
			while(null != node.node){
				node=node.node;
				size++;
			}
		}				
		return size;
	}
	
	// Crappy code, no need of this feature. Iterate the list using the get(index) feature.
	public void show(){
		Node<T> currentNode = start;
		if(null != currentNode){
			while(null != currentNode.node){
				System.out.println(currentNode.data + ": " + currentNode);
				currentNode = currentNode.node;			
			}
			System.out.println(currentNode.data + ": " + currentNode);
		}		
	}
}
