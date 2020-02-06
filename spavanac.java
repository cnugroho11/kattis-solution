import java.util.Scanner;

public class cb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aa = in.nextLine();
        String [] split = aa.split(" ");
        
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        
        b = b - 45;
        if (b < 0) {
            a = a - 1;
            b = b + 60;
        }
        if (a < 0) {
            a = 23;
        }
        System.out.println(a +" "+b);
    }
}