abstract class FoodItem{
  private int itemId;
  private String itemName;
  private double price;
  FoodItem(int itemId,String itemName,double price){
    if(itemName == null || itemName.trim().isEmpty()){
      throw new IllegalArgumentException("item name cannot be empty");
    }
    if(price < 0){
      throw new IllegalArgumentException("price cannot be negative");
    }
    this.itemId= itemId;
    this.itemName= itemName;
    this.price= price;
  }
  double getprice(){
    return price;
  }
  abstract double calculatePrice();
  void displayFoodDetails(){
    System.out.println("itemId: "+ itemId);
    System.out.println("itemName: "+ itemName);
    System.out.println("food price: Tk. "+ price);
  }
}
class RegularFood extends FoodItem{
  RegularFood(int itemId,String itemName,double price){
    super(itemId, itemName, price);
  }
  @Override
  double calculatePrice(){
    return getprice();
  }
}
class SpecialFood extends FoodItem{
  private double serviceCharge;
  SpecialFood(int itemId,String itemName,double price,double serviceCharge){
    super(itemId, itemName, price);
    if(serviceCharge < 0){
      throw new IllegalArgumentException("service charge cannot be negative");
    }
    this.serviceCharge= serviceCharge;
  }
  @Override
  double calculatePrice(){
    return getprice() + serviceCharge;
  }
  @Override
  void displayFoodDetails(){
    super.displayFoodDetails();
    System.out.println("service charge: Tk. "+ serviceCharge);
  }
}
public class RestaurantOrder{
  public static void main(String[] args) {
    try{
      FoodItem[] items = {
        new RegularFood(1, "Fried Rice", 180),
        new RegularFood(2, "Chicken Curry", 220),
        new SpecialFood(3, "Beef Steak", 650, 65),
        new SpecialFood(4, "Seafood Platter", 900, 90)
      };

      double totalBill = 0;
      for(FoodItem item : items){
        item.displayFoodDetails();
        double finalPrice = item.calculatePrice();
        System.out.println("final price: Tk. "+ finalPrice);
        System.out.println();
        totalBill = totalBill + finalPrice;
      }
      System.out.println("total bill: Tk. "+ totalBill);
    }catch(IllegalArgumentException e){
      System.out.println("Error: "+ e.getMessage());
    }
  }
}
