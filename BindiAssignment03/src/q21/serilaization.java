package q21;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serilaization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
            Studentinfo si = new Studentinfo("Sanjay", 100, "S546643");
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.flush();
            oos.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
	class Studentinfo implements Serializable
	{
	    String name;
	    int rid;
	    static String contact;
	    Studentinfo(String n, int r, String c)
	    {
	    this.name = n;
	    this.rid = r;
	    this.contact = c;
	    }
	}


