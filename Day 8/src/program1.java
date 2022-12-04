import java.util.Scanner;

public class program1 {
    public static void quardratic(int numA,int numB,int numC){
        int b_square=numB*numB;
        int fourAc= 4*numA*numC;
        int posD=fourAc-b_square;
        if((b_square-fourAc)>=0){
            double D=Math.sqrt(b_square-fourAc);
            double x1= (-(numB)+D)/(2*numA);
            double x2=(-(numB)-D)/(2*numA);
            System.out.println("x1 first root value is "+x1);
            System.out.println("x2 second root value is "+x2);

        }
        else{
            double d1=Math.sqrt(posD);
            double realpart= (-(numB))/(2*numA);
            double imaginary=d1/(2*numA);
            System.out.println(realpart+"+/-"+imaginary+"i");
        }
    }
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the value a of (ax^2+bx+c=0)");
        int numA=input.nextInt();
        System.out.println("Enter the value b of (ax^2+bx+c=0)");
        int numB=input.nextInt();
        System.out.println("Enter the value c of (ax^2+bx+c=0)");
        int numC=input.nextInt();
        quardratic(numA,numB,numC);
    }
}
