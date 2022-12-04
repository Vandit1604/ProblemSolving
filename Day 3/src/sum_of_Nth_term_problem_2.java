import java.util.Scanner;

public class sum_of_Nth_term_problem_2 {
    // sum of series function
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
        int ans =0;
        for(int i=1;i<=n;i++) {
           int a= factorial(i);
           ans =ans+a/i;
        }
        System.out.println(ans);
    }
}
