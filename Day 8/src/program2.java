import java.util.Scanner;

public class program2 {
    public static void printletter(int ans){
        Scanner input1=new Scanner(System.in);
        String ansStr=Integer.toString(ans);
        int anslength= ansStr.length();
        System.out.println("Enter the value of the K");
        int k=input1.nextInt();
        if(k<=anslength){
        System.out.println(ansStr);
        System.out.println("value at "+k+" position is "+ansStr.charAt(anslength-k));
      }
        else {
            System.out.println("entered value of k is greater than the no. of digit of the ans.");
        }
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number.");
        int numA=input.nextInt();
        System.out.println("Enter the power value");
        int numB=input.nextInt();
        int ans=1;
        for(int i=0;i<numB;i++){
           ans=ans*numA;
        }
        printletter(ans);
    }
}
