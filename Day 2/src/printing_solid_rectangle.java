package printing_pattern;

import java.util.Scanner;

public class printing_solid_rectangle {
    public static void main(String[] args){
        // code for printing rectangle as pattern
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        int columns= sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
