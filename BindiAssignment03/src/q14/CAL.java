package q14;
import java.io.*;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> Data = new CopyOnWriteArrayList<String>();

		
		Data.add("A");
		Data.add("B");
		Data.add("C");

		System.out.println("Elements :");

		
		Iterator<String> T = Data.iterator();

		while (T.hasNext())
			System.out.println(T.next());
	}

}
