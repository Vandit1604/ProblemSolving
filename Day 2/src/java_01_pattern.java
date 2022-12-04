import java.util.Scanner;

public class java_01_pattern {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        for(int i =1;i<=n;i++){
            int a=i;
            for(int j=1;j<=i;j++){
                if(a%2==0){
                    System.out.print("0");

                }
                else{
                    System.out.print("1");
                }
                a--;
            }
            System.out.println("");
        }
    }
}
