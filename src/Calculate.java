import java.util.Scanner;

/**
 * Created by User on 06.12.2017.
 */
public class Calculate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         int a, b, c;
        System.out.println("Введите первое число");
        a = scan.nextInt();
        System.out.println("Введите второе число");
        b = scan.nextInt();

        c = a + b;

        System.out.println("Конечное число = " + c);



    }
}
