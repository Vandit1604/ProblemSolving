import java.util.Scanner;

public class printng_patter_6_usingLoop {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the odd no for the pattern:");
//        int n= input.nextInt();

        int n=7;
        int c=(n-1)/2-3;
        int revtraversing_val=0;
        int d=0;
        // printing desire pattern code of complexity O(n^2+n+n);
        for(int i=0;i<4+c;i++){
            for(int j=0;j<=(n-1)/2;j++){
                if(j<(n-1)/2-d){
                    System.out.print(" ");
                }
            }
            for(int j=0;j<1+d;j++){
                revtraversing_val =1+j+d;
                System.out.print(revtraversing_val);
            }
            for(int j=0;j<d;j++){
                System.out.print(revtraversing_val-1);
                revtraversing_val--;
            }
            d++;
            System.out.println();
        }
    }
}
