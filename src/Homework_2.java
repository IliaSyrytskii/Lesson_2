import java.util.Scanner;

public class Homework_2 {
    public static void main (String[] args) {
        System.out.println("Please, enter your name");
                Scanner sc = new Scanner(System.in);
                String name = sc.next();
        for (int n = 0; n < 10; n++) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Name " + name);
        }
    }

}