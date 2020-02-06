import java.util.Scanner;

public class cb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int tc = sc.nextInt();
        int jadi = 0;
        int[] kuota = new int [tc];
        for (int i = 0; i < tc; i++) {
            kuota[i] = sc.nextInt();
        }
        for (int i = 0; i < tc; i++) {
            int tmp = x - kuota[i];
            jadi = jadi + tmp;
        }
        jadi = jadi + x;
        System.out.println(jadi);
    }
}