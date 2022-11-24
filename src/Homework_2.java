import java.util.Scanner;

public class Homework_2 {
    public static void main (String[] args) {
        System.out.println("Please, enter your name");
                Scanner sc = new Scanner(System.in);
        for (int n = 0; n < 10; n++) {
                String name = sc.next();
                System.out.println("Name " + name);
        }
    }

}