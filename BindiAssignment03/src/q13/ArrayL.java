package q13;
import java.io.*; 
import java.util.*; 

public class ArrayL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> persons = new ArrayList<String>(); 
		 
				persons.add("A"); 
				persons.add("B"); 
				persons.add("C"); 
				persons.add("D"); 
		 
				
				System.out.println("Persons:"); 
				Iterator iterator = persons.iterator(); 
				while (iterator.hasNext()) 
					System.out.println(iterator.next()); 
		 
			}


		}
