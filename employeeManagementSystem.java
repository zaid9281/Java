package krmu;

class employee{
    String name;
    String employeeID;
    void displayInfo1(){
        System.out.println("Name of employee is " + name +", employee id is " + employeeID);
    }
}

class manager extends employee{
    String department;
    void displayInfo2(){
        System.out.println("department is "+ department);
    }
}

class seniorManger extends manager{
    String region;
    void displayInfo(){
        displayInfo1();
        displayInfo2();
        System.out.println("regions is " + region);
    }
}

public class employeeManagementSystem{
    public static void main (String[] args){
        seniorManger empl = new seniorManger();
        empl.name = "Zaid";
        empl.employeeID = "101";
        empl.department = "soet";
        empl.region = "najafgarh";
        empl.displayInfo();
    }
}




