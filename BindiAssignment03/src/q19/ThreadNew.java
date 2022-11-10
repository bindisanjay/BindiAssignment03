package q19;

public class ThreadNew implements Runnable {

	public void run(){  
		System.out.println("thread executed...");  
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadNew t1=new ThreadNew();  
		Thread r1 =new Thread(t1);   // Using the constructor Thread(Runnable r)  
		r1.start(); 
	}
	
}

