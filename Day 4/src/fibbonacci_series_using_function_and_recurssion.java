import java.util.Scanner;

public class fibbonacci_series_using_function_and_recurssion {
    public static int fibbonaciValue(int m,int x,int y,int ans1){
        int c;
        if(m==0){
           return ans1;
        }
        c=x+y;
        ans1=ans1+c;
        fibbonaciValue(m-1,y,c,ans1);
        return ans1;
    }
     public static void main(String [] args){
         Scanner input= new Scanner(System.in);
         System.out.println("Enter the value.");
         int n=input.nextInt();
         int a=0;
         int b=1;
         int ans=0;
         System.out.println("Ans is : "+fibbonaciValue(n-2,a,b,ans));
     }
}
