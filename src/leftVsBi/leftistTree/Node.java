package leftVsBi.leftistTree;

/**
 * 
 * @author terek
 *
 */
public class Node {
	
	public Node leftChild;
	public Node rightChild;
	public int element;
	public int sValue;
	
	public Node () {
		
		leftChild = null;
		rightChild = null;
		element = 0;
		sValue = 0;
		
	}
	
	public Node (int theElement) {
		
		leftChild = null;
		rightChild = null;
		element = theElement;
		sValue = 1;
		
	}
	
	public Node (Node left, Node right, int theElement, int sVal) {
		
		leftChild = left;
		rightChild = right;
		element = theElement;
		sValue = sVal;
		
	}
	
	@Override
	public String toString() {
		return " " + element;
	}

}
