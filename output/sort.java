// //TODO: bubble short
// // take max element and swpa it do with whole array

// // n-1 time loop will be generate
// // worst case o(n^  2)--> time complexity

// package output;
// import java.util.*;
// public class sort {
//     public static void main(String[]args){
//     Scanner s= new Scanner(System.in);
//     int size;
   
//     size=s.nextInt();
//     int a[]=new int [size];
//     for(int i=0;i<size;i++){
//         a[i] = s.nextInt();
//     }
//     for(int i=0;i<size-1;i++){
//         for(int j=0;j<size-i-1;j++){
//             if(a[j]>a[j+1]){
//               int temp=a[j];
//               a[j]=a[j+1];
//               a[j+1]=temp;
//             }
//         }
//     }
//    for(int i=0;i<size;i++){
//     System.out.print(a[i]+" ");
//    }

//     }
    
// }
// //TODO: selection short
// // find smallest then put it in first place and change position of smllest with forst emements   
// // then agina find small agian swap
// // worst case o(n^  2)--> time complexity

// package output;
// import java.util.*;
// public class sort {
//     public static void main(String[]args){
//     Scanner s= new Scanner(System.in);
//     int size;
   
//     size=s.nextInt();
//     int a[]=new int [size];
//     for(int i=0;i<size;i++){
//         a[i] = s.nextInt();
//     }
//     for(int i=0;i<size-1;i++){
//         int smallest=i;
//         for(int j=i+1;j<size;j++){
//             if(a[smallest]>a[j]){
//               smallest=j;
              
//             }
//             int temp=a[smallest];
//             a[smallest]=a[i];
//             a[i]=temp;
        
//     }
// }
//    for(int i=0;i<size;i++){
//     System.out.print(a[i]+" ");
//    }

// }
    
// }
//TODO: insertion  short
// find smallest then put it in first place and change position of smllest with forst emements   
// then agina find small agian swap
// time complexity O(n^2)

package output;
import java.util.*;
public class sort {
    public static void main(String[]args){
    Scanner s= new Scanner(System.in);
    int size;
   
    size=s.nextInt();
    int a[]=new int [size];
    for(int i=0;i<size;i++){
        a[i] = s.nextInt();
    }
    for(int i=1;i<size;i++){
        int current=a[i];
        int j=i-1;
        while(j>=0 && current < a[j]){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=current;
        
       
        
    }

   for(int i=0;i<size;i++){
    System.out.print(a[i]+" ");
   }

}
    
}
