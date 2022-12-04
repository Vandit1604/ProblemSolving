import java.util.Scanner;

public class program_1 {
    public static void main(String[] args){
        // no inbuilt function use by the user
        //int i=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the string name");
        String name=input.nextLine();
        int count =0;
        for(char c: name.toCharArray()){
            count++;
        }
        System.out.println(count);

    }
}
