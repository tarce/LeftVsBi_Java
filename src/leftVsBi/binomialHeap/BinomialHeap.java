package leftVsBi.binomialHeap;

import leftVsBi.dataStruct.EmptyException;

public class BinomialHeap {
	
	Node min;
	int maxDegree;
	
	public BinomialHeap() {
		
	}
	
	public BinomialHeap( int maxDegree ) {
		
	}
	
	public void push ( int element ) {
		
		// add new node to top level list
		if (min != null) {
			Node temp = min.sibling;
			min.sibling = new Node( element );
			min.sibling.sibling = temp;
			if (min.element > min.sibling.element) {
				min = min.sibling;
			}
		}
		
		// otherwise, create top level list of just the new min
		else {
			min = new Node( element );
			min.sibling = min;
		}
		
	}
	
	public void removeMin() {
		
		// if heap exists
		if (min != null) {
			
			Node temp = min.child;
			
			// if there are children
			if (temp != null) {
				
			}
			
			// if there are no children (only top level list)
			else {
				
				// combine the top level trees
				if (min != min.sibling) {
					min.sibling.sibling = min.sibling;
					min->copy(min->sibling);
					pairWiseCombine();
				}
				// no tree is left so set min back to null
				else {
					min = NULL;
				}
				
				
			}
			
			
			
			
		}
		else {
			throw new EmptyException();
		}
		
	}
	
}
