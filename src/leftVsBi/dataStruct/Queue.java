package leftVsBi.dataStruct;

public interface Queue {
	
    public boolean isFull();
     
    public boolean isEmpty();
     
    public void push(Object obj);
     
    public Object pop() throws QueueEmptyException; 

}
