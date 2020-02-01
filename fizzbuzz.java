import java.util.Scanner;

public class kattis {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a[];
        String b;
        int x, y, z;

        b = in.nextLine();
        a = b.split(" ");

        x = Integer.parseInt(a[0]);
        y = Integer.parseInt(a[1]);
        z = Integer.parseInt(a[2]);
        
        for (int i = 0; i < z; i++) {
            if ((i + 1) % x == 0 && (i + 1) % y == 0) {
                System.out.println("FizzBuzz");
            }
            else if ((i+1) % x == 0) {
                System.out.println("Fizz");
            }
            else if ((i+1) % y == 0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i+1);
            }
        }
    }
}