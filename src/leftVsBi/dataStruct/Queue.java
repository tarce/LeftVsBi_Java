package leftVsBi.dataStruct;

public interface Queue {
	
	/**
	 * 
	 * @return
	 */
    public boolean isFull();
    
    /**
     * 
     * @return
     */
    public boolean isEmpty();
    
    /**
     * 
     * @param obj
     */
    public void push(Object obj);
    
    /**
     * 
     * @return
     * @throws EmptyException
     */
    public Object pop() throws EmptyException; 

}
