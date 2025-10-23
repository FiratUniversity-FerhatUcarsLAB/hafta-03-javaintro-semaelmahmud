public class Faktoriyel {
    public static void main(String[] args) {
        int sayi = 5;
        int sonuc = 1;
        System.out.print("5! = ");
        for (int i = sayi; i >= 1; i--) {
            sonuc *= i;
            System.out.print(i);
            if (i > 1) System.out.print(" × ");
        }
        System.out.println(" = " + sonuc);
    }
}
