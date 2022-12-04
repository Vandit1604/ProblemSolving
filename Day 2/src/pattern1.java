import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        int c=0;
        Scanner input = new Scanner(System.in);
        //int n= input.nextInt();
        int n=7;
        // output pattern;(only capable for the odd input);
        for(int i=1;i<=n;i++){  // complexity O(n*n);
            for(int j=0;j<i;j++){
                c=j;
                System.out.print(j+i);
                }
            if(c+i==n){
                break;
            }
            System.out.println();
        }
    }
}
