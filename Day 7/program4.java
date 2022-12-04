import java.util.Scanner;

public class program4 {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the paragraph");
        int count=0;
        int detector=0;
        String paragraph=input.nextLine();
        for(char c: paragraph.toCharArray()){
            count++;
        }
        for(int i=0;i<count;i++){
            if((int)' '==(int)paragraph.charAt(i)){
                detector++;
            }
        }
        System.out.println(detector+1+" words");
    }
}
