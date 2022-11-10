package q22;

public class stringmutable {

	    private String s;  
	    stringmutable(String s) {  
	    this.s = s;  
	    }  
	    public String getName() {  
	    return s;  
	    }  
	    public void setName(String coursename) {  
	    this.s = coursename;  
	    }  
	    public static void main(String[] args) {  
	    	// TODO Auto-generated method stub
	    stringmutable obj = new stringmutable("hii");  
	    System.out.println(obj.getName());   
	    obj.setName("welcome to patterns and frameworks");  
	    System.out.println(obj.getName());  

	}

}
