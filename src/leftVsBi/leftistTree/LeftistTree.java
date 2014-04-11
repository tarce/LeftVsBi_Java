package leftVsBi.leftistTree;

import leftVsBi.dataStruct.*;

/**
 * 
 * @author terek
 *
 */
public class LeftistTree {
	
	private TreeNode root;
	private int treeSize;
	
	/**
	 * 
	 */
	public LeftistTree () {
		root = null;
		treeSize = 0;
	}
	
	/**
	 * 
	 * @param elements
	 * @param size
	 */
	public void initialize (int [] elements, int size) {
		treeSize = size;
		
		CircularQueue q = new CircularQueue( size );

		// put all the elements in the queue
		for (int i = 0; i <= size - 1; i++) {
			q.push(new TreeNode( elements[i] ));
		}

		// pop 2 trees from the queue and meld them
		// then push the result back on queue
		// continue till done
		TreeNode first, second;
		for (int i = 1; i <= size; i++) {
			
			// get first tree node
			try {
				first = (TreeNode) q.pop();
			}
			catch (EmptyException e) {
				first = null;
			}
			
			// get second tree node
			try {
				second = (TreeNode) q.pop();
			}
			catch (EmptyException e) {
				second = null;
			}
			
			// meld the two tree nodes pushing the result back into the queue
			q.push(meld(first, second));
			
		}

		// set the root if the tree is not empty
		if (treeSize > 0)
			root = (TreeNode) q.pop();
	}
	
	/**
	 * Adapted from wikipedia Leftist Tree: http://en.wikipedia.org/wiki/Leftist_tree
	 * 
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	private TreeNode meld (TreeNode first, TreeNode second) {
		
		// cases where one tree or the other is empty
		if(first == null)
			return second;
		if(second == null)
			return first;
		
		// set first to be the min of the two trees
		if(first.element > second.element) {  
			TreeNode temp = first;
			first = second;
			second = temp;
		}
		
		// set the min's right child to be the result of 
		// melding the min's right child with the other tree
		first.rightChild = meld(first.rightChild, second);
		
	    // if left child doesn't exist, move right child to the left side
		if(first.leftChild == null) {
			first.leftChild = first.rightChild;
			first.rightChild = null;
		} 
		
		 // left child does exist, so compare s-values
		else {
			
			// swap the children if right child has larger sValue
			if(first.leftChild.sValue < first.rightChild.sValue) {
				TreeNode temp = first.leftChild;
				first.leftChild = first.rightChild;
				first.rightChild = temp;
			}
			
			// since we know the right child has the lower s-value, we can just
			// add one to its s-value
			first.sValue = first.rightChild.sValue + 1;
		}
		
		return first;
		
	}

	/**
	 * 
	 * @param element
	 */
	public void push (int element) {
		root = meld(root, new TreeNode (element));
	}
	
	/**
	 * 
	 */
	public void pop() {
		
		if (root != null) {
			TreeNode right = root.rightChild;
			root = root.leftChild;
			root = meld (root, right);
			treeSize--;
		}
		else {
			throw new EmptyException();
		}
		
	}
	
	/**
	 * 
	 */
	public void print() {
		
		int nodesCurrentLevel = 1;
		int nodesNextLevel = 0;
		CircularQueue q = new CircularQueue();
		TreeNode temp = root;

		while (temp != null) {
			System.out.print(temp);

			// put temp's children on q
			if (temp.leftChild != null) {
				q.push(temp.leftChild);
				nodesNextLevel += 1;
			}
			if (temp.rightChild != null) {
				q.push(temp.rightChild);
				nodesNextLevel += 1;
			}

			// get next node to visit
			try {temp = (TreeNode) q.pop();}
			catch (EmptyException e) {return;}

			nodesCurrentLevel--;

			// determine if you should move on to next level
			if (nodesCurrentLevel == 0) {
				System.out.println();
				nodesCurrentLevel = nodesNextLevel;
				nodesNextLevel = 0;
			}
			
		}
		
	}
	
}
