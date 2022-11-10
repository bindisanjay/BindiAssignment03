package q13;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector persons = new Vector(); 
		 
		
		persons.addElement("A"); 
		persons.addElement("B"); 
		persons.addElement("C"); 
		persons.addElement("D"); 
 
		
		System.out.println("Persons:"); 
		Enumeration enumeration = persons.elements(); 
		while (enumeration.hasMoreElements()) 
			System.out.println(enumeration.nextElement());
	}



}
