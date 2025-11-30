import java.util.Scanner;

public class Program {


    public static int length(char length[]){

        int i ;
        for (i = 0 ; length[i] != '\0'; i++){}
        return i;

    }

    public static int Sum(int num) {

        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean WeeksChecker(String Week) {

//        System.out.println('"' + Week +'"');
        if (Week.equals("Week")) return true;
        else return false;
    }

    public static void ErrorMessage() {
        System.out.println("llegalArgument");
        System.exit(-1);
    }

//    public static int GetNumber(String number){
//
//        int n = 0;
//
//        for (int i = 0 ; i < number.length(); i++){
//          n  = n * 10 + (number.charAt(i) - '0');
//        }
//        return n;
//    }

    public static long StoreData(long Data){

        Scanner Sc = new Scanner(System.in);
        long hold = 0L;

        System.out.print("-> ");
        for (int i = 0 ; i < 5 ; i++)
        {
            Data = Sc.nextInt();
            if (Data < 1 || Data > 9)
                ErrorMessage();
            if (hold == 0 || Data < hold) hold = Data;
            System.out.println(i);
        }
        return hold;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int WeeksTracker = 0;
        int Week = 0;
        long Data = 0L;

        while (true) {
            System.out.print("-> ");
            String Wk = Sc.next();

            if (!(WeeksChecker(Wk))) ErrorMessage();
            Week = Sc.nextInt();
            WeeksTracker += 1;
            if (Week != WeeksTracker || Week < 1 && Week > 18) ErrorMessage();

//            System.out.println(Wk + Week);
            Data = Data * 10 + StoreData(Data);
            System.out.println("-> " + Data);
        }
    }
}