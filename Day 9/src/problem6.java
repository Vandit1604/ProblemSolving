import java.util.Scanner;

public class problem6 {
    public static void selfDividingnum(int num){
        String strnum= Integer.toString(num);
        int len=strnum.length();
        int count=0;
        for(int i=0;i<len;i++) {
            int n = (int) strnum.charAt(i);// this code give ascii value.
            for(int j=1;j<=9;j++){
                String m=Integer.toString(j);
                if((int)m.charAt(0)==n){
                    if(num%j==0){
                        count++;
                    }
                }

            }

        }
        if(len==count){
            System.out.println("self divided num");
        }
        else{
            System.out.println("not self divided num");
        }
    }
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        selfDividingnum(num);

    }
}
