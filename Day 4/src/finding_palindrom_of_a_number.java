import java.util.Scanner;

public class finding_palindrom_of_a_number {
    public static void palindrom(int n){
        int rev=0;
        int real_val=n;
        while(n!=0){
            int a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        if(rev==real_val){
            System.out.println(rev+" is palindrom.");
        }
        else{
            System.out.println(real_val+" is not a palindrom.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= input.nextInt();
        palindrom(n);
    }
}
