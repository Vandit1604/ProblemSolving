import java.util.Scanner;

public class printing_pattern_14 {
    public static void main(String[] args) {
        // this code is a user flexible;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the value: ");
//        int row = input.nextInt();
        int row=5 ;
        for(int i=1;i<=row;i++) {

            // printing first line;
            for (int j = 1; j <= row; j++) {
                if (i == 1) {
                    System.out.print("*");
                }
                if(i==1&&j==row){
                    System.out.println();
                }
            }

            // printing spaces and stars;
            for(int j=1;j<=row-i;j++){
                if((i<row && i>=1) && j<row-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            if(i<row-1) {
                System.out.println();
            }
        }

        // printing last line pattern;
        for(int i=1;i<=row-1;i++){
            System.out.print("*");
        }
    }
}
