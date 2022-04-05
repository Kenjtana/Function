package fundamental.java.function;
import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukan lebar: ");
        int l = input.nextInt();
        System.out.print("Luas persegi panjang adalah: ");
        System.out.println(rectangular(p, l));

        System.out.println("Dan kelilingnya adalah: ");
        System.out.println(keliling(18.7, 11.5));

    }

    public static int rectangular(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }

    public static double keliling(double panjang, double lebar){
        double keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
