import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        

        if ( a == 0) {
           
            if (b > 0) {
                System.out.println("any x");
            } else {
                System.out.println("no such x");
            }
        } else if (a > 0) {
        
            double t = -b / a;
            if (t < 0) {
                
                System.out.println("any x");
            } else {
               
                System.out.printf("x<%.1f or x>%.1f%n", -t, t);
            }
        } else {
            
            double t = -b / a;
            
            if (t <= 0) {
               
                System.out.println("no such x");
            } else {
                
                System.out.printf("%.1f<x<%.1f%n", -t, t);
            }
        }
        sc.close();
    }
}
