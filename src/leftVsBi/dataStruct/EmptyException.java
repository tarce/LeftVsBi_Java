package leftVsBi.dataStruct;

/**
 * 
 * @author terek
 *
 */
@SuppressWarnings("serial")
public class EmptyException extends RuntimeException{
    
	/**
	 * 
	 */
	public EmptyException(){
        super();
    }
	
	/**
	 * 
	 * @param message
	 */
    public EmptyException(String message){
        super(message);
    }
    /**
     * 
     * @param message
     * @param cause
     */
    public EmptyException(String message, Throwable cause){
        super(message, cause);
    }
    
}
