interface Billable{
  double calculateBill();
}
class ResidentialCustomer implements Billable{
  private int customerId;
  private String customerName;
  private int unitsConsumed;
  ResidentialCustomer(int customerId,String customerName, int unitsConsumed){
    this.customerId= customerId;
    this.customerName= customerName;
    this.unitsConsumed= unitsConsumed;
  }
  @Override
  public double calculateBill(){
    return unitsConsumed * 8;
  }
  void displayDetails(){
    System.out.println("customerId: "+ customerId);
    System.out.println("customerName: "+ customerName);
    System.out.println("unitsConsumed: "+ unitsConsumed);
  }
}
class CommercialCustomer implements Billable{
  private int customerId;
  private String customerName;
  private int unitsConsumed;
  CommercialCustomer(int customerId,String customerName, int unitsConsumed){
    this.customerId= customerId;
    this.customerName= customerName;
    this.unitsConsumed= unitsConsumed;
  }
  @Override
  public double calculateBill(){
    return unitsConsumed * 12;
  }
  void displayDetails(){
    System.out.println("customerId: "+ customerId);
    System.out.println("customerName: "+ customerName);
    System.out.println("unitsConsumed: "+ unitsConsumed);
  }
}
public class electricitybill{
  public static void main(String[] args) {
    ResidentialCustomer r1 = new ResidentialCustomer(101, "Rahim", 150);
    ResidentialCustomer r2 = new ResidentialCustomer(102, "Karima", 220);
    CommercialCustomer c1 = new CommercialCustomer(201, "ABC Traders", 500);
    CommercialCustomer c2 = new CommercialCustomer(202, "XYZ Mart", 800);

    r1.displayDetails();
    System.out.println("bill: Tk."+ r1.calculateBill());

    r2.displayDetails();
    System.out.println("bill: Tk. "+ r2.calculateBill());

    c1.displayDetails();
    System.out.println("bill: Tk. "+ c1.calculateBill());

    c2.displayDetails();
    System.out.println("bill: Tk. "+ c2.calculateBill());
  }
}