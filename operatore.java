import java.util.Scanner;

//TODO : lean operatore 
// public class operatore {
//     public static void main(String[] args) {
//         // 1. Arithmetic Operators
//         int a = 4;
//         // int b = 6 % a; // Modulo Operator
//         // 4.8%1.1 --> Returns Decimal Remainder

//         // 2. Assignment Operators
//         int b = 9;
//         b *= 3;
//         System.out.println(b);

//         // 3. Comparison Operators
//         // System.out.println(64<6); //! return true and flase boolean type

//         // 4. Logical Operators
//         // System.out.println(64>5 && 64>98);
//         System.out.println(64>5 || 64>98); //! return true and flase boolean type

//         // 5. Bitwise Operators
//         System.out.println(2&3); //! return tyoe is int 
//         //        10
//         //        11
//         //        ----
//         //        10
//     }
// }
//TODO : lean precedence and associativity 

// public class operatore{
//     public static void main(String[] args) {
//         // Precedence & Associativity

//         //int a = 6*5-34/2;
//         /*
//         Highest precedence goes to * and /. They are then evaluated on the basis
//         of left to right associativity
//             =30-34/2
//             =30-17
//             =13
//          */
//         //int b = 60/5-34*2;
//         /*
//             = 12-34*2
//             =12-68
//             =-56
//          */

//         //System.out.println(a);
//         //System.out.println(b);

//         // Quick Quiz
//         int x =6;
//         int y = 1;
//         //  int k = x * y/2;

//         int b = 0;
//         int c = 0;
//         int a = 10;
//         int k = b*b - (4*a*c)/(2*a);
//         System.out.println(k);

//     }
// }
// //TODO : lets evalute some expression
// //! x-y/2
// public class operatore{
//     public static void main(String[] args) {
//         Scanner s= new Scanner(System.in);
//         int x,y;
//         x =s. nextInt();
//         y=s. nextInt();
//          float result= (x-y)/2.0f;
//         System.out.println(result);

//     }
// }
// //TODO : lets evalute some expression
// //! b^2 - 2ac/4a
// public class operatore{
//     public static void main(String[] args) {
//         Scanner s= new Scanner(System.in);
//         int a,b,c;
//         a=s. nextInt();
//         b=s. nextInt();
//         c=s.nextInt();
//          float result= (b*b- 2*a*c)/4.0f*a;
//         System.out.println(result);

//     }
// }
// //TODO : lets evalute some expression
// //! v^2 - u^2
// public class operatore{
//     public static void main(String[] args) {
//         Scanner s= new Scanner(System.in);
//         int v,u;
//         v =s. nextInt();
//         u=s. nextInt();
//          float result= v*v - u*u;
//         System.out.println(result);

//     }
// }
//TODO : lets evalute some expression
//! a*b-c
// public class operatore{
//     public static void main(String[] args) {
//         Scanner s= new Scanner(System.in);
//         int a,b,c;
//         a =s. nextInt();
//         b=s. nextInt();
//         c=s.nextInt();
//          float result=a*b-c;
//         System.out.println(result);

//     }
// }

//!learn*************************************************
// Resulting data type after arithmetic operation
// Result = byte + short -> integer
// Result = short + integer -> integer
// Result = long + float -> float
// Result = integer + float -> float
// Result = character + integer -> integer
// Result = character + short -> integer
// Result = long + double -> double
// Result = float + double -> double
//!increment derement
// public class operatore{
//     public static void main(String[] args) {
//         /* byte x = 5;
//         int y = 6;
//         short z = 8;
//         int a = y + z;
//         float b = 6.54f + x;
//         System.out.println(b); */

//         // Increment and Decrement Operators
//         int i = 56;
//         // int b = i++; // first b is assigned i (56) then i is incremented
//         int j = 67;
//         int c = ++j; // first j is incremented then c is assigned j (68)
//         System.out.println(i++);
//         System.out.println(i); 
//         System.out.println(++i);
//         System.out.println(i);
//         int y = 7;
//         System.out.println( ++y *8);
//         char ch = 'a';
//         System.out.println(++ch);
//     }
// }
