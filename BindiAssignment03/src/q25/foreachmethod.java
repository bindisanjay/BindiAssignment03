package q25;

import java.util.ArrayList;
import java.util.List;

public class foreachmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> subList = new ArrayList<String>();
        subList.add("northwest");
        subList.add("missouri");
        subList.add("state");
        subList.add("university");
        subList.add("maryville");
        System.out.println("------------college name--------------");
        subList.forEach(sub -> System.out.println(sub));
	}

}
