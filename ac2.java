//1)
// import java.util.*;
// public class ac2 {
//     public static void main(String [] args){
//         Scanner s=new Scanner(System.in);
//         int num1,num2;
//         num1=s.nextInt();
//         num2=s.nextInt();
//         System.out.println("numbers are"+num1+"and "+num2);
//         int  op;
//         op=s.next().charAt(0);
//         switch(op){
//             case '+':
//             System.out.println(num1+num2);
//             break;
//             case '-':
//             System.out.println(num1-num2);
//             break;
//             case '*':
//             System.out.println(num1*num2);
//             break;
//             case '/':
//             System.out.println(num1/num2);
//             break;
//             case '%':
//             System.out.println(num1%num2);
//             break;
//             default:
//             System.out.println("wrong op");

//         }

//     }
    
// }
// 2)
import java.util.*;
public class ac2{
    public static void main(String[] args){
        int n;
        System.out.println("enter number of month");
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        switch(n){
            case 1:
            System.out.println("jan");
            break;
            case 2:
            System.out.println("feb");
            break;
            case 3:
            System.out.println("march");
            break;
            case 4:
            System.out.println("apr");
            break;
            case 5:
            System.out.println("may");
            break;
            case 6:
            System.out.println("june");
            break;
            case 7:
            System.out.println("july");
            break;
            case 8:
            System.out.println("aug");
            break;
            case 9:
            System.out.println("sep");
            break;
            case 10:
            System.out.println("oct");
            break;
            case 11:
            System.out.println("nov");
            break;
            case 12:
            System.out.println("dec");
            break;
            default:
            System.out.println("erro");
        }
    }
}

