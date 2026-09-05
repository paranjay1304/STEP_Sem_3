import java.util.Scanner;

public class ReferenceValidator {
    static String normalizeReference(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3)
            return trimmed;
        String first3 = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        return first3 + rest;
    }

    static String validateAndFormat(String reference) {
        if (reference.length() != 14)
            return "Invalid: wrong length";

        String bankCode = reference.substring(0, 3);
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(bankCode.charAt(i)))
                return "Invalid: bank code must be 3 letters";
        }

        String body = reference.substring(3);
        for (int i = 0; i < body.length(); i++) {
            if (!Character.isDigit(body.charAt(i)))
                return "Invalid: reference body must be digits";
        }

        String date = reference.substring(3, 9);
        String seq = reference.substring(9, 14);
        String dd = date.substring(0, 2);
        String mm = date.substring(2, 4);
        String yy = date.substring(4, 6);

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(bankCode).append("] DATE: ").append(dd).append("/").append(mm)
                .append("/").append(yy).append(" | SEQ: ").append(seq);
        return sb.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter reference: ");
            String raw = sc.nextLine();
            String normalized = normalizeReference(raw);
            System.out.println(validateAndFormat(normalized));
        }
    }
}
