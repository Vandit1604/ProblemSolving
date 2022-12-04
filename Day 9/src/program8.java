import java.math.BigInteger;
import java.util.Scanner;

public class program8 {
        public static int trailingZeroes(int n) {
            // factorial
            int count=0;
            int ans=1;

            if(n==0){
                return 0;
            }
            else{
               for(int i=1;i<=n;i++){
                    ans=ans*i;
                    if(ans%10==0){
                        count++;
                        ans=ans/10;
                    }
                }


            }
            return count;
        }
        public static void main(String[]args){
            Scanner input =new Scanner(System.in);
            int n= input.nextInt();
            System.out.println(trailingZeroes(n));
        }

}
