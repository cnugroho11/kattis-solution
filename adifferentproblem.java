import java.util.Scanner;

public class string_manipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a,b ;
        while (in.hasNextLong())
        {
            a = in.nextLong();
            b = in.nextLong();
            System.out.printf("%d\n", b < a ? a - b : b - a);
        }
    }
}