package q18;

public class ThreadMain extends Thread {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running...");
	 }
	 public static void main(String args[]){
	 ThreadMain t1=new ThreadMain();
	  t1.start();
	  t1.start();
	}

}
