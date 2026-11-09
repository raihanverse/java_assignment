abstract class HospitalEmployee{
  private int employeeid;
  private String employeeName;
  private float basicSalary;
  HospitalEmployee(int employeeid,String employeeName, float basicSalary){
    this.employeeid= employeeid;
    this.employeeName= employeeName;
    this.basicSalary= basicSalary;
  }
  float getbasicsalary(){
    return basicSalary;
  }
  abstract float calculateSalary();
  void displayDetails(){
    System.out.println("employeeid: "+ employeeid);
    System.out.println("employeeName: "+ employeeName);
    System.out.println("basicSalary: "+ basicSalary);
  }
}
class Doctor extends HospitalEmployee{
  private float chamberFee;
  private float dutyBonus;
  Doctor(int employeeid,String employeeName, float basicSalary, float chamberFee, float dutyBonus){
    super(employeeid, employeeName, basicSalary);
    this.chamberFee= chamberFee;
    this.dutyBonus= dutyBonus;
  }
  @Override
  float calculateSalary(){
    return getbasicsalary() + dutyBonus + chamberFee;
  }
}
class Nurse extends HospitalEmployee{
  private float nightShiftAllowance;
  Nurse(int employeeid,String employeeName, float basicSalary, float nightShiftAllowance){
    super(employeeid, employeeName, basicSalary);
    this.nightShiftAllowance= nightShiftAllowance;
  }
  @Override
  float calculateSalary(){
    return getbasicsalary() + nightShiftAllowance;
  }
}
public class hospitalsalary{
  public static void main(String[] args) {
    Doctor d1 = new Doctor(1, "Dr. Rahman", 50000, 15000, 10000);
    Doctor d2 = new Doctor(2, "Dr. Akter", 60000, 20000, 12000);
    Nurse n1 = new Nurse(3, "Nasrin", 25000, 3000);
    Nurse n2 = new Nurse(4, "Salma", 22000, 2500);

    d1.displayDetails();
    System.out.println("final salary: "+ d1.calculateSalary());

    d2.displayDetails();
    System.out.println("final salary: "+ d2.calculateSalary());

    n1.displayDetails();
    System.out.println("final salary: "+ n1.calculateSalary());

    n2.displayDetails();
    System.out.println("final salary: "+ n2.calculateSalary());
  }
} 

