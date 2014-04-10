package leftVsBi.leftistTree;

public class LeftistTree<T> {
	
	private TreeNode<T> root;
	private int treeSize;
	
	public LeftistTree () {
		root = null;
		treeSize = 0;
	}
	
	public LeftistTree (T [] elements, int size) {
		treeSize = size;
		
	}
}
