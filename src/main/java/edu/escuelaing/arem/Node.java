/**
 * 
 */
package edu.escuelaing.arem;

/**
 * @author Fernando Barrera Barrera
 *
 */
public class Node {

	/**
	 * 
	 */
	private Node nextNode;
	private Node priorNode;
	private double data;
	private int index;
	public Node(double data,Node prior,Node next,int index) {
		this.data=data;
		this.index=index;
		this.nextNode=prior;
		this.priorNode=next;
	}
	
	public double getData() {
		return this.data;
	}
	
	public void setData(double newData) {
		this.data=newData;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setIndex(int newIndex) {
		this.index=newIndex;
	}
	
	public Node getNextNode() {
		return this.nextNode;
	}
	
	public void setNextNode(Node newNextNode) {
		
		this.nextNode=newNextNode;
	}
	
	public Node getPriorNode() {
		return this.priorNode;
	}
	
	public void setPriorNode(Node newPriorNode) {
		
		this.priorNode=newPriorNode;
	}

}
