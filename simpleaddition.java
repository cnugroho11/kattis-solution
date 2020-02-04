import java.math.BigInteger;
import java.util.Scanner;


public class cb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger aa = in.nextBigInteger();
        BigInteger bb = in.nextBigInteger();
        BigInteger cc = aa.add(bb);
        System.out.println(cc);
    }
}