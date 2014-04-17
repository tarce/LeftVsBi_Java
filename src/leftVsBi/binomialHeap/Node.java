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
	
	public Node clone(){
		return this;
	}
	
	@Override
	public String toString() {
		return " " + element;
	}
}
