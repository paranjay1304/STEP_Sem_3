class HallTicket {
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {
        this.seatNumber = seatNumber;
    }
}

public class HallTicketReferenceProgram {
    public static void main(String[] args) {
        HallTicket priya = new HallTicket("Priya", 0);
        HallTicket copy = priya;

        copy.seatNumber = 45;

        HallTicket separate = new HallTicket("Priya", 45);

        System.out.println("Priya's seatNumber: " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));
        System.out.println("separate == priya: " + (separate == priya));
    }
}