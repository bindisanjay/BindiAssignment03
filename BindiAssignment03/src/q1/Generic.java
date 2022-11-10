package q1;

public class Generic<T> {

	 private T J;

	   public void add(T t) {
	      this.J = t;
	   }

	   public T get() {
	      return J;
	   }
	   
	   
	public static void main(String[] args) {
		Generic<Integer> intGeneric = new Generic<Integer>();
		Generic<String> strGeneric = new Generic<String>();
	    
	      intGeneric.add(new Integer(8));
	      strGeneric.add(new String(" Hello All"));

	      System.out.printf("Int Value :%d\n\n", intGeneric.get());
	      System.out.printf("String Value :%s\n", strGeneric.get());

	}

}
