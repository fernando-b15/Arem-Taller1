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
	private Node nodReference;
	private double data;
	private int index;
	public Node(double data,Node reference,int index) {
		this.data=data;
		this.index=index;
		this.nodReference=reference;
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
	
	public Node getNodeReference() {
		return this.nodReference;
	}
	
	public void setNodeReference(Node newReference) {
		
		this.nodReference=newReference;
	}

}
