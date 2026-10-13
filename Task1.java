import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        if(x  <=9 && x >= 0) {
            System.out.println("DIGIT");
        }
        else if ( x >= 10 && x <= 99) {
            System.out.println("NUM");


        }
        else {
            System.out.println("OTHER");
        }
        sc.close();
    }
}
