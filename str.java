//**string is a class but also can be use a data tyep */
// ?We use double quotes("") to create string using string literal. Before creating a new string instance, JVM verifies if the same string is already present in the string pool or not. If it is already present, then JVM returns a reference to the pooled instance otherwise, a new string instance is created.
//!string are store in heap section
//?When we create a string using "new", a new object is always created in the heap memory.if the name is alredy exist.. it dones not matter its create one new onj to store it
//TODO:diffrent way to take string
// public class string {
//     public static void main (string[]args){

//         char strr[]={'n','e','h','a'}; //by charactore array
//         String strr1="neha";   // by assignment
//         String s=new String("neha"); // using  new key word
//     }
    
// }
//TODO:you need to know
// public class str {
//     public static void main (String[]args){
//         String str1 = "CodeWithHarry";
// String str2 = "CodeWithHarry";
// System.out.println(str1 == str2);  //!true // read comment section in top
// String strr1 = new String("Keep coding"); 
// String strr2 = new String("Keep coding"); 
// System.out.println(strr1 == strr2);//!false // read comment section in top 
// // Although the value of both the string object is the same, still false is displayed as output because str1 and str2 are two different string objects created in the heap. That's why it is not considered a good practice two compare two strings using the == operator. Always use the equals() method to compare two strings in Java.

//     }
// }
//TODO:some methods for string 
public class str {
    public static void main (String[]args){
        String s1= "neha";
        String s2="Patel";
        String s3="neha       patel y";
        System.out.println(s1.length());//!to find the length of the string // 4
        System.out.println(s2.toLowerCase());//!convert whole string in to lower case //patel
        System.out.println(s1.toUpperCase());//!convert whole string in to upper case // NEHA4
        System.out.println(s3.trim());//!ignor all the spaces
    }
}
