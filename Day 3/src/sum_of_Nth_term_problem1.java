import java.util.Scanner;

public class sum_of_Nth_term_problem1 {
    // factorial function
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int alpha= n*factorial(n-1);//this problem is also solve using only loop.
        return alpha;
    }
    // main calling function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n=input.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++) {
            ans = ans + factorial(i);
        }
        System.out.println(ans);
    }
}
