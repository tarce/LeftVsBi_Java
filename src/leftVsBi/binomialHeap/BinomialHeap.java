package leftVsBi.binomialHeap;

import leftVsBi.dataStruct.EmptyException;

public class BinomialHeap {
	
	Node min;
	int maxDegree;
	
	public BinomialHeap() {
		
	}
	
	public BinomialHeap( int maxDegree ) {
		
	}
	
	private boolean isEmpty() {
		return min == null;
	}
	
	public void push ( int element ) {
		
		// add new node to top level list
		if (min != null) {
			min = meld ( min, new Node ( element ) );
		}
		
		// otherwise, create top level list of just the new min
		else {
			min = new Node( element );
			min.sibling = min;
		}
		
	}
	
	private Node meld (Node tree1, Node tree2) {
		
		Node result = null;
		
		Node temp = tree1.sibling;
		tree1.sibling = tree2.sibling;
		tree2.sibling = temp;
		
		if (tree1.element <= tree2.element) {
			result = tree1;
		}
		else {
			result = tree2;
		}
		
		return result;
		
	}
	
	public void removeMin() {
		
		// if heap doesn't exist
		if (isEmpty()) {
			throw new EmptyException();
		}
		
		// if heap exists
		else {
			if (min.sibling == min) {
				min = null;
			}
			else {
				Node temp = min.sibling.sibling;
				
				min = min.child.clone();
				min
			}
		}
		
	}
}