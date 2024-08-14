package java_industrial_classes;

public class cars extends vehicle {
    int carId;
    String carName;

    // constructor
    public cars(int id, String name) {
        this.carId = id;
        this.carName = name;

    };

    // getters and setters
    public void setCarId(int id) {
        carId = id;

    };

    public void setCarName(String name) {
        carName = name;

    };

    // getters
    public int getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }
}
