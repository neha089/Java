//recirsion-function call it self
//TODO:print number 
package output;
import java.util.*;


public class recursion {
    public static void printnum(int n){
        if(n>=0){
        System.out.println(n);
      printnum(n-1);
      
    }
}
    public static void main(String[] args){
      int n;
      Scanner s= new Scanner(System.in);
      n=s.nextInt();
      printnum(n);
    }
}
