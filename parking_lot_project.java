import java.util.*;
class desc_parking_lot {
    String name = "SCE";
    String parking_id = "PID108";
    int no_of_floors = 4;

    public void display_details() {
        System.out.println("Parking Lot Name:" + name);
        System.out.println("Parking Lot ID:" + parking_id);
        System.out.println("Total No of Floors:" + no_of_floors);
    }
}

class parking_slots {
    int floor0[] = {1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3};
    int floor1[] = {1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3};
    int floor2[] = {1,1,1,2,2,2,2,2,3,3,3,3,3,3,3};
    int floor3[] = {1,1,1,2,2,2,2,2,3,3,3,3,3,3,3};
    int[][] floors = {floor0, floor1, floor2, floor3};
    int slot[] = new int[4]; // to store no of slots in each floor
    int truck[] = new int[4]; // to store slots for truck in each floor
    int car[] = new int[4];   // to store slots for cars in each floor
    int vehicle[] = new int[4]; // to store slots for vehicles in each floor
    int unavailable[] = new int[4];

    public void slots() {
        slot[0] = 20;
        slot[1] = 20;
        slot[2] = 15;
        slot[3] = 15;
        truck[0] = 5;
        truck[1] = 5;
        truck[2] = 3;
        truck[3] = 3;
        car[0] = 7;
        car[1] = 7;
        car[2] = 5;
        car[3] = 5;
        vehicle[0] = 8;
        vehicle[1] = 8;
        vehicle[2] = 7;
        vehicle[3] = 7;
    }

    public void display_slots() {
        for (int i = 0; i < 4; i++) {
            System.out.println("floor " + i);
            System.out.println("total no of slots:" + slot[i]);
            unavailable[i] = slot[i] - (truck[i] + car[i] + vehicle[i]);
            System.out.println("avialable slots:" + (slot[i] - unavailable[i]));
            System.out.println("unavailable slots:" + unavailable[i]);
            System.out.println("slots for truck:" + truck[i]);
            System.out.println("slots for car:" + car[i]);
            System.out.println("slots for vehicle:" + vehicle[i]);
        }
    }
}

class booking_releasing_slots extends parking_slots {
    ArrayList<String> ticketNumber = new ArrayList<String>();
    HashMap<String, String> ticketOwnerDetails = new HashMap<String, String>();
    int floor_no = 0;
    int slot_no = 0;
    String name;
    String vehicleNumber;
    String vehicleType;
    String color;
    int value = 0;
    int flag=0;
    String ticket = "";
    Scanner sc = new Scanner(System.in);

    public void booking() {
        System.out.println("Enter the name of the vehicle owner:");
        this.name = sc.next();
        System.out.println("Enter the vehicle number:");
        this.vehicleNumber = sc.next();
        System.out.println("Enter the vehicle type (truck/car/vehicle):");
        this.vehicleType = sc.next();
        System.out.println("Enter the color of the vehicle:");
        this.color = sc.next();

        switch (vehicleType) {
            case "truck":
                value = 1;
                flag = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (floors[i][j] == value) {
                            floor_no = i;
                            slot_no = j;
                            flag = 1;
                            truck[i] -= 1;
                            floors[i][j] = 0;
                            break;
                        }
                    }
                    if (flag == 1) break;
                }
                if (flag != 1)
                    System.out.println("slots full");
                else {
                    ticket = "PID108" + "_1_" + floor_no + "_" + slot_no;
                    ticketNumber.add(ticket);
                    String details = "Owner: " + name + ", Vehicle No: " + vehicleNumber + ", Type: " + vehicleType + ", Color: " + color;
                    ticketOwnerDetails.put(ticket, details);
                    System.out.println("Ticket number:" + ticket);
                    System.out.println("Amount to be paid: Rs100");
                }
                break;
            case "car":
                value = 2;
                flag = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (floors[i][j] == value) {
                            floor_no = i;
                            slot_no = j;
                            flag = 1;
                            car[i] -= 1;
                            floors[i][j] = 0;
                            break;
                        }
                    }
                    if (flag == 1) break;
                }
                if (flag != 1)
                    System.out.println("slots full");
                else {
                    ticket = "PID108" + "_2_" + floor_no + "_" + slot_no;
                    ticketNumber.add(ticket);
                    String details = "Owner: " + name + ", Vehicle No: " + vehicleNumber + ", Type: " + vehicleType + ", Color: " + color;
                    ticketOwnerDetails.put(ticket, details);
                    System.out.println("Ticket number:" + ticket);
                    System.out.println("Amount to be paid: Rs50");
                }
                break;
            case "vehicle":
                value = 3;
                flag = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (floors[i][j] == value) {
                            floor_no = i;
                            slot_no = j;
                            flag = 1;
                            truck[i] -= 1;
                            floors[i][j] = 0;
                            break;
                        }
                    }
                    if (flag == 1) break;
                }
                if (flag != 1)
                    System.out.println("slots full");
                else {
                    ticket = "PID108" + "_3_" + floor_no + "_" + slot_no;
                    ticketNumber.add(ticket);
                    String details = "Owner: " + name + ", Vehicle No: " + vehicleNumber + ", Type: " + vehicleType + ", Color: " + color;
                    ticketOwnerDetails.put(ticket, details);
                    System.out.println("Ticket number:" + ticket);
                    System.out.println("Amount to be paid: Rs30");
                }
                break;
            default:
                System.out.println("Invalid Vehicle Type!...");
                break;
        }
    }

    public void Releasing() {
        System.out.println("Enter the ticket number:");
        String ticket = sc.next();
        System.out.println("Owner Details: " + ticketOwnerDetails.get(ticket));
        int index = ticketNumber.indexOf(ticket);
        if (index != -1) {
            String[] parts = ticket.split("_");
            int vehicle_type = Integer.parseInt(parts[1]);
            int floor_no = Integer.parseInt(parts[2]);
            int slot_no = Integer.parseInt(parts[3]);
            if (vehicle_type == 1) {
                truck[floor_no] += 1;
                floors[floor_no][slot_no] = 1;
            } else if (vehicle_type == 2) {
                car[floor_no] += 1;
                floors[floor_no][slot_no] = 2;
            } else if (vehicle_type == 3) {
                vehicle[floor_no] += 1;
                floors[floor_no][slot_no] = 3;
            }
            ticketNumber.remove(index);
            ticketOwnerDetails.remove(ticket);
            System.out.println("Ticket released successfully!");
        } else {
            System.out.println("Invalid Ticket Number!...");
        }
    }

    public void displayOwnerDetails() {
        System.out.println("Enter the ticket number:");
        String ticket = sc.next();
        String details = ticketOwnerDetails.get(ticket);
        if (details != null) {
            System.out.println("Owner Details: " + details);
        } else {
            System.out.println("Invalid Ticket Number!...");
        }
    }
}

public class parking_lot_project {
    public static void main(String args[]) {
        int choice = 0;
        System.out.println("welcome to Parking lot of SCE");
        desc_parking_lot desc = new desc_parking_lot();
        booking_releasing_slots b = new booking_releasing_slots();
        b.slots();
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("menu");
            System.out.println("1--> Booking a slot(parking)");
            System.out.println("2--> Releasing the slot(unparking)");
            System.out.println("3--> Status of slots");
            System.out.println("4--> Description of Parking Lot");
            System.out.println("5--> Display Owner Details by Ticket Number");
            System.out.println("6--> Exit");
            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            System.out.println("-------------------------------------------");
            switch (choice) {
                case 1:
                    b.booking();
                    break;
                case 2:
                    b.Releasing();
                    break;
                case 3:
                    b.display_slots();
                    break;
                case 4:
                    desc.display_details();
                    break;
                case 5:
                    b.displayOwnerDetails();
                    break;
                case 6:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid Choice Re-enter!...");
            }
        }
    }
}