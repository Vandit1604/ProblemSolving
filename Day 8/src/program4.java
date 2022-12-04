import java.util.Scanner;

public class program4 {
    public static void printInfo(int num){
        int n= String.valueOf(num).length();
        int limit= n/2;
        int divident=1;
        for(int i=0;i<=limit;i++){
            divident=divident*10;
        }
        int num1=num;
        num1=num1/divident;
      //  System.out.println(num1+" printing num1");
        int x1=0,x2=0;
        for(int i=0;i<limit;i++){
           // int a=num%10;
             x1=x1+num%10;
             num=num/10;
             //int b= num1%10;
             x2=x2+num1%10;
             num1=num1/10;

        }
      //  System.out.println("printing "+x2+" "+x1);
        if(x1==x2){
            System.out.println("balance number");
        }
        else{
            System.out.println("not balance number");
        }
    }
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        int num = input.nextInt();
        printInfo(num);
    }
}
