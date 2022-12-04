import java.util.Scanner;

public class printing_prime_number_between_given_range {
    public static boolean primeNumber(int n){
        int count=0;
       for(int i=1;i<=n;i++){
           if(n%i==0){
               count++;
           }
       }
       if(count==2){
           return true;
       }
       else{
           return false;
       }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the range [x , y]");
        System.out.println("Enter the starting range x :");
        int x= input.nextInt();
        System.out.println("Enter the ending range y :");
        int y= input.nextInt();
        for(int i=x;i<=y;i++){
            if(primeNumber(i)==true){
                System.out.println(i+" is a prime number.");
            }
        }
    }
}
