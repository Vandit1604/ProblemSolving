import java.util.Scanner;

public class program5 {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the letter.");
        char letter=input.next().charAt(0);
        if((int)letter>=65 && (int)letter<=90){// capital letter in ascii from 65 to 90
            int n=(int)letter+32;
            char smallcase=(char)n;
            System.out.println("lowercase: "+smallcase);
        }
        else{
            int n=(int)letter-32;
            char uppercase=(char)n;
            System.out.println("uppercase: "+uppercase);
        }
    }
}
