import java.util.Scanner;

public class printing_pattern_9 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int row = input.nextInt();
        // this code is user flexible;
        int row = 4;
        // row
        for(int i=1;i<=row;i++){
            // column
               // printing space
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
             // printing stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
           // reverse row
         for(int i=row-1;i>=1;i--){
             // reverse column
                // printing reverse space
             for(int j=0;j<row-i;j++){
                 System.out.print(" ");
             }
                // printing reverse stars
             for(int j=1;j<=2*i-1;j++){
                 System.out.print("*");
             }
             System.out.println();
         }


    }
}
