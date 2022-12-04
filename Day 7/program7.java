import java.util.Scanner;
// concatination
public class program7 {
    public static void main(String[]args){
        Scanner input =new Scanner (System.in);
        System.out.println("Enter the first string");
        String str1=input.nextLine();
        System.out.println("Enter the second string");
        String str2=input.nextLine();
        int count=0;
        int count1=0;
        for(char c:str1.toCharArray()){
            count++;
        }
        for(char c:str2.toCharArray()){
            count1++;
        }
        for(int i=0;i<count;i++){
            System.out.print(str1.charAt(i));
        }
        System.out.print(" ");
        for(int i=0;i<count1;i++){
            System.out.print(str2.charAt(i));
        }

    }
}
