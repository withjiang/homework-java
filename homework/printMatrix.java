import java.util.Scanner;
public class printMatrix{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("请输入一个整数n");
    int n = scan . nextInt();
    printMatrix(n);
 }
     public static void printMatrix(int n ){
       int i , j;
     for(i =0; i< n ; i++){
      for(j=0;j< n;j++){
              int a = (int)((Math.random()*15)/10);
             System.out.print(a); 
       }
             System.out.print("\n"); 
     }
}




}