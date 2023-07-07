import java.util.*;

class Main{

 public static void printPattern(int n){
      
     for(int i = 0; i < n; ++i){
        for(int j = 0; j <=n-i; ++j){
            System.out.print(" ");
        }
        for(int j = 0; j < i; ++j){
            System.out.print("*");
        }
        for(int j = 0; j <= i; ++j){
            System.out.print("*");
        }
        System.out.println();
     }
 }

    public static void main(String[]args){
       System.out.println("Enter the number according to which you want a particular pattern to be print and remember the pattern which will get printed is wrt row and the number you will provide is for row only...");
       Scanner scan = new Scanner(System.in);
       Integer input = scan.nextInt();
       printPattern(input);

    }
}