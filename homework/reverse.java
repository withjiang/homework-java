import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("������һ������");
    int number = scan . nextInt();
    reverse(number);
 }
    public static void reverse(int number){
      int a = 0;
      if(number< 0 ){
      System.out.println("�Ƿ�����!");
    } 
      else{
        while(number > 0){
          a = number % 10;
          number = number/ 10;
          System.out.print( a );
    }
       
 }      
             
  }
}
