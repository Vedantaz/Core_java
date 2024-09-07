interface Testable {
    boolean testCompatibility(); // Method to check compatibility
}

class Mobile {
    // Implement your code here
    private String name;
    private String brand;
    private String operatingSystemName;
    private String operatingSystemVersion;

    // Constructor
    public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
        this.name = name;
        this.brand = brand;
        this.operatingSystemName = operatingSystemName;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    // getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

}

class SmartPhone extends Mobile implements Testable {
    // Implement your code here
    private String networkGeneration;

    // Constructor
    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion,
            String networkGeneration) {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    // Getter and Setter for networkGeneration
    public String getNetworkGeneration() {
        return networkGeneration;
    }

    public void setNetworkGeneration(String networkGeneration) {
        this.networkGeneration = networkGeneration;
    }

    public boolean testCompatibility() {
        String osName = getOperatingSystemName();
        double osVersion = Double.parseDouble(getOperatingSystemVersion());

        // Check compatibility based on given table
        switch (networkGeneration) {
            case "3G":
                if (osName.equals("Saturn") && osVersion >= 1.0) {
                    return true;
                } else if (osName.equals("Gara") && osVersion >= 3.0) {
                    return true;
                } else if (osName.equals("Icarus") && osVersion >= 1.0) {
                    return true;
                }
                break;
            case "4G":
                if (osName.equals("Saturn") && osVersion >= 2.0) {
                    return true;
                } else if (osName.equals("Gara") && osVersion >= 4.0) {
                    return true;
                } else if (osName.equals("Icarus") && osVersion >= 2.0) {
                    return true;
                }
                break;
            case "5G":
                if (osName.equals("Saturn") && osVersion >= 3.0) {
                    return true;
                } else if (osName.equals("Gara") && osVersion >= 5.0) {
                    return true;
                } else if (osName.equals("Icarus") && osVersion >= 3.0) {
                    return true;
                }
                break;
        }
        return false;
    }
}

public class interface_asign1 {
    public static void main(String args[]) {
        SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
        if (smartPhone.testCompatibility())
            System.out.println("The mobile OS is compatible with the network generation!");
        else
            System.out.println("The mobile OS is not compatible with the network generation!");

        // Create more objects for testing your code
    }
}
