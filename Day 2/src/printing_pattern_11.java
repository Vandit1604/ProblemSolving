import java.util.Scanner;

public class printing_pattern_11 {
    public static void main(String[] args) {
        // this code is user flexible;
//        Scanner input = new Scanner(System.in);
//        int row = input.nextInt();
         int row=5;
        int count;
        for(int i=1;i<=row;i++){
            count=0;
            for(int j=1;j<=i;j++){
                System.out.print(j);
                count++;
            }
            // spaces printing
            for(int j=1;j<=2*(row-i)-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(count-j);
            }
            System.out.println();
        }
    }
}
