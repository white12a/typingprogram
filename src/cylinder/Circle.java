package cylinder;

public class Circle {
    double radius;
//constructor with 1 args
    Circle(double radius) {
        //condition if radius is less than 0 it set it as 0
        if (radius < 0) {
            this.radius= 0.0;
        } else {
            this.radius = radius;
        }
    }
    // instance methods
    public double getRadius(){
      return radius;
    }
    public double getArea(){
        double area= this.radius*this.radius*Math.PI;
        return area;
    }
}
