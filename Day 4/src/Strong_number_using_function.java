import java.util.Scanner;

public class Strong_number_using_function {
    public static int factorial(int n){
        int ans =0;
        int mul;
        while(n!=0){
            mul=1;
            int a= n%10;
            for(int i=1;i<=a;i++){
                mul=mul*i;
            }
            ans=ans+mul;
            n=n/10;
        }
        return ans;

    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= input.nextInt();
        for(int i=1;i<=n;i++){
            if(factorial(i)==i){
                System.out.println(i+" is strong number.");
            }
        }
    }
}
