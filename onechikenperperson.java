import java.util.Scanner;


public class cb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] values = s.split(" ");
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        if (a < b && (b - a) != 1) {
            System.out.println("Dr. Chaz will have " + (b - a) + " pieces of chicken left over!");
        } else if (a < b && (b - a) == 1) {
            System.out.println("Dr. Chaz will have " + (b - a) + " piece of chicken left over!");
        } else if (a > b && (a - b) != 1) {
            System.out.println("Dr. Chaz needs " + (a - b) + " more pieces of chicken!");
        } else if (a > b && (a - b) == 1) {
            System.out.println("Dr. Chaz needs " + (a - b) + " more piece of chicken!");
        }
    }
}