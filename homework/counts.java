public class counts{
    public static void main(String[] args){
     int [] numbers = new int[100];
     int [] counts = new int[10];

   for(int i = 0; i<numbers.length; i++){
            numbers[i] = (int)(Math.random()*10);
            System.out.print(numbers[i]);       
    }
     System.out.print("\n"); 
       System.out.println("each numbers is occur: \n");   
 
           int count = 0;
           for(int k =0; k< counts.length;k++) {
             for(int i = 0; i<numbers.length; i++){
              if(k == numbers[i])
              count++;
            }
             counts[k] = count;
             count = 0;
       }      

         for(int k = 0; k< counts.length; k ++)
      System.out.println(k + ":"+counts[k]);


}
}
  
  