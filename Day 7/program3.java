import java.util.Scanner;

public class program3 {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the name");
        String name=input.nextLine();
        int count=0;
        int detector=0;
        for(char c: name.toCharArray()){
            count++;
        }
        for(int i=0;i<count/2;i++){
            if((int)name.charAt(i)==(int)name.charAt(count-1-i)){
                detector++;
            }
        }
        if(detector==(count/2)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
