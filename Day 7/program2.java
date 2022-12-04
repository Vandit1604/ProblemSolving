import java.util.Scanner;

public class program2 {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the name");
        String name= input.nextLine();
        int count=0;
        // counting the length of string
        for(char c: name.toCharArray()){
            count++;
        }
        for(int i=count-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
