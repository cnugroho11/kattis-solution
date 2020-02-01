import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int str[] = new int[a];
        for (int i = 0; i < a; i++) {
            str[i] = in.nextInt();
        }
        for (int i = 0; i < a; i++) {
            if (str[i] % 2 == 0) {
                System.out.println(str[i] + " is even");
            } else {
                System.out.println(str[i] + " is odd");
            }
        }
    }
}