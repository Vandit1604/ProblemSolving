import java.util.Scanner;

public class a_to_the_power_b_using_divide_and_conqure {
    public static int powerOfNum(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){

            return powerOfNum(x,n/2)*powerOfNum(x,n/2);
        }
        else{
            return powerOfNum(x,(n-1)/2)*powerOfNum(x,(n-1)/2)*x;
        }

    }
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the power of the number.");
        int pow=input.nextInt();
        System.out.println("Enter the number ");
        int num= input.nextInt();
        System.out.println("Ans is :"+powerOfNum(num,pow));
    }
}
