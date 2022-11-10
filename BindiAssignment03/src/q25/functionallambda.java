package q25;

public class functionallambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lambda expression to create an object 
		new Thread(() -> {
            System.out.println("New thread created");
        }).start();
   	 }

	}
