public class UcgenHesap {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        double s = (a + b + c) / 2;
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Kenarlar: " + a + ", " + b + ", " + c);
        System.out.println("Alan: " + alan);
    }
}
