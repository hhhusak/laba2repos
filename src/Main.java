import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double z1;
        //Створює змінну z2
        double z2;
        System.out.println("Введіть значення x: ");
        double x = scan.nextInt();
        z1 = 1 - Math.sin(2 * x) * Math.sin(2 * x) / 4 + Math.cos(2 * x);
        z2 = Math.pow(Math.cos(x), 2) + Math.pow(Math.cos(x), 4);
        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
    }
}