package edu.escuelaing.arem;

/**
 * @author Fernando Barrera Barrera
 *
 */

public class listaEnlazada {
	
	private Node head;
	private Node tail;
	private int size;
	
	/**
     *Este metodo es el constructor de la estructura de datos de lista enlazada doble 
     *
     */

	public listaEnlazada() {
		this.size=0;
		this.head = new Node(0,null,null,size);
	}
	
	/**
     * Este metodo adiciona un nodo al final de la lista
     *
     * @param valor es el valor real del nuevo nodo a adicionar a la lista
     */
	
	public void add(double valor) {
		if(this.size == 0) {
			this.head.setData(valor);
			this.tail = head;
			size+=1;
		}	
		else {
			Node node=new Node(valor,null,null,size);
			if( 0 < size) {
				node.setPriorNode(this.getNode(node.getIndex()-1));
			}
			size+=1;
			Node nextNode = this.head;
			while(nextNode.getNextNode() != null) {
				nextNode= nextNode.getNextNode();
			}
			nextNode.setNextNode(node);
			tail = node;
		}
	}
	
	/**
     * Este metodo printea la lista enlazada mostrando sus respectivos indices y el valor real que tiene asignado cada metodo
     */
	
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
			nextNode= nextNode.getNextNode();
		}
	}
	
	/**
     * Este metodo retorna la longitud de la lista
     * 
     * @return la longitud de la lista
     */
	
	public int size() {
		return size;
	}
	
	/**
     * Este metodo devuelve un nodo especifico dado su posicion en la lista
     * 
     * @param index el indice del nodo que se solicita dentro de la lista
     * @return la longitud de la lista
     */
	 
	
	public Node getNode(int index) {
		Node res = null;
		Node nextNode = this.head;
		for(int i=0;i<size;i++) {
			if(nextNode.getIndex() == index) {
				res = nextNode;
				break;
			}
			else {
				nextNode= nextNode.getNextNode(); 
			}
		}
		return res;
	}
	
	/**
     * Este metodo retorna el nodo que esta en la cabeza de la lista
     * 
     * @return la cabeza de la lista
     */
	
	public Node getHead() {
		return this.head;
	}
	
	/**
     * Este metodo retorna el nodo que esta en la cola de la lista
     * 
     * @return la cola de la lista
     */
	
	public Node getTail() {
		return this.tail;
	}
	
	/**
     * Este metodo retorna el valor de la media aritmetica de los valores dentro de la lista 
     * 
     * @return el valor de la media aritmetica de la lista
     */
	
	public double getMean() {
		double acum = 0;
		Node nextNode = this.head;
		for(int i = 0;i < size ; i++) {
			acum+=nextNode.getData();
			nextNode= nextNode.getNextNode(); 
			
		}
		return acum/size;
		
	}
	
	/**
     * Este metodo retorna el valor de la desviacion estandar  de los valores dentro de la lista 
     * 
     * @return el valor de la desviacion estandar de la lista
     */
	
	public double getStandardDesviation() {
		double acum = 0;
		Node nextNode = this.head;
		for(int i = 0;i < size ; i++) {
			acum+=Math.pow(nextNode.getData()-this.getMean(),2);
			nextNode= nextNode.getNextNode(); 
			
		}
		return  Math.sqrt((acum/(size-1)));
	}
	
	/**
     * Este metodo elimina el nodo dado de la lista 
     * 
     * @param node el nodo a eliminar de la lista
     */
	
	public void remove(Node node) {
		Node nextNode = this.head;
		boolean eliminated = false;
		if(node.getIndex() == size-1) {
			size-= 1;
			Node base = this.getNode(node.getIndex()-1);
			base.setNextNode(null);
			this.tail = base;
		}
		else {
			while(nextNode.getNextNode() != null) {
				if(node.equals(nextNode)) {
					eliminated = true;
					size-= 1;
					if(node.getIndex() == 0) {
						this.head = head.getNextNode();
						head.setIndex(0);
						head.setPriorNode(null);
					}
					else {
						Node base = this.getNode(node.getIndex()-1);
						Node next = this.getNode(node.getIndex()+1);
						base.setNextNode(node.getNextNode());
						next.setPriorNode(node.getPriorNode());
						base.getNextNode().setIndex(base.getIndex()+1);
					}
					nextNode= nextNode.getNextNode();
				}
				else {
					if(eliminated) {
						nextNode= nextNode.getNextNode();
						nextNode.setIndex(nextNode.getIndex()-1);
					}
					else {
						nextNode= nextNode.getNextNode();
					}
				}
				
			}
		}
		
	}
}
