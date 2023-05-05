package output;

import java.util.*;
public class acstring {
public static void main(String[]args){
    String name = "Tony";//!declaration
    Scanner sc = new Scanner(System.in);//!user input
       String name1 = sc.next();
       //!concetination
       String firstName = "Tony";
       String secondName = "Stark";


       String fullName = firstName + " " + secondName;
       System.out.println(fullName);
       //!length
       String firstName1 = "Tony";
       String secondName1 = "Stark";


       String fullName1 = firstName1 + " " + secondName1;
       System.out.println(fullName.length());
       //!each charactore of string
       String firstName2 = "Tony";
       String secondName2 = "Stark";


       String fullName2 = firstName2 + " " + secondName2;


       for(int i=0; i<fullName2.length(); i++) {
           System.out.println(fullName2.charAt(i));
       }
       //!compare
       String name11 = "Tony";
       String name21 = "Tony";


       if(name11.equals(name21)) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //DO NOT USE == to check for string equality
       //Gives correct answer here
       if(name11 == name21) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //Gives incorrect answer here
       if(new String("Tony") == new String("Tony")) {//! it will create in the heap section
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
//!sub string 
//? as argument (starting index,ending index) which is-range [starting index,ending index)
String name111 = "TonyStark";
     
       System.out.println(name.substring(0, 4));

//!parseInt method of integer class
String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);

//!ToString Method of String class
int number1 = 123;
String str1 = Integer.toString(number);
System.out.println(str1.length());


//!ALWAYS REMEMBER : Java Strings are Immutable. can not chnage them directly





}
}
