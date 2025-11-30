import java.util.Scanner;

public class Program {


    public static long GetData(long  num) {

        long sum = 0;
        long hold = 0;

        while (num != 0) {
            sum = num % 10;
            num /= 10;
            hold = hold * 10 + sum;
        }
        return hold;
    }

    public static void ErrorMessage() {
        System.out.println("llegalArgument");
        System.exit(-1);
    }

    public static long StoreData() {
        Scanner Sc = new Scanner(System.in);

        System.out.print("-> ");
        String scoresLine = Sc.nextLine();
        Scanner lineScanner = new Scanner(scoresLine);

        int count = 0;
        long hold = 0L;

        while (lineScanner.hasNextInt()) {

            int Data = lineScanner.nextInt();
            if (Data == 42 && count == 0) return Data;
            if (Data < 1 || Data > 9) ErrorMessage();
            if (hold == 0 || Data < hold) hold = Data;
            count++;
        }

        if (count != 5) ErrorMessage();
        return hold;
    }

    public static void PrintData(long Data,int Weeks){

        Data = GetData(Data);
        long  Grade = 0;

        for (int i = 0; i < Weeks; i++) {

            Grade = Data % 10;
            System.out.print("Week " + (i + 1)+ " ");
            for (int n = 0; n < Grade; n++)
                System.out.print("=");
            System.out.println(">");
            Data /= 10;
        }
        System.exit(0);
    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        int WeeksTracker = 0;
        int Week = 0;
        long Data = 0L;
        long sig = 0L;
        String Wk = "";

        while (true ) {
            System.out.print("-> ");
            Wk = Sc.next();

            if (Wk.equals("42")) PrintData(Data, WeeksTracker);
            if (!Wk.equals("Week")) ErrorMessage();
            Week = Sc.nextInt();
            WeeksTracker += 1;
            if (Week != WeeksTracker) ErrorMessage();
            sig = sig * 10 + StoreData();
            if (sig != 42)
                Data = sig;
            if (Data == 42) PrintData(Data, WeeksTracker);
            System.out.println("-> " + Data);
        }
    }
}