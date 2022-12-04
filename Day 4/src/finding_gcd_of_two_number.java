import java.util.Scanner;

public class finding_gcd_of_two_number {
    public static int gcdOfTwoNumber(int m,int n){
        int ans=1;
        if(m>n){
            for(int i=1;i<=m;i++){
                if(m%i==0 && n%i==0){
                    ans=i;
                }
            }
        }
        else{
            for(int i=1;i<n;i++){
                if(n%i==0 && m%i==0){
                    ans=i;
                }
            }
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int m= input.nextInt();
        System.out.println("Enter the secong value:");
        int n= input.nextInt();
        System.out.println(gcdOfTwoNumber(m,n));
    }
}
