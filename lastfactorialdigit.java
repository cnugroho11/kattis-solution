import java.util.Scanner;

public class cb {

    static int fak(int a) {
        if (a != 0) {
            return a * fak(a - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        int aa[] = new int[tc];
        int bb[] = new int[tc];
        for (int i = 0; i < tc; i++) {
            aa[i] = scan.nextInt();
        }
        for (int i = 0; i < tc; i++) {
            bb[i] = fak(aa[i]);
            String tmp = String.valueOf(bb[i]);
            if (tmp.length() > 1) {
                String ff = tmp.substring(tmp.length()-1);
                System.out.println(ff);
            }
            else{
                System.out.println(tmp);
            }
        }
    }
}