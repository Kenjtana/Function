package fundamental.java.function;

public class InputFunction {
    public static void main(String[] args) {
        System.out.print("Keliling segitiga dengan alas dan tinggi berikut adalah: ");
        kelilingSegitiga(5, 7.8); // masukan nilai dari alas dan tinggi
    }

    public static void kelilingSegitiga(double alas, double tinggi){
        double luas;
        luas = 0.5 * alas * tinggi;
        System.out.println(luas);
    }
}
