package q5;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  long beginTime = System.currentTimeMillis();  
	        StringBuffer sbuffer = new StringBuffer("APP");  
	        for (int i=0; i<10000; i++){  
	            sbuffer.append("Design");   
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - beginTime) + "ms");  
	        beginTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("APP");  
	        for (int i=0; i<10000; i++){  
	            sb2.append("Design");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - beginTime) + "ms");
	}

}
