public double calculateArea() {
 return Math.PI * radius * radius;
 }
}
class Rectangle implements Shape {
 private double length;
 private double width;
 public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 public double getLength() {
 return length;
 }
 public double getWidth() {
 return width;
 }
 @Override
 public double calculateArea() {
 return length * width;
 }
}
class Triangle implements Shape {
 private double base;
 private double height;
 public Triangle(double base, double height) {
 this.base = base;
 this.height = height;
 }
 public double getBase() {
 return base;
 }
 public double getHeight() {
 return height;
}
@Override
 public double calculateArea() {
 return 0.5 * base * height;
 }
}
