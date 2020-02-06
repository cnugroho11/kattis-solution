import java.util.Scanner;

public class cb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        int[] ank = new int [3];
        String[] jadi = new String [tc];
        for (int i = 0; i < tc; i++) {
            String aa = sc.nextLine();
            String[] split = aa.split(" ");
            ank[0] = Integer.parseInt(split[0]);
            ank[1] = Integer.parseInt(split[1]);
            ank[2] = Integer.parseInt(split[2]);
            if (ank[0] > ank[1] - ank[2]) {
                jadi[i] = "do not advertise";
            }
            if (ank[0] < ank[1] - ank[2]) {
                jadi[i] = "advertise";
            }
            if (ank[0] == ank[1] - ank[2]) {
                jadi[i] = "does not matter";
            }
        }
        for (int i = 0; i < tc; i++) {
            System.out.println(jadi[i]);
        }
    }
}