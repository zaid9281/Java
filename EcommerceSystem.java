package krmu;

class Product{
    String ID;
    String name;
    double price;

    Product(String ID, String name, double price){
        this.ID=ID;
        this.name=name;
        this.price=price;
    }

    double calculateDiscount(){
        return price;
    }

    void display(){
        System.out.println("Product ID: " + ID + ", Name: " + name + ", Final Price: " + calculateDiscount());
    }
}


class electronics extends Product{
    electronics(String ID, String name, double price){
        super(ID, name , price);
    }

    double calculateDiscount(){
        return price-(price*0.1);
    }
}


class groceries extends Product{
    groceries (String ID, String name, double price){
        super(ID, name, price);
    }

    double calculateDiscount(){
        return price-(price*0.2);
    }
}

class clothes extends Product{
    clothes (String ID, String name, double price){
        super(ID, name, price);
    }

    double calculateDiscount(){
        return price-(price*0.3);
    }
}


public class EcommerceSystem {
    public static void main(String[] args){
        Product[] products = {
                new electronics("1", "Laptop", 50000),
                new clothes("2", "T-Shirt", 1000),
                new groceries("3", "Rice Bag", 1500)
        };

        for (Product p : products) {
            p.display();
        }

        }
}
