import java.util.Scanner;

public class program6 {
    public static int compare(String str1,String str2){
     return str1.compareTo(str2);
    }
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1=input.nextLine();
        System.out.println("Enter the second String");
        String str2=input.nextLine();
       int n= compare(str1,str2);
       if(n>0){
           System.out.println(str1+" is greater with "+str2);
       }
       else if (n<0) {
           System.out.println(str2+" is greater with "+str1);
       }
       else{
           System.out.println("both string is equal");
       }
    }
}
