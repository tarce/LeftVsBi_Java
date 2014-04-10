package leftVsBi.dataStruct;

public class CircularArrayQueue implements Queue {
	
	private int start;
	private int end;
	private int length = 10;
	private Object [] queue;

	public CircularArrayQueue () {
		length = 10;
	}
	
	public CircularArrayQueue (int theLength) {
		length = theLength;
		queue = new Object [length];
	}
	
	@Override
	public boolean isFull() {
		return ( ((end + 1) % length) == start );
	}

	@Override
	public boolean isEmpty() {
		return start==end;
	}

	@Override
	public void push(Object obj) {
		
		// Double the queue size if full
        if(isFull()){
        	
			// create new queue of double the size
			Object [] oldQueue = queue;
			queue = new Object [ 2*length ];
			
			// find the first position holding data (aka the front), which
			// is one position after the start pointer.		
			int front = (start + 1) % length;
			
			// if the front is 1 or 0, then copy the whole thing into the new queue
			if (front < 2) {
				System.arraycopy(oldQueue, front, queue, 0, length-front);
			}
			
			// otherwise, copy the elements starting at front into the queue,
			// and then the elements before front into the queue to keep
			// things in order.
			else {
				System.arraycopy(oldQueue, front, queue, 0, length-front);
				System.arraycopy(oldQueue, 0, queue, length-front, end+1);
			}

			// set correct values for start, end, length and queue
			start = 2 * length - 1;
			end = length - 2;
			length *= 2;
  
        }
        
        // Push the object into the queue
        end = (end + 1) % length;
        queue[end] = obj;
        
	}

	@Override
	public Object pop() throws QueueEmptyException {
		
		Object item; 
		
		if( isEmpty() ) {
            throw new QueueEmptyException();
        }
		else {
			int front = (start + 1) % length;
			item = queue[front];
			queue[front] = null;
            start = (start + 1) % length;
        }
		
		return item;
		
	}
	
}
