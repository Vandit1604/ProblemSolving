import java.util.Scanner;
// note this code only for apply on the words not for the whole sentences;
// because their is no any particular conditon is given.
public class problem8 {
    public static void main(String[]args){
        System.out.println("Enter the word for the prefix.");
      Scanner input =new Scanner(System.in);
      String name=input.nextLine();
      int count=0;
      for(char c: name.toCharArray()){
          count++;
      }
      for(int j=1;j<=count;j++) {
          for (int i = 0; i < j; i++) {
              System.out.print(name.charAt(i));
          }
          System.out.println();
      }

    }
}
