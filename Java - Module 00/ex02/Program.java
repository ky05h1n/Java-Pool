import java.util.Scanner;

public class Program{

    public static int Sum (int num){

        int sum = 0;

        while (num != 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean Prime (int num) {

        int i;
        if (num < 2) return false;
        for (i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Count(int num){

        System.out.println("Count of coffee-request : " + num);
        System.exit(0);
    }

    public static void main(String[] args){


        int num = 0;
        int cnt = 0;
        Scanner scn = new Scanner(System.in);

        while (true){

            System.out.print("-> ");
            num = scn.nextInt();
            if (num == 42)
                Count(cnt);
            num = Sum(num);
            if (Prime(num))
                cnt += 1;
        }
    }
}

