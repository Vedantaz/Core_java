
class Event {
    // Implement your code here
    private String eventName;
    private String participantName;
    private double registrationFee;

    // Constructor
    public Event(String eventName, String participantName) {
        this.eventName = eventName;
        this.participantName = participantName;
        registerEvent();
    }

    public void registerEvent() {
        switch (eventName.toLowerCase()) {
            case "singing":
                registrationFee = 200.0;
                break;
            case "dancing":
                registrationFee = 300.0;
                break;
            case "sports":
                registrationFee = 150.0;
                break;
            case "painting":
                registrationFee = 100.0;
                break;
            default:
                registrationFee = 0.0;
                break;
        }
    }

    // Getter and Setter methods
    public String getEventName() {
        return eventName;
    }

    public String getParticipantName() {
        return participantName;
    };

    public double getRegistrationFee() {
        return registrationFee;
    }
}

class SoloEvent extends Event {
    // Implement your code here

    private int participantNo;

    // Constructor
    public SoloEvent(String eventName, String participantName, int participantNo) {
        super(eventName, participantName);
        this.participantNo = participantNo;
    }

    // Getter and Setter methods
    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }
}

class TeamEvent extends Event {
    // Implement your code here

    private int noOfParticipants;
    private int teamNo;

    // Constructor
    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
        super(eventName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
        registerEvent();
    }

    @Override
    public void registerEvent() {
        double feePerMember = 0.0;

        switch (getEventName().toLowerCase()) {
            case "relay":
                feePerMember = 50.0;
                break;
            case "quiz":
                feePerMember = 30.0;
                break;
            case "soccer":
                feePerMember = 100.0;
                break;
            default:
                feePerMember = 0.0;
                break;
        }

        // Calculate total registration fee
        double registrationFee = feePerMember * noOfParticipants;
        if (feePerMember == 0.0) {
            registrationFee = 0.0;
        }
        setRegistrationFee(registrationFee);
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    private void setRegistrationFee(double fee) {
        // Since registrationFee is private in Event, we use reflection
        try {
            java.lang.reflect.Field field = Event.class.getDeclaredField("registrationFee");
            field.setAccessible(true);
            field.set(this, fee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class event_interface {

    public static void main(String[] args) {

        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
        soloEvent.registerEvent();
        if (soloEvent.getRegistrationFee() != 0) {
            System.out.println("Thank You " + soloEvent.getParticipantName()
                    + " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
            System.out.println("Your participant number is " + soloEvent.getParticipantNo());

        } else {
            System.out.println("Please enter a valid event");
        }

        System.out.println();
        TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
        teamEvent.registerEvent();
        if (teamEvent.getRegistrationFee() != 0) {
            System.out.println("Thank You " + teamEvent.getParticipantName()
                    + " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
            System.out.println("Your team number is " + teamEvent.getTeamNo());
        } else {
            System.out.println("Please enter a valid event");
        }
    }
}
