import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        
        if (a < b && a < c) {
            System.out.println(a);
            System.out.println(b < c ? b : c);
            System.out.println(b < c ? c : b);
        }
        
        else if (b < a && b < c) {
            System.out.println(b);
            System.out.println(a < c ? a : c);
            System.out.println(a < c ? c : a);
        }
        
        else {
            System.out.println(c);
            System.out.println(a < b ? a : b);
            System.out.println(a < b ? b : a);
        }
        sc.close();
    }
}
