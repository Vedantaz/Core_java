class Asset {

    @Override
    public String toString() {
        return "Asset Id: " + getAssetId() + ", Asset Name: " + getAssetName() + ", Asset Expiry: " + getAssetExpiry();
    }

    private String assetId;
    private String assetName;
    private String assetExpiry;

    public Asset(String assetId, String assetName, String assetExpiry) {
        this.assetId = validateAssetId(assetId);
        this.assetName = assetName;
        this.assetExpiry = assetExpiry;
    }

    public String getAssetId() {
        return assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public String getAssetExpiry() {
        return assetExpiry;

    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public void setAssetExpiry(String assetExpiry) {
        this.assetExpiry = assetExpiry;   

    }

    private String validateAssetId(String assetId) {
        if (!assetId.matches("^(DSK|LTP|IPH)-\\d{6}[HL]$")) {
            throw new IllegalArgumentException("Invalid asset ID format: " + assetId);
        }
        return assetId;
    }

}

class Resources {

    private static final Map<String, Integer> monthMap = Map.of(
            "Jan", 1, "Feb", 2, "Mar", 3, "Apr", 4, "May", 5, "Jun", 6,
            "Jul", 7, "Aug", 8, "Sep", 9, "Oct", 10, "Nov", 11, "Dec", 12);

    public static int getMonth(String month) {
        // ... (month number mapping logic)
        Integer monthNumber = monthMap.get(month.toUpperCase());
        return monthNumber != null ? monthNumber : 0;
    }
}

class InvalidAssetsException extends Exception {
    public InvalidAssetsException(String message) {
        super(message);
    }
}

class InvalidExperienceException extends Exception {
    public InvalidExperienceException(String message) {
        super(message);
    }
}

class Employee {

    @Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName();

    private static int contractIdCounter = 10000;
    private static int permanentIdCounter = 10000;

    private String employeeId;
    private String employeeName;

    public Employee(String employeeName, boolean isPermanent) {
        this.employeeName = validateEmployeeName(employeeName);
        this.employeeId = generateEmployeeId(isPermanent);
    }

    private String generateEmployeeId(boolean isPermanent) {
        if (isPermanent) {
            return "E" + String.format("%05d", permanentIdCounter++);
        } else {
            return "C" + String.format("%05d", contractIdCounter++);
        }
    }

    public abstract double calculateSalary();

    private String validateEmployeeName(String employeeName) {
        // ... (employee name validation logic)
        if (employeeName == null || employeeName.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be null or empty");
        }

        String[] words = employeeName.trim().split("\\s+");
        if (words.length < 2) {
            throw new IllegalArgumentException("Employee name must contain at least two words");
        }

        for (String word : words) {
            if (!word.matches("[A-Z][a-z]+")) {
                throw new IllegalArgumentException(
                        "Each word in employee name must start with an uppercase letter and contain only alphabets");
            }
        }
        return employeeName;
    }

}

class ContractEmployee {
    // Implement your code here
    @Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Wage Per Hour: "+getWagePerHour();

    private double wagePerHour;

    public ContractEmployee(String employeeName, double wagePerHour) {
        super(employeeName, false);
        this.wagePerHour = wagePerHour;
    }

    @Override
    public double calculateSalary(float hoursWorked) {
        if (hoursWorked < 190) {
            double deductedAmount = (wagePerHour / 2) * (190 - hoursWorked);
            return Math.round(wagePerHour * hoursWorked - deductedAmount);
        } else {
            return Math.round(wagePerHour * hoursWorked);
        }
    }

}

class PermanentEmployee {
    // Implement your code here

    @Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Basic Pay: "+getBasicPay()+", Salary Components: "+getSalaryComponents()+", Assets: "+getAssets();

    private double basicPay;
    private String[] salaryComponents;
    private Asset[] assets;

    public PermanentEmployee(String employeeName, double basicPay, String[] salaryComponents, Asset[] assets) {
        super(employeeName,   
 true);
        this.basicPay = basicPay;
        this.salaryComponents = salaryComponents;
        this.assets = assets;
    }

    @Override
    public double calculateSalary(float experience) {
        if (experience < 2.5) {
        throw new InvalidExperienceException("A minimum of 2.5 years is required for bonus!");
    }

    private double calculateBonus(float experience) {
        if (experience >= 5) {
            return basicPay * 0.2; // 20% bonus for 5+ years
        } else if (experience >= 3) {
            return basicPay * 0.15; // 15% bonus for 3-5 years
        } else {
            return 0; // No bonus for less than 3 years
        }
    }

    double bonus = calculateBonus(experience);
    double daComponent = basicPay * 0.5; // Assuming DA is 50%
    double hraComponent = basicPay * 0.45; // Assuming HRA is 45%

    return Math.round(basicPay+daComponent+hraComponent+bonus);
    }

    public Asset[] getAssetsByDate(String lastDate) {
        return assets.stream()
            .filter(asset -> isAssetExpired(asset, lastDate))
            .toArray(Asset[]::new);
    }

    private boolean isAssetExpired(Asset asset, String lastDate) {
    try {
        // Parse both dates using a formatter
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date assetExpiry = formatter.parse(asset.getAssetExpiry());
        Date lastDateParsed = formatter.parse(lastDate);

        // Check if asset expiry is before the provided date
        return assetExpiry.before(lastDateParsed);
    } catch (ParseException e) {
        // Handle parsing exception (e.g., invalid date format)
        System.err.println("Error parsing date: " + e.getMessage());
        return false; // Default to not expired on parsing error
    }
}
}

class Admin {
    // Implement your code here

    public void generateSalarySlip(Employee[] employees, float[] salaryFactor) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            float factor = salaryFactor[i];

            try {
                employee.calculateSalary(factor);
                System.out.println("Salary Slip for " + employee.getEmployeeId() + ": $" + employee.getSalary());
            } catch (InvalidExperienceException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    public int generateAssetsReport(Employee[] employees, String lastDate) {
        int assetCount = 0;
        for (Employee employee : employees) {
            if (employee instanceof PermanentEmployee) {
                PermanentEmployee permanentEmployee = (PermanentEmployee) employee;
                try {
                    Asset[] assets = permanentEmployee.getAssetsByDate(lastDate);
                    assetCount += assets.length;
                } catch (InvalidAssetsException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }
        }
        return assetCount;
    }

    public String[] generateAssetsReport(Employee[] employees, char assetCategory) {
        List<String> assetIds = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof PermanentEmployee) {
                PermanentEmployee permanentEmployee = (PermanentEmployee) employee;

                for (Asset asset : permanentEmployee.getAssets()) {
                    if (asset.getAssetId().toUpperCase().startsWith(String.valueOf(assetCategory))) {
                        assetIds.add(asset.getAssetId());
                    }
                }
            }
        }
        return assetIds.toArray(new String[0]);
    }
}

public class integrated_assignment{
    public static void main(String[] args) {
    	Admin admin = new Admin();
    	
    	Asset asset1 = null;
    	Asset asset2 = null;
    	Asset asset3 = null;
    	Asset asset4 = null;
    	Asset asset5 = null;
    	Asset asset6 = null;
    	Asset asset7 = null;
    	Asset asset8 = null;
    	Asset asset9 = null;
    	Asset asset10 = null;
    	
    	PermanentEmployee permanentEmployee1 = null;
    	PermanentEmployee permanentEmployee2 = null;
    	PermanentEmployee permanentEmployee3 = null;
    	PermanentEmployee permanentEmployee4 = null;
    	PermanentEmployee permanentEmployee5 = null;
		
		ContractEmployee contractEmployee1 = null;
		ContractEmployee contractEmployee2 = null;
		
		Employee[] employees = null;
		float[] salaryFactor = null;
		
		try {
			asset1 = new Asset("DSK-876761L", "Dell-Desktop", "2020-Dec-01");
	    	asset2 = new Asset("DSK-876762L", "Acer-Desktop", "2021-Mar-31");
	    	asset3 = new Asset("DSK-876763L", "Dell-Desktop", "2022-Jun-12");
	    	asset4 = new Asset("LTP-987123H", "Dell-Laptop", "2021-Dec-31");
	    	asset5 = new Asset("LTP-987124h", "Dell-Laptop", "2021-Sep-20");
	    	asset6 = new Asset("LTP-987125L", "HP-Laptop", "2022-Oct-25");
	    	asset7 = new Asset("LTP-987126l", "HP-Laptop", "2021-Oct-02");
	    	asset8 = new Asset("IPH-110110h", "VoIP", "2021-Dec-12");
	    	asset9 = new Asset("IPH-1101201h", "VoIP", "2020-Dec-31");
	    	asset10 = new Asset("IPH-110130h", "VoIP", "2020-Nov-30");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Details of all available assets");
		System.out.println();
		
		try {
			Asset[] assets = { asset1, asset2, asset3, asset4, asset5, asset6, asset7, asset8, asset9, asset10 };
			int counter = 1;
			for (Asset asset : assets) {
				System.out.println("Details of asset"+counter++);
				System.out.println("\tAsset Id: "+asset.getAssetId());
				System.out.println("\tAsset Name: "+asset.getAssetName());
				System.out.println("\tAsset Valid Till: "+asset.getAssetExpiry());
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Correcting all the invalid assetIds");
		System.out.println();
		
		try {
			asset9.setAssetId("IPH-110120h");
			System.out.println("Details of asset9");
			System.out.println("\tAsset Id: "+asset9.getAssetId());
			System.out.println("\tAsset Name: "+asset9.getAssetName());
			System.out.println("\tAsset Valid Till: "+asset9.getAssetExpiry());
			System.out.println();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			permanentEmployee1 = new PermanentEmployee("Roger Fed", 15500.0, new String[] {"DA-50","HRA-40"}, new Asset[] {asset1, asset10});
			permanentEmployee2 = new PermanentEmployee("Serena W", 14000.0, new String[] {"DA-40","HRA-40"}, new Asset[] {asset6, asset9});
			permanentEmployee3 = new PermanentEmployee("James Peter", 18500.0, new String[] {"DA-50","HRA-45"}, new Asset[] {asset4});
			permanentEmployee4 = new PermanentEmployee("Catherine Maria", 20000.0, new String[] {"DA-50","HRA-45"}, new Asset[] {asset2, asset5});
			permanentEmployee5 = new PermanentEmployee("Jobin Nick", 21000.0, new String[] {"DA-50","HRA-50"}, null);

			contractEmployee1 = new ContractEmployee("Rafael N", 70);			
			contractEmployee2 = new ContractEmployee("Ricky Neol", 72.5);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Initiating salary calculation...");
		
		try {
			employees = new Employee[] { permanentEmployee1, permanentEmployee2, permanentEmployee3, permanentEmployee4, permanentEmployee5,
					contractEmployee1, contractEmployee2 };
			salaryFactor = new float[] { 3.9f, 2.3f, 4f, 8.1f, 12.5f, 189, 211 };
			
			admin.generateSalarySlip(employees, salaryFactor);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		permanentEmployee5.setSalary(-1);
		
		System.out.println();
		System.out.println("Details of employees");
		System.out.println();
		
		try {
			int pCounter = 1, cCounter = 1;
			for (Employee employee : employees) {
				if (employee instanceof PermanentEmployee) {
					PermanentEmployee permanentEmployee = (PermanentEmployee) employee;
					System.out.println("Details of permanentEmployee"+pCounter++);
					System.out.println("\tEmployee Id: "+permanentEmployee.getEmployeeId());
					System.out.println("\tEmployee Name: "+permanentEmployee.getEmployeeName());
					System.out.println("\tSalary: "+permanentEmployee.getSalary());	
					System.out.println("\tExperience: "+permanentEmployee.getExperience());	
					System.out.print("\tAssets Allocated: ");
					if (permanentEmployee.getAssets() != null) {
						for (Asset asset : permanentEmployee.getAssets()) {
							System.out.print(asset.getAssetId()+" ");
						}
						System.out.println();
					}
					else
						System.out.println("No assets allocated!");
				}
				else {
					System.out.println("Details of contractEmployee"+cCounter++);
					System.out.println("\tEmployee Id: "+employee.getEmployeeId());
					System.out.println("\tEmployee Name: "+employee.getEmployeeName());
					System.out.println("\tSalary: "+employee.getSalary());
				}
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();	
		System.out.println("Reports");
		System.out.println();
		
		try {
			
			employees = new Employee[] { permanentEmployee1, permanentEmployee2, permanentEmployee3, permanentEmployee4,
					contractEmployee1, contractEmployee2 };
			
			int assetCount = admin.generateAssetsReport(employees, "2021-Dec-31");
			if (assetCount >= 0)
				System.out.println("Number of allocated assets expiring on or before 2021-Dec-31: "+assetCount);
			else
				System.out.println("Sorry, report cannot be generated!");
			
			System.out.println();
			
			assetCount = admin.generateAssetsReport(employees, "2020-Sep-30");
			if (assetCount >= 0)
				System.out.println("Number of allocated assets expiring on or before 2020-Sep-30: "+assetCount);
			else
				System.out.println("Sorry, report cannot be generated!");
						
			System.out.println();
			
			
			String[] desktopAssetIds = admin.generateAssetsReport(employees, 'D');

			System.out.println("All the allocated desktop assets");
			for (String assetId : desktopAssetIds) {
				if (assetId != null)
					System.out.println("\t"+assetId);
			}
			
			System.out.println();
			
			String[] laptopAssetIds = admin.generateAssetsReport(employees, 'L');
			
			System.out.println("All the allocated laptop assets");
			for (String assetId : laptopAssetIds) {
				if (assetId != null)
					System.out.println("\t"+assetId);
			}
			
			System.out.println();
			
		
			String[] voipAssetIds = admin.generateAssetsReport(employees, 'i');
			
			System.out.println("All the allocated VoIP assets");
			for (String assetId : voipAssetIds) {
				if (assetId != null)
					System.out.println("\t"+assetId);
			}
			
			System.out.println();
					
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
