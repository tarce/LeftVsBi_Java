package leftVsBi;

import leftVsBi.leftistTree.LeftistTree;


public class TimeTest {

	public static void main(String[] args) {
		
		LeftistTree t = new LeftistTree();
		
		int [] elements = {13, 4, 7};
		
		t.initialize(elements, 3);
		
		t.pop();
		t.push(2);
		t.push(11);
		t.push(8);
		t.pop();
		t.push(1);
		t.push(10);
		t.push(5);
		t.pop();
		
		t.print();
		
	}

}
