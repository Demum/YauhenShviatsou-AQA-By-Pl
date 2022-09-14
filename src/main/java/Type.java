import java.util.Scanner;
public class Type {
  static  Scanner input = new java.util.Scanner(System.in);
    public static String typeString(){

        String name = input.next();
        return name;
    }
    public static Double typeDouble(){
        Double number = input.nextDouble();
        return number;
    }
    public static int typeInt(){
        int number = input.nextInt();
        return number;
    }
}
