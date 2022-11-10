package q25;

import java.util.Optional;


public interface defaultstatic {
	default void default_method(){
        System.out.println("We are default method of interface");
   }
}
class derived_class implements defaultstatic{

}
class Main{
	
  public static void main(String[] args){
       derived_class obj1 = new derived_class();
       obj1.default_method();
   }
}

