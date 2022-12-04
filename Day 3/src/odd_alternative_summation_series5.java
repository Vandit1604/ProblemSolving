import java.util.Scanner;

public class odd_alternative_summation_series5 {

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
             float ans =0;
            for(int i=1;i<=n;i++) {
                int j= 2*i-1;
                int a = factorial(j);
                if (i % 2 == 0) {
                    ans = ans - x*((float) j) / a;
                }
                else{
                    ans = ans+ x*((float) j)/a;
                }
            }
            System.out.println(ans);
        }
    }

