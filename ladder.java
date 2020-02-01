import java.util.Scanner;

public class cb {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int panjang,sudut;
        double hasil;
        String in = scan.nextLine();
        String split [] = in.split(" ");
        panjang = Integer.parseInt(split[0]);
        double sin = Math.sin(Math.toRadians(Double.parseDouble(split[1])));
        hasil = panjang / sin;
        int jadi = (int)Math.ceil(hasil);
        System.out.println(jadi);
    }
}