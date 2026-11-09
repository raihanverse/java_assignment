interface Shape{
  double calculateArea();
  double calculatePerimeter();
}
class Circle implements Shape{
  private double radius;
  Circle(double radius){
    this.radius= radius;
  }
  @Override
  public double calculateArea(){
    return Math.PI * radius * radius;
  }
  @Override
  public double calculatePerimeter(){
    return 2 * Math.PI * radius;
  }
}
class Rectangle implements Shape{
  private double length;
  private double width;
  Rectangle(double length, double width){
    this.length= length;
    this.width= width;
  }
  @Override
  public double calculateArea(){
    return length * width;
  }
  @Override
  public double calculatePerimeter(){
    return 2 * (length + width);
  }
}
public class shapecalculator{
  public static void main(String[] args) {
    Circle c1 = new Circle(5);
    Circle c2 = new Circle(10);
    Rectangle r1 = new Rectangle(4, 6);
    Rectangle r2 = new Rectangle(10, 3);

    System.out.println("circle 1 area: "+ c1.calculateArea());
    System.out.println("circle 1 perimeter: "+ c1.calculatePerimeter());

    System.out.println("circle 2 area: "+ c2.calculateArea());
    System.out.println("circle 2 perimeter: "+ c2.calculatePerimeter());

    System.out.println("rectangle 1 area: "+ r1.calculateArea());
    System.out.println("rectangle 1 perimeter: "+ r1.calculatePerimeter());

    System.out.println("rectangle 2 area: "+ r2.calculateArea());
    System.out.println("rectangle 2 perimeter: "+ r2.calculatePerimeter());
  }
}