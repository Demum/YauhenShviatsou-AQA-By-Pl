import java.util.Scanner;

public class Type {
    static Scanner input = new Scanner(System.in);
    public static String typeString() {
        String line = input.nextLine();
        if (line.contains(" ")) {
            System.out.println("Incorrect value with spaces : " + line);
            System.out.println("Please type value without spaces");
            return typeString();
        } else
            return line;
    }
    public static Double typeDouble() {
        Double number = Double.parseDouble(typeString());
        return number;
    }
    public static int typeInt() {
        int number = Integer.parseInt(typeString());
        return number;
    }
    public static void closeScanner() {
        input.close();
    }
}
