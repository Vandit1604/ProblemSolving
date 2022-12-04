import java.util.Scanner;

public class armstrong_number_using_function_recursion {
    public static boolean armstrongNum(int n){
        int ans=0;
        int m=n;
        int mul;
        int length = String.valueOf(m).length(); // learn session.
        while(n!=0){
            int a=n%10;
            mul=1;
            for(int i=1;i<=length;i++){
               mul= mul*a;
            }
            ans=ans+mul;
            n=n/10;
        }
        if(ans==m) {
            return true;
        }
        else{
            return false;
        }
    }
    // main calling function
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting value of the range:");
        int x= input.nextInt();
        System.out.println("Enter the ending value of the range: ");
        int y= input.nextInt();
        for(int i=x;i<=y;i++){
            if(armstrongNum(i)==true){
                System.out.println(i+" is armstrong number.");
            }
        }

    }
}
