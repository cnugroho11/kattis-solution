import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        if (i % 2 == 0){
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}