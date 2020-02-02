import java.util.Scanner;

public class cb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String aa = scan.nextLine();
        String split [] = aa.split(" ");
        int count = 0;
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split.length; j++) {
                if (i != j) {
                    if (split [i].equals(split[j])) {
                        count++;
                    }
                }
                else{
                    count = count;
                }
            }
        }
        if (count > 1) {
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}