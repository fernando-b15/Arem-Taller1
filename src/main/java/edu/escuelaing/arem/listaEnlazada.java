package edu.escuelaing.arem;

public class listaEnlazada {
	
	private Node head;
	private Node tail;
	private int size;
	
	

	public listaEnlazada() {
		this.size=0;
		this.head = new Node(0,null,size);
	}
	
	public void add(double valor) {
		if(this.size == 0) {
			this.head.setData(valor);
			this.tail = head;
			size+=1;
		}	
		else {
			Node node=new Node(valor,null,size);
			size+=1;
			Node nextNode = this.head;
			while(nextNode.getNodeReference() != null) {
				nextNode= nextNode.getNodeReference();
			}
			nextNode.setNodeReference(node);
			tail = node;
		}
	}
	public void print() {
		Node nextNode = this.head;
		System.out.print("LinkedList = { ");
		for(int i = 0;i < size ; i++) {
			System.out.print( nextNode.getIndex() + " : "+ nextNode.getData());
			if(i != size-1) {
				System.out.print(" ; ");
			}
			else {
				System.out.println(" }");
			}
			nextNode= nextNode.getNodeReference();
		}
	}
	public int size() {
		return size;
	}
	public double get(int index) {
		double res = 0;
		Node nextNode = this.head;
		for(int i=0;i<size;i++) {
			if(nextNode.getIndex() == index) {
				res = nextNode.getData();
				break;
			}
			else {
				nextNode= nextNode.getNodeReference(); 
			}
		}
		return res;
	}
	
	public Node getNode(int index) {
		Node res = null;
		Node nextNode = this.head;
		for(int i=0;i<size;i++) {
			if(nextNode.getIndex() == index) {
				res = nextNode;
				break;
			}
			else {
				nextNode= nextNode.getNodeReference(); 
			}
		}
		return res;
	}
	
	public Node getHead() {
		return this.head;
	}
	
	public Node getTail() {
		return this.tail;
	}
	public double getMean() {
		double acum = 0;
		Node nextNode = this.head;
		for(int i = 0;i < size ; i++) {
			acum+=nextNode.getData();
			nextNode= nextNode.getNodeReference(); 
			
		}
		return acum/size;
		
	}
	
	public double getStandardDesviation() {
		double acum = 0;
		Node nextNode = this.head;
		for(int i = 0;i < size ; i++) {
			acum+=Math.pow(nextNode.getData()-this.getMean(),2);
			nextNode= nextNode.getNodeReference(); 
			
		}
		return  Math.sqrt((acum/(size-1)));
	}
	public void remove(Node node) {
		Node nextNode = this.head;
		boolean eliminated = false;
		if(node.getIndex() == size-1) {
			size-= 1;
			Node base = this.getNode(node.getIndex()-1);
			base.setNodeReference(null);
			this.tail = base;
		}
		else {
			while(nextNode.getNodeReference() != null) {
				if(node.equals(nextNode)) {
					eliminated = true;
					size-= 1;
					if(node.getIndex() == 0) {
						this.head = head.getNodeReference();
						head.setIndex(0);
					}
					else {
						Node base = this.getNode(node.getIndex()-1);
						base.setNodeReference(node.getNodeReference());
						base.getNodeReference().setIndex(base.getIndex()+1);
					}
					nextNode= nextNode.getNodeReference();
				}
				else {
					if(eliminated) {
						nextNode= nextNode.getNodeReference();
						nextNode.setIndex(nextNode.getIndex()-1);
					}
					else {
						nextNode= nextNode.getNodeReference();
					}
				}
				
			}
		}
		
	}
}
