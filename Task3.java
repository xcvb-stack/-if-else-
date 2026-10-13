import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = n % 100;
        int y = n % 10;

        if (x >= 11 && x <= 14) {
            System.out.println(n + " TORTOV");
        } else if (y == 1) {
            System.out.println(n + " TORT");
        } else if (y >= 2 && y <= 4) {
            System.out.println(n + " TORTA");
        } else {
            System.out.println(n + " TORTOV");
        }
        sc.close();
    }
}
