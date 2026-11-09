class Student {
    private int studentid;
    private String studentname;
    private int subject1;
    private int subject2;
    private int subject3;
    Student(int studentid,String studentname, int subject1, int subject2, int subject3){
        this.studentid= studentid;
        this.studentname= studentname;
        this.subject1= subject1;
        this.subject2= subject2;
        this.subject3= subject3;
    }  
    void setstudentid(int studentid){
      this.studentid = studentid;
    }
    void setstudentname(String studentname){
      this.studentname=studentname;
    }
    void setsubject1(int subject1){
      this.subject1=subject1;
    }
    void setsubject2(int subject2){
      this.subject2= subject2;
    }
    void setsubject3(int subject3){
      this.subject3= subject3;
    }
    int getstudentid(){
      return studentid;
    }
    String getstudentname(){
      return studentname;
    }
    int getsubject1(){
      return subject1;
    }
    int getsubject2(){
      return subject2;
    }
    int getsubject3(){
      return subject3;
    }

    int calculateTotal(){
      return subject1+subject2+subject3;
    }
    float calculateAverage(){
      return calculateTotal()/3;
    }
    void displayResult() {
      System.out.println("ID: " + studentid);
      System.out.println("Name: " + studentname);
      System.out.println("Total: " + calculateTotal());
      System.out.println("Average: " + calculateAverage());
}
    
}
public class studentresultman {
 

    public static void main(String[] args) {
        Student s1 = new Student(1, "Ali", 80, 70, 90);
        Student s2 = new Student(2, "Sara", 65, 75, 85);
        Student s3 = new Student(3, "Rafi", 90, 88, 92);
        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
    
  }
}
