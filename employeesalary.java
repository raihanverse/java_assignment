class Employee {
  private int employeeId;
  private String employeeName;
  private float basicSalary;

  Employee(int employeeId, String employeeName, float basicSalary) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.basicSalary = basicSalary;
  }

  int getEmployeeId() {
    return employeeId;
  }

  String getEmployeeName() {
    return employeeName;
  }

  float getBasicSalary() {
    return basicSalary;
  }

  float calculateSalary() {
    return basicSalary;
  }
}

class Manager extends Employee {
  private float bonus;

  Manager(int employeeId, String employeeName, float basicSalary, float bonus) {
    super(employeeId, employeeName, basicSalary);
    this.bonus = bonus;
  }

  @Override
  float calculateSalary() {
    return getBasicSalary() + bonus;
  }

  void displayDetails() {
    System.out.println("id: " + getEmployeeId());
    System.out.println("name: " + getEmployeeName());
    System.out.println("basic salary: " + getBasicSalary());
    System.out.println("bonus: " + bonus);
    System.out.println("total salary: " + calculateSalary());
  }
}

class Developer extends Employee {
  private float overtime;

  Developer(int employeeId, String employeeName, float basicSalary, float overtime) {
    super(employeeId, employeeName, basicSalary);
    this.overtime = overtime;
  }

  @Override
  float calculateSalary() {
    return getBasicSalary() + overtime;
  }

  void displayDetails() {
    System.out.println("id: " + getEmployeeId());
    System.out.println("name: " + getEmployeeName());
    System.out.println("basic salary: " + getBasicSalary());
    System.out.println("overtime: " + overtime);
    System.out.println("total salary: " + calculateSalary());
  }
}

public class employeesalary {
  public static void main(String[] args) {
    Manager m1 = new Manager(2121213, "Sami", 12130, 5000);
    Manager m2 = new Manager(233123, "Salman", 21120, 2000);
    Developer d1 = new Developer(12121, "Modhu", 121210, 31313);
    Developer d2 = new Developer(12122, "Rakib", 224242, 31313);

    m1.displayDetails();
    m2.displayDetails();
    d1.displayDetails();
    d2.displayDetails();
  }
}