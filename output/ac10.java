package output;
import java.util.*;
public class ac10 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int size;
        size=s.nextInt();
        String name []=new String[size];
        for(int i=0;i<size;i++){
          name[i]=s.nextLine();
        }
        for(int i=0;i<size;i++){
            System.out.print(name[i]);
          }

    }

    
}
