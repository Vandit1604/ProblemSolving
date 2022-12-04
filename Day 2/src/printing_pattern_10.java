import java.util.Scanner;

public class printing_pattern_10 {
    public static void main(String[] args) {
        // this code is user flexible;
//        Scanner input = new Scanner(System.in);
//        int row = input.nextInt();
        int row = 3;
        for(int i=row;i>=1;i--){

            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=row;i++){

            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
