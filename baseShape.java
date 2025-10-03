package krmu;

class shape {
    void area(){
        System.out.println("hey there");
    }
}

class circle extends  shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    @Override
    void area() {
        double result = Math.PI*radius*radius;
        System.out.println("area of circle "+result);
    }
}

class rectangle extends shape {
    double length;
    double width;
    rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    void area() {
        double result = length*width;
        System.out.println("arear of rectangle " + result);
    }
}

public class baseShape {
    public static void main(String args[]){
        circle c1 = new circle(3.5);
        rectangle r1 = new rectangle(3,4);
        c1.area();
        r1.area();
    }
}
