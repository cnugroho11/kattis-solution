import java.util.Scanner;

public class huruf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in;
        String jadi [];
        in = sc.nextLine();
        jadi = in.split("-");
        for (int i = 0; i < jadi.length; i++) {
            System.out.print(jadi [i].substring(0, 1));
        }
    }
}