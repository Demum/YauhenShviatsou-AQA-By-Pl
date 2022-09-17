public class Vyacheslav {
    public static void main(String[] args) {
        System.out.println("Enter the name");
        if (Type.typeString().equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        Type.closeScanner();
    }
}

