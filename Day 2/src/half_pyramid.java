package printing_halfPyramid;

import java.util.Scanner;

public class half_pyramid {
    public static void main(String[] args){
        // printing half pyramid
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
