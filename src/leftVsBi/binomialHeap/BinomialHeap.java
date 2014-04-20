package leftVsBi.binomialHeap;

import leftVsBi.dataStruct.EmptyException;

public class BinomialHeap {
	
	Node min;
	int maxDegree;
	Node [] treeTable;
	
	public BinomialHeap() {
		
		min = null;
		maxDegree = 14;
		treeTable = new Node[maxDegree];
		
	}
	
	public BinomialHeap( int theMaxDegree ) {
		
		min = null;
		maxDegree = theMaxDegree;
		treeTable = new Node[maxDegree];
		
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
		if (isEmpty()) {throw new EmptyException();}
		
		// if top level list exists
		else {			
			
			// if only top level list exist
			if (min.child == null) {			
				
				// case where there is only one node in the to level list
				if (min.sibling == min) {min = null;}		
				
				// case where there is more than one node in the top level list
				else {
					
					min.copyBack(min.sibling);
					// NOTE that at this point min is 
					// NOT necessarily the minimum
					min = pairwiseCombine(min);
					
				}
				
			}
			
			// if children exists (hence, 1 or more trees exist)
			else {	
				
				// case where there is only one node (tree) in the top level list
				if (min.sibling == min) {
					
					min = min.child;
					min = pairwiseCombine(min);
					
				}	
				
				// case where there is more than one node (tree) in the top level list
				else {
					
					Node childTree = min.child;
					min.copyBack(min.sibling);
					// NOTE that at this point min is 
					// NOT necessarily the minimum
					min = meld (min, childTree);
					min = pairwiseCombine(min);
					
				}
				
			}
			
		}
		
	}
	
	/**
	 * 
	 * @param start
	 * @return
	 */
	private Node pairwiseCombine(Node start) {
		//TODO copy back and delete from list
		Node current = start.sibling;
		boolean stop = false;
		while (!stop) {
			if (treeTable[current.degree] == null) {
				treeTable[current.degree] = current;
			}
			else {
				
				if (current.element <= treeTable[current.degree].element)
					current.child = 
				
			}
			
			// update current and determine if we should stop
			current = current.sibling;
			if (current == start) {
				stop = true;
			}
		}
		
		if (treeTable[current.degree] == null) {
			treeTable[current.degree] = current;
		}
		else {
			
		}
		
		

	}
}