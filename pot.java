import java.util.Scanner;

public class cb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        String[] inpt = new String [tc]; 
        int[] angka = new int [tc]; 
        int[] pangkat = new int [tc]; 
        int[] hasil = new int [tc]; 
        int sum = 0;
        for (int i = 0; i < tc; i++) {
            inpt [i] = sc.next();
            angka[i] = Integer.parseInt(inpt[i].substring(0, inpt[i].length()-1));
            pangkat [i] = Integer.parseInt(inpt[i].substring(inpt[i].length()-1));
        }
        for (int i = 0; i < tc; i++) {
            hasil [i] = (int) Math.pow(angka[i], pangkat[i]);
            sum = sum + hasil[i];
        }
        System.out.println(sum);
    }
}