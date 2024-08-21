class Member {
    private int memberId;
    private String name;

    // Constructor to initialize memberId and name
    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Getter for memberId
    public int getMemberId() {
        return memberId;
    }

    // Setter for memberId
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

class Room {
    private static int roomCounter;
    private int roomNo;
    private int capacity;

    // Static block to initialize the roomCounter
    static {
        roomCounter = 500; // Starting room number
    }

    // Constructor to generate roomNo and initialize capacity
    public Room() {
        this.roomNo = roomCounter++;
        this.capacity = 4; // Each room can accommodate 4 members
    }

    // Getter for roomNo
    public int getRoomNo() {
        return roomNo;
    }

    // Getter for capacity
    public int getCapacity() {
        return capacity;
    }

    // Setter for capacity
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

class Admin {
    public void assignRoom(Room[] rooms, Member member) {
        for (Room room : rooms) {
            if (room.getCapacity() > 0) { // Check if the room has available capacity
                room.setCapacity(room.getCapacity() - 1); // Reduce the capacity by 1
                System.out.println("Member " + member.getName() + " (ID: " + member.getMemberId()
                        + ") assigned to Room No " + room.getRoomNo());
                return;
            }
        }
        System.out.println("No available rooms for Member " + member.getName() + " (ID: " + member.getMemberId() + ")");
    }
}

public class rooms {
    public static void main(String[] args) {
        // Create Room objects
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();

        // Array of rooms
        Room[] rooms = { room1, room2, room3 };

        // Create Member objects
        Member member1 = new Member(101, "Alice");
        Member member2 = new Member(102, "Bob");
        Member member3 = new Member(103, "Charlie");
        Member member4 = new Member(104, "David");
        Member member5 = new Member(105, "Eve");
        Member member6 = new Member(106, "Frank");

        // Create Admin object
        Admin admin = new Admin();

        // Assign rooms to members
        admin.assignRoom(rooms, member1);
        admin.assignRoom(rooms, member2);
        admin.assignRoom(rooms, member3);
        admin.assignRoom(rooms, member4);
        admin.assignRoom(rooms, member5);
        admin.assignRoom(rooms, member6);
    }
}

// class Room {
// //Implement your code here

// private static int roomCounter;
// private int roomNo;
// private int capacity;

// public String toString(){
// return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
// }

// // Static block to initialize the roomCounter
// static {
// roomCounter = 500; // Starting room number
// }

// // Constructor to generate roomNo and initialize capacity
// public Room() {
// this.roomNo = roomCounter++;
// this.capacity = 4; // Each room can accommodate 4 members
// }

// // Getter for roomNo
// public int getRoomNo() {
// return roomNo;
// }

// // Getter for capacity
// public int getCapacity() {
// return capacity;
// }

// // Setter for capacity
// public void setCapacity(int capacity) {
// this.capacity = capacity;
// }

// }

// class Member {
// //Implement your code here

// private int memberId;
// private String name;
// public String toString(){
// return "Member\nmemberId: "+this.memberId+"\nname: "+this.name;
// }

// // Constructor to initialize memberId and name
// public Member(int memberId, String name) {
// this.memberId = memberId;
// this.name = name;
// }

// // Getter for memberId
// public int getMemberId() {
// return memberId;
// }

// // Setter for memberId
// public void setMemberId(int memberId) {
// this.memberId = memberId;
// }

// // Getter for name
// public String getName() {
// return name;
// }

// // Setter for name
// public void setName(String name) {
// this.name = name;
// }
// }

// class Admin {
// //Implement your code here
// public void assignRoom(Room[] rooms, Member member) {
// for (Room room : rooms) {
// if (room.getCapacity() > 0) { // Check if the room has available capacity
// room.setCapacity(room.getCapacity() - 1); // Reduce the capacity by 1
// System.out.println("Member " + member.getName() + " (ID: " +
// member.getMemberId() + ") assigned to Room No " + room.getRoomNo());
// return;
// }
// }
// System.out.println("No available rooms for Member " + member.getName() + "
// (ID: " + member.getMemberId() + ")");
// }
// }

// class Tester {
// public static void main(String args[]) {
// Room room1 = new Room();
// Room room2 = new Room();
// Room room3 = new Room();
// Room room4 = new Room();
// Room room5 = new Room();

// Room[] totalRooms = { room1, room2, room3, room4, room5 };

// Admin admin = new Admin();

// Member member1 = new Member(101, "Serena");
// Member member2 = new Member(102, "Martha");
// Member member3 = new Member(103, "Nia");
// Member member4 = new Member(104, "Maria");
// Member member5 = new Member(105, "Eva");

// Member[] members = { member1, member2, member3, member4, member5 };

// for (Member member : members) {
// admin.assignRoom(totalRooms, member);
// if(member.getRoom()!=null) {
// System.out.println("Hi "+member.getName()+"! Your room number is
// "+member.getRoom().getRoomNo());
// }
// else {
// System.out.println("Hi "+member.getName()+"! No room available");
// }
// }
// }
// }

// . this is the infosys course code ...
