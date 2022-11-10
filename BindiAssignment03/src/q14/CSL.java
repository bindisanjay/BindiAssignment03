package q14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = Collections.synchronizedList(new ArrayList<String>());

		data.add("A");
		data.add("B");
		data.add("C");

		synchronized(data)
		{
			Iterator T = data.iterator();

			while (T.hasNext())
				System.out.println(T.next());
		}
	}

}
