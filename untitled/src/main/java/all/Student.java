package all;

public class Student {
 String studName   ;
 int studAge;
 void  initialize()
 {
     studName = "James Anderson";
     studAge = 26;
 }
 void display()
 {
     System.out.println("student Name: " + studName);
     System.out.println("student Age :" + studAge);
 }
 public static void main(String[] arqs)
 {
     Student objStudent = new Student();
     objStudent.initialize();
     objStudent.display();
 }
}
