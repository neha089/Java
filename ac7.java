//_____________________________________________________________________________________
//1)
// import java.util.*;
// public class ac7 {
//     public static float avg ( int n,int n1,int n2){
//         return ((n+n1+n2)/3);
//     }
//     public static void main(String [] args){
//         int n,n1,n2;
//         Scanner s= new Scanner(System.in);
//         n=s.nextInt();
//         n1=s.nextInt();
//         n2=s.nextInt();
//         System.out.println(avg(n,n1,n2));
//     }
    
// }
// //_____________________________________________________________________________________
// //2)
// import java.util.*;
// public class ac7 {
//     public static int sum_of_odd ( int n){
//         int sum=0;
//        for(int i=0;i<=n;i=i+2){
//         sum+=i;
//        }
//        return sum;
//     }
//     public static void main(String [] args){
//         int n;
//         Scanner s= new Scanner(System.in);
//         n=s.nextInt();
        
//         System.out.println(sum_of_odd(n));
//     }
    
// }

//_____________________________________________________________________________________
//3)
// import java.util.*;

// public class ac7 {
//     public static float circumferance( int r){
//          float x=3.14f;
//        return (2*x*r);
//     }
//     public static void main(String [] args){
//         int n;
//         Scanner s= new Scanner(System.in);
//         n=s.nextInt();
        
//         System.out.println(circumferance(n));
//     }
    
// }
//_____________________________________________________________________________________
//4)
// import java.util.*;

// public class ac7 {
//     public static void check_eli( int age){
//         if(age>=18)
//             System.out.println("you are eligabale");
//         else 
//         System.out.println("no you are not");
        
        
//     }
//     public static void main(String [] args){
//         int age;
//         Scanner s= new Scanner(System.in);
//         age=s.nextInt();
//          check_eli(age);
//     }
    
// }
//_____________________________________________________________________________________
//4)
//_____________________________________________________________________________________
//5)
// import java.util.*;

// public class ac7 {
    
//     public static void main(String [] args){
//         int n;
//         Scanner s= new Scanner(System.in);
//         n=s.nextInt();
//         do{
//             System.out.println(n);
//         }
//         while(true);
         
//     }
    
// }
//_____________________________________________________________________________________
//6)
// import java.util.*;

// public class ac7 {
    
//     public static void main(String [] args){
//         int n;
//         Scanner s= new Scanner(System.in);
        
//         int m;
//         int positive=0,negative=0,zero=0;
//         System.out.println("here 1 for more input and any other number for terminate");
        
//         do{
//             n=s.nextInt();
            
//             if(n>0)
//             positive++;
//             else if(n<0)
//             negative++;
//             else zero++;
//             m=s.nextInt();
//         }
//         while(m==1);
//         System.out.println("positive"+positive);
//         System.out.println("negative"+negative);
//         System.out.println("zero"+zero);
         
//     }
    
// }
//_____________________________________________________________________________________
//7)
// import java.util.*;

// public class ac7 {
//     public  static int power(int n,int x){
//         if(x==1)
//         return n;

//         return n*power(n,x-1);
//     }
    
//     public static void main(String [] args){
//         int n,x;
//         Scanner s= new Scanner(System.in);
//         n=s.nextInt();
//         x=s.nextInt();
//         System.out.println(power(n,x));
         
//     }
    
// }
//_____________________________________________________________________________________
//8)
// import java.util.*;

// public class ac7 {
//     public  static int gcd(int n,int x){
//         if(x==0)
//         return n;

//         return gcd(x,n%x);
//     }
    
//     public static void main(String [] args){
//         int n,x;
//         Scanner s= new Scanner(System.in);
//         n=s.nextInt();
//         x=s.nextInt();
//         System.out.println(gcd(n,x));
         
//     }
    
// }//_____________________________________________________________________________________
//9)
// import java.util.*;

// public class ac7 {
//     public  static int fibo(int n){
//         if(n==1 || n==2){
//         return 1;
//         }
//         return fibo(n-1)+fibo(n-2);
//     }
    
//     public static void main(String [] args){
//         int n;
//         Scanner s= new Scanner(System.in);
//         n=s.nextInt();
//         for(int i=1;i<=n;i++)
//         System.out.print(fibo(i)+" ");
         
//     }
    
// }



















































