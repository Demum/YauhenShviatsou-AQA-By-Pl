import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberMoreThenSeven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
       try {
           int number = input.nextInt();
           if(number>7){
               System.out.println("Привет");
           }
       } catch (InputMismatchException e) {
           System.out.println("Incorrect number");
           e.printStackTrace();
       }
    }
}
