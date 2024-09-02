// Implement user-defined exception classes
class Applicant {

    private String name;
    private String jobProfile;
    private int age;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Custom exception classes
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidJobProfileException extends Exception {
    public InvalidJobProfileException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Validator class
class Validator {
    // Validate name
    public boolean validateName(String name) throws InvalidNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be null or empty.");
        }
        return true;
    }

    // Validate job profile
    public boolean validateJobProfile(String jobProfile) throws InvalidJobProfileException {
        String[] validJobProfiles = { "Associate", "Clerk", "Executive", "Officer" };
        for (String validProfile : validJobProfiles) {
            if (validProfile.equalsIgnoreCase(jobProfile)) {
                return true; // return true if validation passes
            }
        }
        throw new InvalidJobProfileException("Invalid job profile.");

    }

    // Validate age
    public boolean validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 30) {
            throw new InvalidAgeException("Age must be between 18 and 30.");
        }
        return true; // return true if validation passes
    }

    // Main validation method
    public boolean validate(Applicant applicant)
            throws InvalidNameException, InvalidJobProfileException, InvalidAgeException {
        boolean isNameValid = validateName(applicant.getName());
        boolean isJobProfileValid = validateJobProfile(applicant.getJobProfile());
        boolean isAgeValid = validateAge(applicant.getAge());

        return isNameValid && isJobProfileValid && isAgeValid; // return true if all validations pass
    }
}

// Tester class to test the functionality
public class validator_ {

    public static void main(String[] args) {

        try {
            Applicant applicant = new Applicant();
            applicant.setName("Jenny");
            applicant.setJobProfile("Clerk");
            applicant.setAge(25);

            // No need to instantiate Validator since all methods are static
            Validator validator = new Validator();
            boolean isValid = validator.validate(applicant);

            if (isValid) {
                System.out.println("Application submitted successfully!");
            }
        } catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
