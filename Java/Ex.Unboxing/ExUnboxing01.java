/*
  It is the process of converting a reference type object to a compatible value type object.
 */

public class ExUnboxing01 {
    public static void main(String[] args) {

        int  x = 10;

        Object obj = x;

        int y = (int)obj;

        System.out.println(y);
        
    }
    
}
