import java.util.Scanner;

public class Program {

    public static int GetScale(int MaxCount ,int Count){

     int Scale; return Scale = Count/MaxCount * 10;

    }

    public static String ScannData(String Data, int[] Frequency, int size){
        for (int i = 0; i < size; i++)
            if (Frequency[i] > 0)
                Data = Data + (char)i;
        return Data;
    }

    public static int[] DataCount(String Data, int[] Frequency){

        int i = 0;
        int[] Frequencynew = new int[Data.length()];
        for (char c : Data.toCharArray()) {Frequencynew[i] = Frequency[c]; i++;}
        return Frequencynew;
    }

    public static int[] StringIndexing(String Input,int[] Frequency){

        for (char c : Input.toCharArray())
            Frequency[c]++;
        return Frequency;
    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int size = 65535;
        int[] Frequency = new int[size];
        String Input;
        String Data = "";

        System.out.print("-> ");
        Input = Sc.nextLine();

        Frequency = StringIndexing(Input, Frequency);
        Data = ScannData(Data, Frequency, size);
        System.out.println("STRING : " + Data);
        Frequency = DataCount(Data, Frequency);
        for (int i = 0; i < Data.length(); i++)
            System.out.println(Frequency[i]);

    }
}