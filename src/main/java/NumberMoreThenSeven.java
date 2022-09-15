public class NumberMoreThenSeven {
    public static void main(String[] args) {
        Double number = 0.0;
        System.out.println("Enter number");
        try {
            number = Type.typeDouble();
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        if (number > 7) {
            System.out.println("Привет");
        }
        Type.closeScanner();
    }
}
