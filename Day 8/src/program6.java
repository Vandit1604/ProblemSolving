import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        System.out.println("maximum rectangle enclose with circle is square and its value is :");
        double ans = radius * Math.sqrt(2);
        System.out.println(ans);
    }
}