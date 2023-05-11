package az.coders.prac11may.exercise1;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(double sideLength){
        this(sideLength,sideLength);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
