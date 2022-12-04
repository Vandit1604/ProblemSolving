package printing_hollow;

import java.util.Scanner;

public class printing_hollow_rectangle {
    public static void main(String[] args){
        // printing hollow rectangle;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows value");
        int rows = sc.nextInt();
        System.out.println("Enter the columns value");
        int columns = sc.nextInt();
        // using loops


            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    if (i ==  1 || i == rows || j == 1 || j == columns) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }



    }
}
