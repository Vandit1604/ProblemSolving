import java.util.Scanner;

public class LCM_of_any_two_number {
    public static int LCMOfNum(int m,int n){
        int ans=0;
        if(m>n){
            for(int i=1;i<=m;i++){
                if(m%i==0 && n%i==0){
                    ans=i;
                }
            }
        }
        else{
            for(int i=1;i<=n;i++){
                if(m%i==0 && n%i==0){
                    ans=i;
                }
            }
        }
        int ans1= (m*n)/ans;
        return ans1;
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int m= input.nextInt();
        System.out.println("Enter the second value:");
        int n= input.nextInt();
        System.out.println("LCM of given number is " +LCMOfNum(m,n));
    }
}
