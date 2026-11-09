class Course{
  private int courseId;
  private String courseName;
  private int credit;
  static String universityName= "ABC University";
  Course(int courseId,String courseName,int credit){
    if(courseName == null || courseName.trim().isEmpty()){
      throw new IllegalArgumentException("course name cannot be empty");
    }
    if(credit <= 0){
      throw new IllegalArgumentException("credit must be greater than 0");
    }
    this.courseId= courseId;
    this.courseName= courseName;
    this.credit= credit;
  }
  int getcredit(){
    return credit;
  }
  static void displayUniversityName(){
    System.out.println("University: "+ universityName);
  }
  void displayCourseDetails(){
    System.out.println("courseId: "+ courseId);
    System.out.println("courseName: "+ courseName);
    System.out.println("credit: "+ credit);
  }
}
class RegularCourse extends Course{
  private double feePerCredit;
  RegularCourse(int courseId,String courseName,int credit,double feePerCredit){
    super(courseId, courseName, credit);
    if(feePerCredit < 0){
      throw new IllegalArgumentException("fee per credit cannot be negative");
    }
    this.feePerCredit= feePerCredit;
  }
  double calculateFee(){
    return getcredit() * feePerCredit;
  }
}
class ProfessionalCourse extends Course{
  private double feePerCredit;
  private double laboratoryFee= 2000;
  ProfessionalCourse(int courseId,String courseName,int credit,double feePerCredit){
    super(courseId, courseName, credit);
    if(feePerCredit < 0){
      throw new IllegalArgumentException("fee per credit cannot be negative");
    }
    this.feePerCredit= feePerCredit;
  }
  double calculateFee(){
    return (getcredit() * feePerCredit) + laboratoryFee;
  }
}
public class CourseFee{
  public static void main(String[] args) {
    try{
      RegularCourse r1 = new RegularCourse(101, "English", 3, 2500);
      RegularCourse r2 = new RegularCourse(102, "Mathematics", 4, 2500);
      ProfessionalCourse p1 = new ProfessionalCourse(201, "Software Engineering", 3, 4000);
      ProfessionalCourse p2 = new ProfessionalCourse(202, "Machine Learning", 4, 4500);

      Course.displayUniversityName();
      System.out.println();

      r1.displayCourseDetails();
      System.out.println("total fee: Tk. "+ r1.calculateFee());
      System.out.println();

      r2.displayCourseDetails();
      System.out.println("total fee: Tk. "+ r2.calculateFee());
      System.out.println();

      p1.displayCourseDetails();
      System.out.println("total fee (with lab fee): Tk. "+ p1.calculateFee());
      System.out.println();

      p2.displayCourseDetails();
      System.out.println("total fee (with lab fee): Tk. "+ p2.calculateFee());
    }catch(IllegalArgumentException e){
      System.out.println("Error: "+ e.getMessage());
    }
  }
}
