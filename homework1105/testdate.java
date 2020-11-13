import java.util.Date;
public class testdate{
     public static void main(String[] args){
           long time = 10000;
           Date date = new Date(time);
           
       for(int i = 0;i<7;i++){
            time = time* 10;
           date.setTime(time);
          System.out.println("when the elapsetime is:"+ time + "the date is: " + date.toString());
    }
  }
}