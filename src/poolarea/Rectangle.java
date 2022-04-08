package poolarea;

public class Rectangle {
    double width;
    double length;

    Rectangle(double width, double length){
        if(width<0){
            this.width=0;
        }else{
            this.width=width;
        }
        if(length<0){
            this.length=0;
        }else {
            this.length=length;
        }
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public double getArea(){
       double area=this.length*this.width;
       return area;
    }
}
