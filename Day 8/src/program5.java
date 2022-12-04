import java.util.Scanner;

public class program5 {
    public static void primeNo(int num){
        int count=0;
        System.out.println("factor are:");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }

    }
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        int N=input.nextInt();
        primeNo(N);
    }
}
