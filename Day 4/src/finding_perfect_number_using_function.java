import java.util.Scanner;

public class finding_perfect_number_using_function {
    public static boolean perfectNumber(int n){
        int ans=0;
       for(int i=1;i<n;i++){
           if(n%i==0){
               ans=ans+i;
           }
       }
       if(ans==n){
           return true;
       }
       else{
           return false;
       }


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range(1 to n) :");
        int n= input.nextInt();
        for(int i=1;i<=n;i++) {
            if (perfectNumber(i) == true) {
                System.out.println(i + " is a perfect number.");
            }
        }

    }
}
