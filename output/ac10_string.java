// //TODO:Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

// package output;
// import java.util.*;
// public class ac10_string {
//     public static void main ( String [] args){
//       Scanner s= new Scanner(System.in);
//       int size;
//       int tl=0;
//       size=s.nextInt();
//       String name[]=new String[size]; 
//       for(int i=0;i<size;i++){
//         name[i]=s.next();
//         tl+=name[i].length();

//       }
//       System.out.println(tl);
//     }
    
// }
//TODO:replace letter

package output;
import java.util.*;
public class ac10_string {
    public static void main ( String [] args){
      Scanner s= new Scanner(System.in);
      int size;
      int tl=0;
      size=s.nextInt();
      String name[]=new String[size]; 
      for(int i=0;i<size;i++){
        name[i]=s.next();
      }
      for(int i=0;i<size;i++){
        for(int j=0;j<name[i].length();j++){
            if(name[i].charAt(j)=='e'){
                
            }
        }
      }
      System.out.println(tl);
    }
    
}
