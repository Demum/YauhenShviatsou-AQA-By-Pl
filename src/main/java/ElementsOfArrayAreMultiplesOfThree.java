import java.util.Scanner;

public class ElementsOfArrayAreMultiplesOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int sizeOfArray = input.nextInt();
        int array[] = new int[sizeOfArray];
        System.out.println("Insert array elements:");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("ElementsOfArrayAreMultiplesOfThree:");
        for (int i = 0; i < sizeOfArray; i++) {
            if(array[i]%3==0)
           System.out.print (" " + array[i]);
        }

    }
}
