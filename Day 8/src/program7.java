import java.util.Scanner;

public class program7 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("total factor of the given no are:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        System.out.println("only prime factor are");

        for(int i=1;i<=n;i++){
            int counter=0;
            if(n%i==0){
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        counter++;
                    }
                }
            }
            if(counter==2){
                System.out.println(i);
            }
        }
    }

}
