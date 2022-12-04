import java.util.Scanner;

public class problem9 {
    // suffix of the word
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word for the suffix");
        String name =input.nextLine();
        int count=0;
        for( char c: name.toCharArray()){
            count++;
        }
        for(int j=0;j<count;j++) {
            for (int i = count-j-1; i<count; i++) {
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }
}