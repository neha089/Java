//1)

// import java.util.*;

// import javax.swing.plaf.synth.SynthStyle;

// public class ac5 {
//     public static void main(String [ ] args){
//         Scanner s= new Scanner(System.in);

//         int n;

//         n=s.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=2*n-2*i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();

//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=2*n-2*i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();

//         }
        
//     }
    
// }
//__________________________________________________________________________________________

//2)
// import java.util.*;

// import javax.swing.plaf.synth.SynthStyle;

// public class ac5 {
//     public static void main(String [ ] args){
//         Scanner s= new Scanner(System.in);

//         int n;

//         n=s.nextInt();
//         for(int i=1;i<n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
            
//             System.out.println();

//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
           
//             System.out.println();

//         }
        
//     }
    
// }
//2)
// import java.util.*;

// import javax.swing.plaf.synth.SynthStyle;

// public class ac5 {
//     public static void main(String [ ] args){
//         Scanner s= new Scanner(System.in);

//         int n;

//         n=s.nextInt();
//         for(int i=1;i<n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
            
//             System.out.println();

//         }
//         for(int i=n-1;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
           
//             System.out.println();

//         }
        
//     }
    
// }
//____________________________________________________________________________________
// 3)
// import java.util.*;

// import javax.swing.plaf.synth.SynthStyle;

// public class ac5 {
//     public static void main(String [ ] args){
//         Scanner s= new Scanner(System.in);

//         int n;

//         n=s.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if(j==1 || i==j )
//                 System.out.print("* ");
//                 else
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*n-2*i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 if(j==i || j==2*i-1)
//                 System.out.print("* ");
//                 else
//                 System.out.print("  ");
//             }
//             System.out.println();

//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 if(j==1 || i==j )
//                 System.out.print("* ");
//                 else
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*n-2*i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 if(j==i || j==2*i-1)
//                 System.out.print("* ");

//                 else
//                 System.out.print("  ");
//             }
//             System.out.println();

//         }
        
//     }
    
// }
//__________________________________________________________________________________________
//4)
// import java.util.Scanner;

// public class ac5 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int n = s.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if (j == 1 || i == j || j == i || j == 2 * i -1 )
//                     System.out.print("* ");
//                 else
//                     System.out.print("  ");
//             }
//             for (int j = 1; j <= 2 * n - 2 * i; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 if (j == 1 || i == j || j == i || j == 2 * i -1)
//                     System.out.print("* ");
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println();
//         }

//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 if (j == 1 || i == j || j == i || j == 2 * i -1)
//                     System.out.print("* ");
//                 else
//                     System.out.print("  ");
//             }
//             for (int j = 1; j <= 2 * n - 2 * i; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 if (j == 1 || i == j || j == i || j == 2 * i -1)
//                     System.out.print("* ");
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }
//______________________________________________________________________________________________
//5)
// import java.util.*;
// public class ac5 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n;
//         n=s.nextInt();
//         for(int i=1;i<=n;i++){
           
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++)
//             {
//                 if(i==1 || i==n || j==1|| j==n )
            
//             System.out.print("* ");
//             else
//             System.out.print("  ");
//         }
//         System.out.println();
//     }
    
// }
// }
//__________________________________________________________________________________
//6)

// import java.util.Scanner;

// public class ac5 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();

//         for (int i = 0; i < rows; i++) {
//             int number = 1;
//             System.out.format("%" + (rows - i)*2 + "s", ""); // align the rows// s take the value by (n-i)*2 and set in placeholder % // ...args can take bnmber of argument no need to specified number
//             for (int j = 0; j <= i; j++) {
//                 System.out.format("%4d", number); // print the number with four spaces
//                 number = number * (i - j) / (j + 1);
//             }
//             System.out.println();
//         }
//     }
// }
//________________________________________________________________________________________
//7)
// import java.util.*;
// public class ac5 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n,m=1;
//         n=s.nextInt();
//         for(int i=0;i<n;i++){
            
//             m=1;
//             for(int j=0;j<n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<i+1;j++){
//                 System.out.print(m++);
                

//             }
//             System.out.println();
//         }
//     }
    
// }

//___________________________________________________________________________________________
//8)
// import java.util.*;
// public class ac5 {
//     public static void main(String [] args)
//     {
//         Scanner s= new Scanner(System.in);
//         int n,m=0;
//         n=s.nextInt();
//         for(int i=n;i>0;i--){
//             m++;
           
//             for(int j=0;j<n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<i;j++){
//                 System.out.print(m);
                

//             }
//             System.out.println();
//         }
//     }
    
// }
