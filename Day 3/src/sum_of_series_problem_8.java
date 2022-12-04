import java.util.Scanner;

public class sum_of_series_problem_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range(no. of terms): ");
        int n= input.nextInt();
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans =ans + i*(i+1)*(i+2);
        }
        System.out.println(ans);
    }
}
