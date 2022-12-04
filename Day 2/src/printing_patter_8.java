import java.util.Scanner;

public class printing_patter_8 {
    public static void main(String[] args) {
        // this code is user flexible;
//        Scanner input = new Scanner(System.in);
//        int n= input.nextInt();
        int n=5;
        for(int i=0;i<n;i++){
            // printing space;
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            // printing half stars;
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
           //  printing another half stars;
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
