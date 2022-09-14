import java.util.InputMismatchException;

public class NumberMoreThenSeven {

    public static void main(String[] args) {
        Double number=0.0;
         System.out.println("Enter number");
       try {
           number = Type.typeDouble();
       } catch (InputMismatchException e) {
           System.out.println("Incorrect number: "+ Type.typeString());
           e.printStackTrace();
       }
           if(number>7){
               System.out.println("Привет");
           }

    }
}
