package krmu;

class Car {

    String brand;
    String model;
    int year;

    Car(){
        String brand;
        String model;
        int year;
    }

    Car(String brand){
        this.brand=brand;
    }

    Car(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    Car(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    void display(){
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println(("year: "+year));
    }
}

public class carInfo{
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car("audi", "X18");
        Car car3 = new Car("BMW", "BW1",1920);

        car1.display();
        car2.display();
        car3.display();
    }
}

