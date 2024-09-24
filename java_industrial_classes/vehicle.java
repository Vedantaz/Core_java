package java_industrial_classes; // write package as folder name


public class vehicle {
    int regNo;
    public String model;

    public vehicle() {}; // constructor

    public vehicle(int regNo, String model) {
        this.regNo = regNo;
        this.model = model;

    };

    // setters
    public void setRegNo(int reg) {
        regNo = reg;
    };

    public void setModel(String mod) {
        model = mod;
    };

    // getters
    public int getRegNo() {
        return regNo;
    }

    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
        vehicle c = new vehicle();
        c.setRegNo(12);
        System.out.println(c.getRegNo());
        // not applicable here because in same class we wrote the constructor and overloaded it .
        // and wrote the getters (()and setters)
    }

}
