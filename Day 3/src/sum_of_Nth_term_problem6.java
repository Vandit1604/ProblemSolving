import java.util.Scanner;

public class sum_of_Nth_term_problem6 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int alpha= n * factorial(n-1);
        return alpha;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range(no. of terms):");
        int n= input.nextInt();
        System.out.println("Enter the value of X: ");
        int x= input.nextInt();
        int x_value=1;
        float ans=0;
        int check=0;
        // for x square of x value
       for(int i=1;i<=n-1;i++){
           int m= 2*i;
           // for increasing the power of the x;
           for(int j=1;j<=m;j++){
               x_value=x_value*x;
           }
           if(i%2==0) {
               ans = ans + ((float) x_value / factorial(m));

           }
           else {
               ans = ans -((float) x_value/factorial(m));

           }

       }
        System.out.println(ans+1);

    }
}
