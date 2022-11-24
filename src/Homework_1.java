import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) throws InterruptedException{
            Scanner sc = new Scanner(System.in);
            String Name = sc.next();

        for (int t = 0; t < 10; t++) {


            Thread.sleep(2500);
            System.out.println("Name " + Name);


        }
    }
}
