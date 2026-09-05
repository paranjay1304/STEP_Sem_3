import java.util.Scanner;

public class PhoneNumberMasker {
    static String maskPhoneNumber(String phone) {
        if (phone.length() != 10)
            return "Invalid phone number";
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i)))
                return "Invalid phone number";
        }
        String last4 = phone.substring(6);
        StringBuilder sb = new StringBuilder("XXXXXX" + last4);
        sb.insert(6, "-");
        return sb.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter phone number: ");
            String phone = sc.nextLine();
            System.out.println(maskPhoneNumber(phone));
        }
    }
}
