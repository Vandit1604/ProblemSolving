import java.util.Scanner;

public class Sum_of_Nth_term_with_variable_X_problem3 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int alpha = n*factorial(n-1);
        return alpha;
    }
    // main calling function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms(range): ");
        int n= input.nextInt();
        System.out.println("Enter the value of X : ");
        int x=input.nextInt();
        int ans =0;
        for(int i=1;i<=n-1;i++) {
                     int a = x * factorial(i);
                     ans = ans + a / i;
        }
        System.out.println(ans+1);
    }
}
