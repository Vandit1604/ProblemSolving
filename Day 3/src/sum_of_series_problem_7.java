import java.util.Scanner;

public class sum_of_series_problem_7 {
    // factorial function
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
        System.out.println("Enter the range(no. of terms) :");
        int n=input.nextInt();
        float ans =0;
        for(int i=1;i<=n;i++){
            int m=2*i-1;
            if(i%2==0){
                ans =ans - (float)i/factorial(m);
            }
            else{
                ans = ans +(float) i/factorial(m);
            }
        }
        System.out.println(ans);
    }
}
