import java.util.InputMismatchException;

public class ElementsOfArrayAreMultiplesOfThree {
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        try {
            int sizeOfArray = Type.typeInt();
            Double array[] = new Double[sizeOfArray];
            System.out.println("Insert array elements:");
            for (int i = 0; i < sizeOfArray; i++) {
                array[i] = Type.typeDouble();
            }
            System.out.print("ElementsOfArrayAreMultiplesOfThree: ");
            for (int i = 0; i < sizeOfArray; i++) {
                if (array[i] % 3 == 0)
                    System.out.print(" " + array[i]);
            }
               } catch (InputMismatchException e) {
            System.out.println("Incorrect number: " + Type.typeString());
            e.printStackTrace();
        }
    }
}
