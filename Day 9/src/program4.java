import java.util.Scanner;

public class program4 {
    public static void handshakes(int n){
        if(n==1){
            System.out.println("no handshakes");
        }
        else{
            int m=n*(n-1)/2;
            System.out.println("total handshakes are:"+m);
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of participants");
        int n= input.nextInt();
        handshakes(n);
    }
}
