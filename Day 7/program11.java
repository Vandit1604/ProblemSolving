import java.util.Scanner;

public class program11 {
    public static void removeWhitespace(String name){
        StringBuilder sb= new StringBuilder(name);
        int k=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=' '){
                char replace=sb.charAt(i);
                sb.setCharAt(k,replace);
                k++;
            }

        }
        System.out.println(sb.substring(0,k));
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string.");
        String name =input.nextLine();
        removeWhitespace(name);

    }
}
