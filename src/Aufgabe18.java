import java.util.Scanner;

public class Aufgabe18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final String spring = "Spring";
        final String summer = "Summer";
        final String autumn = "Autumn";
        final String winter = "Winter";
        int option;

        System.out.print("Enter number of a month: \n");
        option = scanner.nextInt();

        switch (option) {
            case 3,4,5:
                System.out.println("Month " + option + " is" + spring + ".");
                break;
            case 6,7,8:
                System.out.println("Month " + option + " is" + summer + ".");
                break;
            case 9,10,11:
                 System.out.println("Month " + option + " is" + autumn + ".");
                 break;
            case 12,1,2:
                 System.out.println("Month " + option + " is" + winter + ".");
                 break;
            default:
                 System.out.println("No Season!");
        }

        scanner.close();
    }
}
