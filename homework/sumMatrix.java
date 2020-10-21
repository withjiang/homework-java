import java.util.Scanner;
public class sumMatrix{
public static void main(String[] args){
   System.out.println("import:");
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
   double[][] matrix = new double[n][n];
   for(int i = 0;i<matrix.length ; i++){
    for(int j = 0; j < matrix[i].length; j++){
   matrix[i][j] = (int)(Math.random()* 100);
    System.out.print(matrix[i][j]+" ");
    }
    System.out.print("\n");
}
System.out.println("sum of these elements is:");
   double sum = 0;
   for(  int i = 0; i < matrix.length;i++){
   for(int j = 0; j < matrix[i].length;j++){
   if (i == j){
    double elem = matrix[i][j];
    sum = sum + elem;
  
    }
    }

  }
System.out.println(sum );

 }
   
 }
