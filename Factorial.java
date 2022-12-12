public class Factorial {
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil = rekursif(4);
        System.out.print(hasil);
    }

    public static Integer rekursif(int n){
        if (n == 0) return 1;
        return n * rekursif(n-1);
    }
}
