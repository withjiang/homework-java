import java.util .Scanner; 
public class temp{
public static void main(String[] args){
  System.out.println("ÇëÊäÈë10¸öÊı×Ö");
  Scanner scan = new  Scanner(System.in);
 double[ ] array = new double[10];
  for(int i = 0 ; i<10 ; i++) {
    double n = scan.nextDouble();
    array[i] = n;
     }
      for(int i = 0; i< array.length;i++){
     System.out.print(array[i]+ " ");
      }
     System.out.println( indexOfSmallestElement(array));
}

    public static int indexOfSmallestElement(double [] array){
    double min = array[0];
   int index = 0;
   for(int i = 0; i< array.length;i++){
   if(array[i]< min){
     min = array[i];
     index = i;
     }
      
   
   }
    return index;
  }
}
