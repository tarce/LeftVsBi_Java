package leftVsBi.leftistTree;

public class TreeNode<T> {
	public TreeNode<T> leftChild;
	public TreeNode<T> rightChild;
	public T element;
	
	public TreeNode () {
		leftChild = null;
		rightChild = null;
		element = null;
	}
	
	public TreeNode (T theElement) {
		leftChild = null;
		rightChild = null;
		element = theElement;
	}
	
	public TreeNode (TreeNode<T> left, TreeNode<T> right, T theElement) {
		leftChild = left;
		rightChild = right;
		element = theElement;
	}

}
