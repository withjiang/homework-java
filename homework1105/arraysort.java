import java.util.ArrayList;
import java.math.*;
public class arraysort{
   public static void main(String[] args){
    ArrayList<Number> list = new ArrayList<>();
    list.add(3);
   list.add(9);
    list.add(5);
    list.add(7);
     list.add(1);
  sort(list);
  
}

public static void sort(ArrayList<Number>list){
   for(int i = 0;i < list.size();i++){
     Number min = list.get(i);
     int minindex = i;

  for(int j = i+1;j<list.size();j++){
   if(min.intValue() > list.get(j).intValue()){
       min = list.get(j);
      minindex = j;
     }
    }

   if(minindex != i){
    list.set(minindex,list.get(i));
    list.set(i,min);
   }
 
   }
 for (int a =0; a < list.size();a++){
    System.out.print(list.get(a) + "");
   }
}


}