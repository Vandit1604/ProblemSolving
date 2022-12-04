import java.util.Scanner;

public class printing_pattern_16 {
    public static void main(String[] args) {
        // this code is user flexible;
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter the value: ");
//        int N= input.nextInt();
        int N=3;
        int d=2*N-1;
        int a=0;
        int ans[][]=new int[d][d];
         // input the pattern into a 2D array;
        while(N!=0){
            for(int i=a;i<2*N-1+a;i++){
                for(int j=a;j<2*N-1+a;j++){
                    if(i==a||j==a || i==d-1-a || j==d-1-a) {
                        ans[i][j] = N;
                    }
                }
            }
            N--;
            a++;
        }

        // output
        for(int i=0;i<d;i++){
            for(int j=0;j<d;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
