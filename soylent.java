import java.util.Scanner;

public class cb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        int aa[] = new int [tc];
        int bb[] = new int [tc];
        for (int i = 0; i < tc; i++) {
            aa[i] = scan.nextInt();
        }
        for (int i = 0; i < tc; i++) {
            bb[i] =(int)Math.ceil(aa[i]/400.0);
            System.out.println(bb[i]);
        }
    }
}