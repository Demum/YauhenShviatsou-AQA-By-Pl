import java.util.Scanner;

public class NumberMoreThenSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        if(number>7){
            System.out.println("Привет");
        }
    }
}
