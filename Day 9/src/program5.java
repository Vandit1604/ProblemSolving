import java.util.Scanner;

public class program5 {
    public static void countSteps(int n){
        int count=0;
        while (n!=0) {
            if (n % 2 == 0) {
                   n=n/2;
                   count++;
            }
            else {
                n=n-1;
                count++;
            }
        }
        System.out.println("Steps are:"+count);
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        countSteps(n);
    }
}
