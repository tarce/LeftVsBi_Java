package leftVsBi.binomialHeap;

public class Node {
	
	public Node child;
	public Node sibling;
	public int element;
	public int degree;
	
	public Node () {
		
		child = null;
		sibling = null;
		element = 0;
		degree = 0;
		
	}
	
	public Node (int theElement) {
		
		child = null;
		sibling = null;
		element = theElement;
		degree = 0;
		
	}
	
	public void copyBack(Node theNode){
		child = theNode.sibling;
		sibling = theNode.sibling;
		element = theNode.element;
		degree = theNode.degree;
		
	}
	
	@Override
	public String toString() {
		return " " + element;
	}
}
