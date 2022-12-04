import java.util.Scanner;

public class printing_pattern_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int N= input.nextInt();
//        int N=4;
        // row
        for(int i=1;i<=N;i++){
            //
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //
            for(int j=i-1;j>0;j-- ){
                System.out.print(j);
            }
            System.out.print(" ");
        }
    }
}
