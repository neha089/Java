

// 1)

// import java.util.*;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;
//         n=s.nextInt();
//         for(int i=0;i<n;i++){
           
//             for(int j=0;j<n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }
//________________________________________________________________________________________
//2)

// import java.util.*;
// import java.util.concurrent.CountDownLatch;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;

//         n=s.nextInt();
        
//         for(int i=0;i<n;i++){
           
//             for(int j=0;j<n;j++){
//                 if(i==0 || i==n-1 || j==0 || j==n-1)
//                 System.out.print("* ");
//                 else
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
    
// }

//3)
// import java.util.*;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;
//         n=s.nextInt();
//         for(int i=0;i<n;i++){

           
//             for(int j=0;j<i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }
// ________________________________________________________________________________________
//4)

// import java.util.*;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;
//         n=s.nextInt();
//         for(int i=0;i<n;i++){

           
//             for(int j=0;j<n-i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }


// ________________________________________________________________________________________
//5)
// import java.util.*;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;
//         int j,i;
//         n=s.nextInt();
//         for( i=0;i<n;i++){
            
//             for(j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }
        
//                 for( j=0;j<i+1;j++){
//                     System.out.print("*");
                
//                 }
//             System.out.println();
//         }
//     }
    
// }
//________________________________________________________________________________________
//6)
// import java.util.*;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;
//         int m=1;
//         n=s.nextInt();
//         for(int i=1;i<=n;i++){

           
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//________________________________________________________________________________________
//7)
// import java.util.*;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;
//         int m=1;
//         n=s.nextInt();
//         for(int i=1;i<=n;i++){

           
//             for(int j=1;j<=i;j++){
//                 System.out.print(m+++" ");
//             }
//             System.out.println();
//         }
//     }
// }
//________________________________________________________________________________________
//8)
// import java.util.*;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;
        
//         n=s.nextInt();
//         for(int i=1;i<=n;i++){

           
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0)
//                 System.out.print("1 ");
//                 else
//                 System.out.print("0 ");
//             }
//             System.out.println();
//         }
//     }
// }
//______________________________________________________________________________________
//9)
// import java.util.*;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n,i,j;
//         int m=1;
//         n=s.nextInt();
//         for( i=1;i<=n;i++){

           
//             for( j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for( j=1;j<=n;j++){
//                 System.out.print("*");

//             }
            
//             System.out.println();
//         }
//     }
// }
//____________________________________________________________________________________
//10)
// import java.util.*;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;
//         int m=1;
//         n=s.nextInt();
//         for(int i=1;i<=n;i++){

           
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
            
//             System.out.println();
//         }
//     }
// }
//___________________________________________________________________________________
//11)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// import java.util.*;
// public class ac4 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;
       
//         n=s.nextInt();
//         for(int i=1;i<=n;i++){

           
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=i;j>=1;j--){
                
//                 System.out.print(j+" ");
//             }
//             for(int j=2;j<=i;j++){
                
//                 System.out.print(j+" ");
//             }
            
//             System.out.println();
//         }
//     }
// }
