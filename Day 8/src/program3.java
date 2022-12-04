import java.util.Scanner;

public class program3 {
    public static void printInfo(int num){

        int ans=num;
        int m=1;
        if(num!=0) {
            while (m > 0) {
                int counter = 0;
                int ans1 = 0;
                while (ans > 0) {
                    ans1 = ans1 + (ans % 10);
                    ans = ans / 10;
                    counter++;
                }
                ans = ans1;
                if (counter == 1) {
                    System.out.println(ans1);
                    m = 0;
                    break;
                }
            }
        }
        else{
            System.out.println("value already is 0");
        }
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        printInfo(num);
    }
}