package q6;

public class Example {
 
		 public static String concatWithString()    {  
		        String J = "APP";  
		        for (int i=0; i<10000; i++){  
		            J = J + "Design";  
		        }  
		        return J;  
		    }  
		    public static String concatWithStringBuffer(){  
		        StringBuffer StrBuffer = new StringBuffer("Java");  
		        for (int i=0; i<10000; i++){  
		            StrBuffer.append("Tpoint");  
		        }  
		        return StrBuffer.toString();  
		    }  
		    public static void main(String[] args){  
		        long startTime = System.currentTimeMillis();  
		        concatWithString();  
		        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
		        startTime = System.currentTimeMillis();  
		        concatWithStringBuffer();  
		        System.out.println("Time taken by Concating with StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
		    }  
		
	}


