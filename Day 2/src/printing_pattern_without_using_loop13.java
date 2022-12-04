import java.util.Scanner;

public class printing_pattern_without_using_loop13 {
      // recursive code;
    // this function print half of output
    public static int printpattern(int N){
        if(N<=0){
            System.out.println(N);
            return N;
        }
        System.out.println(N);
        int j= printpattern(N-5);
        return j; // not sure about this return statement; what it does????;just butterflycode
    }
    // this function print rest half of output;
    public static void printpatter1(int n,int N){
        if(n==N){
            return;
        }
        System.out.println(n+5);
        printpatter1(n+5,N);

    }
         // main function;
    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter the value: ");
//        int N=input.nextInt();
        int N=16;
        int n = printpattern(N);
       // System.out.print(n+"ye vala");
        printpatter1(n,N);
    }
}
