import java.util.Scanner;

public class problem7 {
        public static boolean divisorGame(int n) {
            int x=1;
            int ali=0;
            int bob=0;
            while(n!=1){

                if(0<x && x<n){
                    ali=1;
                    bob=0;
                    n--;
                }
                if(0<x && x<n){
                    bob=1;
                    ali=0;
                    n--;
                }
            }
            if(ali==1){
                return true;
            }
            else{
                return false;
            }
        }
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            int n= input.nextInt();

            if(divisorGame(n)==true){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }

}
