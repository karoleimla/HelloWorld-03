/**
 * Created by opilane on 19.10.2016.
 */

import java.util.Scanner;

public class World002 {

    public static void main(String[] args) {
        String firstName;
        String lastName;
        String message;
        double raadius;
        double pi = 3.14;
        double pindala;
        Scanner in = new Scanner(System.in);
        int hour, minute;
        message = "Hello";          // give message the value "Hello!"
        hour = 11;                   // assign the value 11 to hour
        minute = 59;                 // set minute to 59
        firstName = "K";
        lastName = "E";
        System.out.println("Hello, World!");
        System.out.println(message + " " + firstName + " " + lastName);
        System.out.println("Kell on: " + hour + ":" + minute);

        System.out.print("Mitu cm on ringi raadius?");
        raadius = in.nextDouble();
        pindala = pi * raadius * raadius;
        System.out.println("Ringi pindala on " + pindala + "cm²");

    }

}
