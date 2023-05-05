// package output;
// import java.util.*;
// //TODO: take 2D array

// public class twoDarray {
   

//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         int row;
//         int col;
//         row=s.nextInt();
//         col=s.nextInt();
//         int name [][]=new int[row][col];
//         for(int i=0;i<row;i++){
//           for(int j=0;j<col;j++){
//           name[i][j]=s.nextInt();
//         }
//       }
//         for(int i=0;i<row;i++){
//           for(int j=0;j<col;j++){
//             System.out.print(name[i][j]+" ");
//           }
//           System.out.println();
//         }

//     }
    
    
// }
// package output;
// import java.util.*;
// //TODO: search element in 2D array

// public class twoDarray {
   

//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         int row;
//         int col;
//         int n,poss,pos;
//         row=s.nextInt();
//         col=s.nextInt();
//         int name [][]=new int[row][col];
//         for(int i=0;i<row;i++){
//           for(int j=0;j<col;j++){
//           name[i][j]=s.nextInt();
//         }
//       }
//         for(int i=0;i<row;i++){
//           for(int j=0;j<col;j++){
//             System.out.print(name[i][j]+" ");
//           }
//           System.out.println();
//         }
        
//         System.out.println("which number you want to serch");
//         n=s.nextInt();
//         for(int i=0;i<row;i++){
//           for(int j=0;j<col;j++){
//             if(name[i][j]==n){
//               System.out.println(i+" "+j);
//             }
            
//           }
          
//         }

       

//     }
    
    
// }
//TODO: spiral matrix
// public class twoDarray {
   

//   public static void main(String[] args){
//       Scanner s = new Scanner(System.in);
//       int row;
//       int col;
      
//       row=s.nextInt();
//       col=s.nextInt();
//       int r_s=0;
//       int r_e=row-1;
//       int c_s=0;
//       int c_e=col-1;
//       int n [][]=new int[row][col];
//       for(int i=0;i<row;i++){
//                   for(int j=0;j<col;j++){
//                   n[i][j]=s.nextInt();
//                 }
//               }
//       while(r_s<=r_e && c_s<=c_e){
//         for(int i=c_s;i<=c_e;i++){
       
//           System.out.print(n[r_s][i]);
//         }
//         r_s++;

//       for(int i=r_s;i<=r_e;i++){
       
//         System.out.print(n[i][c_e]);
//       }
//       c_e--;
//       for(int i=c_e;i>=c_s;i--){
       
//         System.out.print(n[i][r_e]);
//       }
//       r_e--;
//       for(int i=r_e;i>=r_s;i--){
       
//         System.out.print(n[c_s][i]);
//       }
//       c_s++;
//     System.out.println();
//     }
//   }
// }
package output;
import java.util.*;
// //TODO: transpose matrix

public class twoDarray {
   

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int row;
        int col;
        
        row=s.nextInt();
        col=s.nextInt();
        int name [][]=new int[row][col];
        for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
          name[i][j]=s.nextInt();
        }
      }
        for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
            System.out.print(name[j][i]+" ");
          }
          System.out.println();
        }
        
       
            
          
        
        }

       

    }
    
    

