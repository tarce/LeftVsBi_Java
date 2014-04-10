package leftVsBi.dataStruct;

public interface Queue {
	
    public int size();
     
    public boolean isEmpty();
     
    public void push(Object obj) throws QueueFullException;
     
    public Object pop() throws QueueEmptyException; 

}
