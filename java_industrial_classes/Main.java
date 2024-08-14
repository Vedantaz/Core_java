package java_industrial_classes;

public class Main {

    public static void main(String[] args) {
        bus b = new bus(0, "Nag");
        b.setRegNo(1);
        b.setModel("OUI234");
        b.setBusId(22);
        b.setBusName("Dev");

        System.out.println("regNo , model, busId, busName are : " + b.getRegNo() + " "
                + b.getModel() + " " + b.getBusId() + " " + b.getBusName() + " respectively.");

        cars c = new cars(23, "Jaguar");
        c.setRegNo(1);
        c.setModel("OUI234");
        c.setCarId(34);
        c.setCarName("Audi");

        System.out.println("regNo , model, carId, carName are : " + c.getRegNo() + " "
                + c.getModel() + " " + c.getCarId() + " " + c.getCarName() + " respectively.");

    }
}


