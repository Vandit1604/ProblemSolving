import java.util.Scanner;

public class day2_printing_pattern_12 {
    public static void main(String[] args) {
           // this code is user flexible;
//        Scanner input = new Scanner(System.in);
//        int row= input.nextInt();
        int row=6;
        int d=0;
        // border code
        for(int i=1;i<=2*row-1;i++){ // cod//(code for decoration);
            System.out.print("-");
        }
        System.out.println();

        // row
        for(int i=1;i<=row;i++){
            // column
              // printing numbers
            for(int j=1;j<=row-i+1;j++){
                if(j<row) {
                    System.out.print(j);
                }
            }
              // printing spaces
            for(int j=1;j<=2*i-3;j++){
                System.out.print(" ");
            }
              // next printing number
            for(int j=0;j<row-i+1;j++){
              //  if(row-j!=0) {
                    System.out.print(row - j-d);
               // }
            }
            d++;
            System.out.println();
        }

    }
}
