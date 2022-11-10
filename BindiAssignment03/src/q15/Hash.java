package q15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			Hashtable<Integer,String> HashTable1=new Hashtable<Integer,String>();
			HashTable1.put(101,"A");
			HashTable1.put(101,"B");
			HashTable1.put(102,"C");
			HashTable1.put(103,"D");
			System.out.println("-------------Hash table--------------");
			for (Map.Entry ht:HashTable1.entrySet()) {
				System.out.println(ht);
			}

			//----------------hashmap--------------------------------
			HashMap<Integer,String> HashMap1=new HashMap<Integer,String>();
			HashMap1.put(100,"A");
			HashMap1.put(104,"B"); 
			HashMap1.put(101,"C");
			HashMap1.put(102,"D");
			System.out.println("-----------Hash map-----------");
			for (Map.Entry hm:HashMap1.entrySet()) {
				System.out.println(hm.getKey()+" "+hm.getValue());
			}

		}
	}
