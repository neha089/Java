// //TODO: list of names
// package output;
// import java.util.*;
// public class ac10 {
//     public static void main(String[] args){
//         Scanner s= new Scanner(System.in);
//         int size;
//         size=s.nextInt();
//         String name []=new String[size];
//         for(int i=0;i<size;i++){
//           name[i]=s.nextLine();
//         }
//         for(int i=0;i<size;i++){
//             System.out.print(name[i]);
//           }

//     }


    
// }
//TODO: find max and min
// package output;
// import java.util.*;
// public class ac10 {
//     public static void main(String[] args){
//         Scanner s= new Scanner(System.in);
//         int size;
//         size=s.nextInt();
//         int arr []=new int [size];
//         System.out.println("enter elements for your array");
//         for(int i=0;i<size;i++){
//           arr[i]=s.nextInt();
//         }
//         System.out.println("your array is : ");
//         for(int i=0;i<size;i++){
//             System.out.print(arr[i]);
//           }
//           int max=arr[0];
//           int min=arr[0];
//           for(int i=0;i<size;i++){
//             if(arr[i]<min)
//             min=arr[i];
//             if(arr[i]>max)

//             max=arr[i];
//           }
//           System.out.println("your max is "+max);
//           System.out.println("your min is"+min);

//     }
//   }
//TODO: check if array is sorted or not
package output;
import java.util.*;
public class ac10 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int size;
        size=s.nextInt();
      int a []=new int[size];
      System.out.println("enter elements");
        for(int i=0;i<size;i++){
          a[i]=s.nextInt();
        }
        System.out.println("your array is");
        for(int i=0;i<size;i++){
            System.out.print(a[i]);
          }
          boolean x=true;
          for(int i=0;i<size-1;i++){ //! if you write here size then it will be out of bound thats why its show as expection
            
              if(a[i]>a[i+1]){
              x=false;
              break;
              }
            
          }
          // System.out.println(x);
          if(x)
          System.out.println("its sorted");
          else
          System.out.println("not sorted");

    }
  }