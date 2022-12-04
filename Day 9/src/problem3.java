import java.util.Scanner;

public class problem3 {
    public static void searchin(int n){
        if(n==0){
            System.out.println("no shock is available");
        }
        else if (n==1){
            System.out.println("both sock is in pair");
        }
        else{
            int m=n*2;
            System.out.println("total no sock is "+m);
            System.out.println("minimum no of sock is drawn to find pair is: "+((m/2)+1));
        }
    }
    public static void main(String []args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no of color.");
        int n=input.nextInt();
        searchin(n);
    }
}
