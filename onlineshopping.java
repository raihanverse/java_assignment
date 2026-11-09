abstract class Product{
    private int productid;
    private String productName;
    private float price;
    Product(int productid,String productName, float price){
        this.productid= productid;
        this.productName= productName;
        this.price= price;
    }
    void setproductid(int productid){
       this.productid= productid;
    }
    void setproductname(String productName){
       this.productName= productName;
    }
    void setproductprice(float price){
       this.price= price;
    }
    int getproductid(){
      return productid;
    }
    String getproductname(){
      return productName;
    }
    float getproductprice(){
      return price;
    }
    abstract float calculateFinalPrice();
    abstract void displayProduct();
    
}
class Electronics extends Product{
  Electronics(int productid,String productName, float price){
    super(productid, productName, price);
  }
  @Override 
  float calculateFinalPrice(){
    return (float) (getproductprice()-getproductprice() *0.1);
  }
  @Override 
  void displayProduct(){
    System.out.println("productid: "+ getproductid());
    System.out.println("productName: "+ getproductname());
    System.out.println("productprice: "+ getproductprice());
  }
}
class clothing extends Product{
  clothing(int productid,String productName, float price){
    super(productid, productName, price);
  }
  @Override 
  float calculateFinalPrice(){
    return (float) (getproductprice()-getproductprice() *0.15);
  }
   @Override 
  void displayProduct(){
    System.out.println("productid: "+ getproductid());
    System.out.println("productName: "+ getproductname());
    System.out.println("productprice: "+ getproductprice());
  }
}
public class onlineshopping {
  public static void main(String[] args) {
    Electronics e1 = new Electronics(1, "Phone", 30000);
    Electronics e2 = new Electronics(2, "Headphone", 5000);
    clothing c1 = new clothing(3, "Shirt", 1500);
    clothing c2 = new clothing(4, "Jacket", 4000);

    e1.displayProduct();
    e2.displayProduct();
    c1.displayProduct();
    c2.displayProduct();
  }
}
