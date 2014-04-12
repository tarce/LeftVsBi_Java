package leftVsBi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import leftVsBi.dataStruct.EmptyException;
import leftVsBi.leftistTree.LeftistTree;

public class TimeTest {

	public static void main(String[] args) {
		
		if ( args[0].equals("-il") ) {
			
			LeftistTree tree = new LeftistTree ();
			BufferedReader reader = null;
			// System.out.println("Starting leftist tree mode...");
			File file = new File (args[1]);
			
			try {
				reader = new BufferedReader(new FileReader(file));
			} 
			catch (FileNotFoundException e) {
				System.out.println("File not found.");
			}
			
			String line;
			try {
				while ((line = reader.readLine()) != null) {
					
					StringTokenizer st = new StringTokenizer(line);
					String op = st.nextToken();
					
					if ( op.equals("I") ) {
						int value = Integer.parseInt( st.nextToken() );
						// System.out.println( "Inserting " + value + "...");
						tree.push(value);
					}
					else if ( op.equals("D") ) {
						// System.out.println( "Deleting min..." );
						try {
							tree.pop();
						}
						catch (EmptyException e) {
							continue;
						}
					}
					else {break;}
				}	
			} 
		    catch (IOException e) {
				System.out.println("Error reading line of file.");
			}
		    
		    tree.print();
    
		}
		else if ( args[0].equals("-ib") ) {
			System.out.println("Starting binomial heap mode...");
		}
		else if ( args[0].equals("-r") ) {
			System.out.println("Starting random mode...");
		}
		else {
			System.out.println("Invalid argument: -il, -ib, or -r");
		}	
		
	}

}
