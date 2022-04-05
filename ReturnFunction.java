package fundamental.java.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 17, l = 9;
        double hasil = hitungLuas(p, l); // memanggil fungsi
        System.out.println("Luas persegi panjang adalah: "+hasil);

    }
//    fungsi dengan Return
    public static double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }
}
