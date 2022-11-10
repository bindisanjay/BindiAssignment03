package q2;

class CovariantA extends Covariant{
	CovariantA get(){return this;}
	void message(){System.out.println("welcome to covariant return type");}

public static void main(String args[]){
new CovariantA().get().message(); 
}
}
