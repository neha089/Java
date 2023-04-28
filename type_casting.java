
public class type_casting {
    public static void main(String a[]){
        
        // byte b=2;
        // int a=3;
        //b=a; its throght me erro . bcz int is a big container and byte is a small so we can
        // not fit big cantainer into small one but if we want to do this then do this 
        // its same for if we do int = 3.4f or boolean= 'a'.
        // b=(byte)a;// its call casting we do explicitly thats why..
        // a=b;//its work bcz its call conversion its done by compiler its self . bcz we can fit small into big
        // System.out.println(a);
        // System.out.println(b);

        // byte x=257;
       //257 is a out of the range thats why compiler give 257%256(which is a range of  byte)
        // System.out.println(x);
        // byte q=20; //type promostion
        // //20*100=2000 out of the range of byte compiler give you promostion to store it into int that mean we can save int =byte with out casting
        // byte w=10;
        // int z=q*w;
        // System.out.println(z);
       //       ------------------------------------------------------------------------------
     //num1++ --first fetch the value then increrwment
     //++num1 -- increment first then fetch
     
    //  int x=6;
    //  int y=6;
     
    //  boolean r=x==y ;
    //  System.out.println(r);  
    //  int o=5 ;
    //  int b=6;   
    //  System.out.println(6 & 4);//if you use x&&y then you got Erorr bcz we must use bitwise operator when the not any conditon are present 
                                    // u can also use a>b & x<y its valid not any error 
                                    // when you use single | or & its work in binary and given you outpur 
                                    // like 6 & 4 __________  110 & 100 thats why op will be 4
       int i=1;
       while(i<=4){
        i++;
        System.out.println("hi"+i); // when i=4 loop stopr print 4 time hi when we outer the loop i will be 5 bcz incremenr was done already
        
       }    
       System.out.println(i);                         
    }
    
}

