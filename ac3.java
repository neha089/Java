// 1)
// import java.util.*;
// public class ac3 {
//     public static void main(String [] args){
//         int n;
//         Scanner s=new Scanner(System.in);
//         n=s.nextInt();
//         System.out.println("print even till "+n);
//         for(int i=0;i<n;i+=2){
//            System.out.println(i+"\n");
//         }
//     }
    
// }
//2) // its gona be a infinite loop
// public class ac3 {
//        public static void main(String [] args){

// for(; ;) {
//     System.out.println("Apna College");
// }
// }
// }

//3)
// import java.util.*;

// import javax.lang.model.util.ElementScanner14;
// public class ac3 {
//     public static void main(String [] args){
//         int n;
//         Scanner s= new Scanner(System.in);
        
        
//         System.out.println("here 1 for if you want to continue inout and 0 for to stop");
//         int m;
//        do{
//         m=s.nextInt();
//         System.out.println("your marks is"+ m);
//         if(m>90)
//         System.out.println("really good");
//         else if(m>80)
//         System.out.println("good");
//         else if(m>70)
//         System.out.println("nice");
//         else
//         System.out.println("not bad");
//         n=s.nextInt();
//        }
//        while(n==1);
//     }

// }
//4)
import java.util.*;
public class ac3 {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        int n,i;
        boolean b=true;
        n=s.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0)
            b=false;
            break;
        }
        if(b){
            System.out.println("prime");
        }
        else
        System.out.println("not prime");

    }
}


