package java_industrial_classes;

public class bus extends vehicle {

    int busId;
    String busName;

    // constructor
    public bus(int id, String name) {
        this.busId = id;
        this.busName = name;

    };

    // getters and setters
    public void setBusId(int id) {
        busId = id;

    };

    public void setBusName(String name) {
        busName = name;

    };

    // getters
    public int getBusId() {
        return busId;
    }

    public String getBusName() {
        return busName;
    }
}
