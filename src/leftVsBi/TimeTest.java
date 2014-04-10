package leftVsBi;

import leftVsBi.dataStruct.CircularArrayQueue;
import leftVsBi.dataStruct.Queue;

public class TimeTest {

	public static void main(String[] args) {
        Queue queue = new CircularArrayQueue(4);
        
        queue.push("A");
        queue.push("B");
        queue.push("C");
        queue.push("D");
        //queue.enqueue("E");
 //       System.out.println(queue.size());
        System.out.println(queue.pop());
        queue.push("E");
        System.out.println(queue.pop());
        queue.push("F");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push("G");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push("H");
        System.out.println(queue.pop());
        queue.push("I");
        queue.push("J");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        
//        System.out.println(queue.size());

	}

}
