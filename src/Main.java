import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("s = ");double s = scan.nextDouble();
        System.out.print("t = ");double t = scan.nextDouble();

        double c = (Math.pow(h(s, t), 4) + h(1, s * s + t * t)) + Math.pow(h(s * t, 1), 2);
        System.out.println("c = " + c);

        System.out.println(h(1,3));
    }
    public static double h(double a, double b){
        return (a / (b*b + 1)) + 1 / (a*a + b*b);
    }
}