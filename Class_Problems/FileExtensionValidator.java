import java.util.Scanner;

public class FileExtensionValidator {
    static String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1)
            return "Rejected — invalid file type";
        String ext = filename.substring(dotIndex + 1);
        if (ext.equalsIgnoreCase("pdf") || ext.equalsIgnoreCase("docx") || ext.equalsIgnoreCase("zip")) {
            return "Accepted";
        }
        return "Rejected — invalid file type";
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter filename: ");
            String filename = sc.nextLine();
            System.out.println(validateFileExtension(filename));
        }
    }
}
