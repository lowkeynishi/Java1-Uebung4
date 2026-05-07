import java.util.Scanner;

public class Aufgabe18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final String spring = "Spring";
        final String summer = "Summer";
        final String autumn = "Autumn";
        final String winter = "Winter";

        final int JANUARY = 1;
        final int FEBRUARY = 2;
        final int MARCH = 3;
        final int APRIL = 4;
        final int MAY = 5;
        final int JUNE = 6;
        final int JULY = 7;
        final int AUGUST = 8;
        final int SEPTEMBER = 9;
        final int OCTOBER = 10;
        final int NOVEMBER = 11;
        final int DECEMBER = 12;

        int option;

        System.out.print("Enter number of a month: \n");
        option = scanner.nextInt();

        switch (option) {
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Month " + option + " is " + spring + ".");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Month " + option + " is " + summer + ".");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Month " + option + " is " + autumn + ".");
                break;
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("Month " + option + " is " + winter + ".");
                break;
            default:
                System.out.println("No Season!");
        }

        scanner.close();
    }
}
