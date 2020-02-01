import java.util.Scanner;

public class hallowen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        a = in.nextLine();
        if (a.equals("OCT 31") || a.equals("DEC 25")) {
            System.out.println("yup");
        }
        else {
            System.out.println("nope");
        }
    }
}