import java.util.Scanner;

/**
 * Created by KPS on 7/15/2020.
 */
public class Main {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

    }
}
