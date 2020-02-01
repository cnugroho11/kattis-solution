import java.util.Scanner;

public class cb {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ori = "";
        String aa  = scan.nextLine();
        for (int i = aa.length()-1; i >= 0; i--) {
            ori = ori + aa.charAt(i);
        }
        String split [] = ori.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        if (a > b) {
            System.out.println(a);
        }
        else if (b > a) {
            System.out.println(b);
        }
    }
}
