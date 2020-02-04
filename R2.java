import java.util.Scanner;

public class cb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aa = in.nextLine();
        String[] splt = aa.split(" ");
        int a = Integer.parseInt(splt[0]);
        int b = Integer.parseInt(splt[1]);
        
        int tmp = b * 2;
        a = tmp - a;
        System.out.println(a);
    }
}