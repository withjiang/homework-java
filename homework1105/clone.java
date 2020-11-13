import java.util.ArrayList;
import java.math.*;
public class clone{
public static void main(String[] args){
     courseclone course1 = new courseclone("data structures");
     courseclone course2 = (courseclone) course1.clone();
   course1.addStudent("S1");
  course1.addStudent("S2");
  course1.addStudent("S3");
  course2.addStudent("S4");
  course2.addStudent("S5");
   System.out.println(course1.getNumberOfStudents());
     System.out.println(course2.getNumberOfStudents());

}
}
 class courseclone implements Cloneable{
     private String courseName;
     private String[] students = new String[100];
    private int numberOfStudents;
    
     public courseclone(String courseName){
      this.courseName = courseName;
  }
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
  }
    public String[] getStudents(){
      return students;
 }
    public int getNumberOfStudents(){
    return numberOfStudents;
 }
    public String getCourseName(){
        return courseName;
 }

@Override
public Object clone(){
     try{
        courseclone c = (courseclone)super.clone();
        c.students = new String[100];
      

    return  c;
   
   }catch(CloneNotSupportedException ex){
         return null;
   }
}

}




