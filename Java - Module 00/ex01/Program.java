import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Scanner snc = new Scanner(System.in);
        int num = 0;
        int i;

        System.out.print("-> ");
        num = snc.nextInt();
        if (num < 2) {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }
        for (i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("flase " + (i - 1));
                System.exit(0);
            }
        }
        System.out.println("true " + (i - 1));
    }
}