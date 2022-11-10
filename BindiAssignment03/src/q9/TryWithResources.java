package q9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str;
			try(BufferedReader bf = new BufferedReader(new FileReader("File.txt"))) {
	     		 while ((str = bf.readLine()) != null) {
	       	 System.out.println("String"+str);
	      }
	    		} catch (IOException e) {
	     	 System.out.println("IOException in try block " + e.getMessage());
	    }
	  }

	}



