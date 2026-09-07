class MembershipCard {
    String studentName;

    static {
        System.out.println("Library info loaded");
    }

    MembershipCard(String studentName) {
        this.studentName = studentName;
    }

    void printStatus() {
        System.out.println("Membership card issued: " + studentName);
    }
}

public class M4 {
    public static void main(String[] args) {
        String[] names = { "Ananya", "Rohan", "Priya", "Arjun", "Sneha" };

        for (String name : names) {
            MembershipCard card = new MembershipCard(name);
            card.printStatus();
        }
    }
}