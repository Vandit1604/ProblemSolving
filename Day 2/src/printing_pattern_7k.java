import java.util.Scanner;

public class printing_pattern_7k {
    public static void main(String[] args) {
        // this code is user flexible
//        Scanner input = new Scanner(System.in);
//        int n= input.nextInt();
        int n=4;
        int d=0;
        int helpingVal=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-1-d;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                helpingVal=i-j;
                System.out.print(i-j);

            }
            for(int j=0;j<d;j++){
                System.out.print(helpingVal+1+j);
            }
            d++;
            System.out.println("");
        }
    }
}
