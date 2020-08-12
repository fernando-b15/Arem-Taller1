/**
 * 
 */
package edu.escuelaing.arem;

/**
 * @author Fernando Barrera Barrera
 *
 */
public class Node {

	private Node nextNode;
	private Node priorNode;
	private double data;
	private int index;
	
	/**
     *Este metodo es el constructor de un nodo
     *
     * @param data es el valor real del nodo
     * @param prior es el nodo anterior enlazado al nodo actual
     * @param next es el nodo siguiente enlazado al nodo actual
     * @param index es el indice del nodo actual en la lista
     *
     */
	
	public Node(double data,Node prior,Node next,int index) {
		this.data=data;
		this.index=index;
		this.nextNode=prior;
		this.priorNode=next;
	}
	
	/**
     *Este metodo retorna el valor real del nodo
     *
     *@return el valor real del nodo
     *
     */
	
	public double getData() {
		return this.data;
	}
	
	/**
     *Este metodo setea el valor real del nodo
     *
     *@param newData es el nuevo valor real para setear el nodo
     *
     */ 
	
	public void setData(double newData) {
		this.data=newData;
	}
	
	/**
     *Este metodo devuelve el indice del nodo actual dentro de la lista
     *
     *@return indice del nodo actual en la lista
     *
     */ 
	
	public int getIndex() {
		return this.index;
	}
	
	/**
     *Este metodo setea el valor del indice del nodo dentro de la lista
     *
     *@param newIndex el nuevo index del nodo dentro de la lista
     *
     */ 
	
	public void setIndex(int newIndex) {
		this.index=newIndex;
	}
	
	/**
     *Este metodo retorna el siguiente nodo enlazado al nodo actual
     *
     *@return el siguiente nodo enlazado al nodo actual
     *
     */ 
	
	public Node getNextNode() {
		return this.nextNode;
	}
	
	/**
     *Este metodo setea el siguiente nodo enlazado al nodo actual
     *
     *@param newNextNode el nuevo siguiente nodo enlazado al nodo actual
     *
     */ 
	
	public void setNextNode(Node newNextNode) {
		
		this.nextNode=newNextNode;
	}
	
	/**
     *Este metodo retorna el  nodo anterior enlazado al nodo actual
     *
     *@return el anterior nodo enlazado al nodo actual
     *
     */ 
	
	public Node getPriorNode() {
		return this.priorNode;
	}
	
	/**
     *Este metodo setea el nodo anterior enlazado al nodo actual
     *
     *@param newPriorNode el nuevo nodo anterior enlazado al nodo actual
     *
     */ 
	
	public void setPriorNode(Node newPriorNode) {
		
		this.priorNode=newPriorNode;
	}

}
