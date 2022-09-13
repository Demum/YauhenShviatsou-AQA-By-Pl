import java.util.Scanner;

public class Vyacheslav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = input.next();
        if(name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else{
                System.out.println("Нет такого имени");
            }
        }
    }

