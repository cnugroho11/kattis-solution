import java.util.Scanner;

public class cb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aa = in.nextInt();
        String biner,balik="";
        biner = Integer.toBinaryString(aa);
        int lenght = biner.length();
        for (int i = lenght - 1; i >= 0; i--) {
            balik = balik + biner.charAt(i);
        }
        int decimal = Integer.parseInt(balik, 2);
        System.out.println(decimal);
    }

}