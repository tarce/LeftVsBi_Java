package leftVsBi.leftistTree;

/**
 * 
 * @author terek
 *
 */
public class TreeNode {
	
	public TreeNode leftChild;
	public TreeNode rightChild;
	public int element;
	public int sValue;
	
	public TreeNode () {
		
		leftChild = null;
		rightChild = null;
		element = 0;
		sValue = 0;
		
	}
	
	public TreeNode (int theElement) {
		
		leftChild = null;
		rightChild = null;
		element = theElement;
		sValue = 1;
		
	}
	
	public TreeNode (TreeNode left, TreeNode right, int theElement, int sVal) {
		
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
