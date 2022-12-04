import java.util.Scanner;

public class loop_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=1;
        int n = input.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a++         +" ");
            }
            System.out.println();
        }
    }
}
